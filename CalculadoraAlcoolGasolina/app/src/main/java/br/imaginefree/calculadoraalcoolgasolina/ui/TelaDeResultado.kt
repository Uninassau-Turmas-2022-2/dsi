package br.imaginefree.calculadoraalcoolgasolina.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.imaginefree.calculadoraalcoolgasolina.R
import br.imaginefree.calculadoraalcoolgasolina.databinding.ActivityTelaDeResultadoBinding

class TelaDeResultado : AppCompatActivity() {

    lateinit var binding: ActivityTelaDeResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaDeResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = intent.extras?.getString(MainActivity.RESULT_GAS_ETANOL)
        binding.textView.text = text
        val isGasolina = intent.extras?.getBoolean(MainActivity.IS_GASOLINA)
        if (isGasolina == true){
            binding.imageView.setImageResource(R.drawable.gasolina)
        }else {
            binding.imageView.setImageResource(R.drawable.etanol)
        }

    }
}