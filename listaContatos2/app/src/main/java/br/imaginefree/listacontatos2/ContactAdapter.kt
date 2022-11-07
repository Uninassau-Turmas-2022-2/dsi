package br.imaginefree.listacontatos2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.imaginefree.listacontatos2.databinding.ItemContactBinding

class ContactAdapter(
    val contactList: ArrayList<Contact>
): RecyclerView.Adapter<ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        val binding = ItemContactBinding.bind(view)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contactList[position])
    }

    override fun getItemCount(): Int = contactList.size

}