package br.imaginefree.myharraypotterapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.imaginefree.myharraypotterapp.databinding.ItemSpellBinding

class SpellsAdapter(private val spells: ArrayList<Spells>): RecyclerView.Adapter<SpellViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpellViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_spell, parent, false)
        val binding = ItemSpellBinding.bind(view)
        return SpellViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SpellViewHolder, position: Int) {
        holder.bind(spells[position])
    }

    override fun getItemCount(): Int = spells.size


}