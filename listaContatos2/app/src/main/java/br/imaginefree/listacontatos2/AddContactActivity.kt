package br.imaginefree.listacontatos2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.imaginefree.listacontatos2.databinding.ActivityAddContactBinding
import com.google.android.material.snackbar.Snackbar

class AddContactActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addContact.setOnClickListener {
            val contact = Contact(
                binding.name.text.toString(),
                binding.phone.text.toString()
            )
            contacts.add(contact)
            binding.resultado.text = "Você adicionou um contato!"
        }
    }

}