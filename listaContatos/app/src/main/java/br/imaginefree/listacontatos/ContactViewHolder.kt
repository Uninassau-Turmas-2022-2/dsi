package br.imaginefree.listacontatos

import androidx.recyclerview.widget.RecyclerView
import br.imaginefree.listacontatos.databinding.ContactItemBinding

class ContactViewHolder(
    val contactItemBinding: ContactItemBinding
) : RecyclerView.ViewHolder(contactItemBinding.root) {

    fun bind(contact: Contact){
        contactItemBinding.name.text = "Nome: ${contact.name}"
        contactItemBinding.phone.text = "Telefone: ${contact.phone}"
    }

}