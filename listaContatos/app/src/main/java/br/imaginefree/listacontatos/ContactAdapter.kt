package br.imaginefree.listacontatos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.imaginefree.listacontatos.databinding.ContactItemBinding

class ContactAdapter(
    val contacts: ArrayList<Contact>
): RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        val contactItemBinding = ContactItemBinding.bind(view)
        return ContactViewHolder(contactItemBinding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contacts[position])
    }

    override fun getItemCount() = contacts.size


}