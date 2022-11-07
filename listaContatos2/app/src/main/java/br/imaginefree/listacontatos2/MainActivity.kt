package br.imaginefree.listacontatos2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import br.imaginefree.listacontatos2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addContact.setOnClickListener {
            val intentGoToAddContact = Intent(this, AddContactActivity::class.java)
            startActivity(intentGoToAddContact)
        }

        binding.seeContactList.setOnClickListener {
            val intentGoToListActivity = Intent(this, ContactListActivity::class.java)
            startActivity(intentGoToListActivity)
        }
    }
}