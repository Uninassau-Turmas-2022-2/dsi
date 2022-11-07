package br.imaginefree.listacontatos2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.imaginefree.listacontatos2.databinding.ActivityContactListBinding

class ContactListActivity : AppCompatActivity() {

    lateinit var binding: ActivityContactListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contactList.adapter = ContactAdapter(contacts)
        binding.contactList.layoutManager = LinearLayoutManager(this)
    }
}