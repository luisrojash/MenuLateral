package com.joedayz.menulateral.fragmentos

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

import com.joedayz.menulateral.R
import com.joedayz.recicladores.model.Persona

/**
 * A simple [Fragment] subclass.
 */
class DetalleAlumnosFragment : Fragment() {

    lateinit var persona: Persona

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detalle_alumnos, container, false)
        val imagenDetalle = view.findViewById<ImageView>(R.id.imagenDetalle)
        val nombreDetalle  =view.findViewById<TextView>(R.id.nombreDetalle)

        persona =getBundle()

        imagenDetalle.setImageDrawable(ContextCompat.getDrawable(requireContext(),persona.imagen))
        nombreDetalle.text = persona.nombre

        return view
    }

    private fun getBundle():Persona{
        val persona : Persona = arguments?.getParcelable("DETALLE")!!
        return persona
    }

    override fun onSaveInstanceState(estado: Bundle) {
        Log.i("ConteoActivity", "onSaveInstanceState")
        estado.putParcelable("DETALLE", persona)
        super.onSaveInstanceState(estado)
    }

   /* override fun onRestoreInstanceState(estado: Bundle) {
        super.onRestoreInstanceState(estado)
        Log.i("ConteoActivity", "onRestoreInstanceState")
        persona = estado.getInt("cuenta")
        textViewConteo.text = "" + conteo
    }*/

}
