package com.joedayz.menulateral.fragmentos.adapter.holder

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.joedayz.menulateral.interfaz.PruebaInterface
import com.joedayz.recicladores.model.Persona
import kotlinx.android.synthetic.main.item_persona.view.*

    class PersonaHolder(itemView: View,val listener:PruebaInterface) : RecyclerView.ViewHolder(itemView) {

    fun bind(persona: Persona) {
        itemView.textViewNombre.text = persona.nombre
        itemView.textViewNumero.text = persona.numero
        itemView.imageView.setBackgroundResource(persona.imagen)
        itemView.cardPersona.setOnClickListener {
            listener.onClickOption(persona)
            //Toast.makeText(itemView.context, "" + persona.nombre, Toast.LENGTH_SHORT).show()
        }
    }

}