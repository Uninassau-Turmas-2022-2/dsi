package br.imaginefree.listacontatos2

import android.content.res.Resources
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import br.imaginefree.listacontatos2.databinding.ItemContactBinding

class ContactViewHolder(
    private val binding: ItemContactBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(contact: Contact) {
        binding.name.text = binding.root.context.resources.getString(
            R.string.item_contact_name,
            contact.name
        )
        binding.phone.text = binding.root.context.resources.getString(
            R.string.item_contact_phone,
            contact.phone
        )
    }

}