package com.joedayz.menulateral.fragmentos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joedayz.menulateral.R
import com.joedayz.menulateral.fragmentos.adapter.holder.PersonaHolder
import com.joedayz.menulateral.interfaz.PruebaInterface
import com.joedayz.recicladores.model.Persona

class PersonaAdapter(var listPersonas: MutableList<Persona>,val listener :PruebaInterface) : RecyclerView.Adapter<PersonaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_persona, parent, false)
        return PersonaHolder(itemView,listener)
    }

    override fun getItemCount(): Int {
        return listPersonas.size
    }

    override fun onBindViewHolder(holder: PersonaHolder, position: Int) {
        val persona = listPersonas.get(position)
        holder.bind(persona)
    }

}