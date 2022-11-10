package br.imaginefree.myharraypotterapp

import androidx.recyclerview.widget.RecyclerView
import br.imaginefree.myharraypotterapp.databinding.ItemSpellBinding

class SpellViewHolder(private val binding: ItemSpellBinding) :
    RecyclerView.ViewHolder(binding.root) {

        fun bind(spells: Spells){
            binding.name.text = spells.name
            binding.description.text = spells.description
        }
}