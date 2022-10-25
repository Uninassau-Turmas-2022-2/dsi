package br.imaginefree.calculadoraalcoolgasolina.ui

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.imaginefree.calculadoraalcoolgasolina.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalculate.setOnClickListener {
            var gasolina = binding.edtGasolinaValue.text.toString().toDoubleOrNull()
            var etanol = binding.edtEtanolValue.text.toString().toDoubleOrNull()

            gasolina?.let { gas ->
                etanol?.let { et ->
                    if (gas * 0.7 <= etanol) {
                        goToNextScreen("Use gasolina!", true)
                    } else {
                        goToNextScreen("Use Etanol!", false)
                    }
                } ?: run {
                    Snackbar.make(this, binding.root, "meu texto", Snackbar.LENGTH_SHORT).show()
                    Toast.makeText(this, "Valor de etanol inválido!", Toast.LENGTH_SHORT).show()
                }
            } ?: run {
                Toast.makeText(this, "Valor de gasolina inválido!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun goToNextScreen(resultado: String, isGasolina: Boolean){
        val intent = Intent(this@MainActivity, TelaDeResultado::class.java)
        intent.putExtra(RESULT_GAS_ETANOL, resultado)
        intent.putExtra(IS_GASOLINA, isGasolina)
        startActivity(intent)
    }

    companion object {
        const val RESULT_GAS_ETANOL = "RESULT_GAS_ETANOL"
        const val IS_GASOLINA = "IS_GASOLINA"
    }

}