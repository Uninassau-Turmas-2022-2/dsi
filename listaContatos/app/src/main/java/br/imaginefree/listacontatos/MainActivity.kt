package br.imaginefree.listacontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.imaginefree.listacontatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val contacts: ArrayList<Contact> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addContact.setOnClickListener {
            val contact = Contact(
                binding.edtName.text.toString(),
                binding.edtPhone.text.toString()
            )
            contacts.add(contact)
            binding.contactList.adapter?.notifyItemChanged(contacts.size - 1)
        }

        binding.contactList.adapter = ContactAdapter(
            contacts
        )
        binding.contactList.layoutManager = LinearLayoutManager(this)


    }

}