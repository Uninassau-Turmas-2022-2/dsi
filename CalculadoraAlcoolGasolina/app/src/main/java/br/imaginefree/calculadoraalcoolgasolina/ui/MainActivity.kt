package br.imaginefree.calculadoraalcoolgasolina.ui

import android.R
import android.os.Bundle
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
                        binding.txtResult.text = "Use gasolina!"
                    } else {
                        binding.txtResult.text = "Use Etanol!"
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
}