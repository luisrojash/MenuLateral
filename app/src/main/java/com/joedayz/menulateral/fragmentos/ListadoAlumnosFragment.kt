package com.joedayz.menulateral.fragmentos

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.joedayz.menulateral.R
import com.joedayz.menulateral.fragmentos.adapter.PersonaAdapter
import com.joedayz.menulateral.interfaz.PruebaInterface
import com.joedayz.recicladores.model.Persona

/**
 * A simple [Fragment] subclass.
 */
class ListadoAlumnosFragment: Fragment() {


    lateinit var listener: PruebaInterface

    override fun onAttach(activity: Context) {
        super.onAttach(activity)

        if (activity is PruebaInterface) {
            listener = activity
        } else {
            throw RuntimeException(context!!.toString() + " debe implementar OnNumeroAleatorio")
        }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view  =inflater.inflate(R.layout.fragment_listado_alumnos, container, false)

        val recycler = view.findViewById<RecyclerView>(R.id.reciclador)
        val titulo =view.findViewById<TextView>(R.id.titulo)

        titulo.setOnClickListener {
            listener.onClickPrueba("correcto")
        }

        recycler.adapter = PersonaAdapter(obtenerListaPersonas(),listener)
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.setHasFixedSize(true)
        return view
    }

    fun obtenerListaPersonas(): MutableList<Persona> {
        val mutableListPersona = mutableListOf<Persona>()
        mutableListPersona.add(Persona("Luis", "963108545", R.drawable.ic_batman,"https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/50dad8da-ce58-4540-a042-1313d34b7e56/dde1y6i-60031d4a-ff0c-4d32-808b-9c8b78eeb313.jpg/v1/fill/w_1000,h_799,q_70,strp/dragon_ball_super_by_dt501061_dde1y6i-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3siaGVpZ2h0IjoiPD0yODczIiwicGF0aCI6IlwvZlwvNTBkYWQ4ZGEtY2U1OC00NTQwLWEwNDItMTMxM2QzNGI3ZTU2XC9kZGUxeTZpLTYwMDMxZDRhLWZmMGMtNGQzMi04MDhiLTljOGI3OGVlYjMxMy5qcGciLCJ3aWR0aCI6Ijw9MzU5MiJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.u7CsMDKExVukwVE7eYnP04fQJ_4YY80O1FRK0Nd0tQE"))
        mutableListPersona.add(Persona("César", "989893374", R.drawable.ic_lego,"https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/10522bf5-e042-4fa1-abea-6d563895ee34/ddbop2d-c413e343-cdaa-4561-9a17-7e3c2b075332.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3sicGF0aCI6IlwvZlwvMTA1MjJiZjUtZTA0Mi00ZmExLWFiZWEtNmQ1NjM4OTVlZTM0XC9kZGJvcDJkLWM0MTNlMzQzLWNkYWEtNDU2MS05YTE3LTdlM2MyYjA3NTMzMi5qcGcifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6ZmlsZS5kb3dubG9hZCJdfQ.bIRRfp5r2e-HOqpdbvjqv8mkkbnOXrUdoksxri03dJA"))
        mutableListPersona.add(Persona("Cristian", "955816355", R.drawable.ic_spiderman,"https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/50dad8da-ce58-4540-a042-1313d34b7e56/dd9s4z6-3515d090-6eb1-415e-ba7c-331404caf35e.jpg/v1/fill/w_920,h_868,q_70,strp/dragon_ball_super_by_dt501061_dd9s4z6-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3siaGVpZ2h0IjoiPD0yMzU4IiwicGF0aCI6IlwvZlwvNTBkYWQ4ZGEtY2U1OC00NTQwLWEwNDItMTMxM2QzNGI3ZTU2XC9kZDlzNHo2LTM1MTVkMDkwLTZlYjEtNDE1ZS1iYTdjLTMzMTQwNGNhZjM1ZS5qcGciLCJ3aWR0aCI6Ijw9MjUwMCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.yGSw0patNAw5Ahf_AzA6ErbWItmDatjHfRY3wpTBViM"))
        mutableListPersona.add(Persona("Dario", "951328504", R.drawable.ic_superman,"https://www.alfabetajuega.com/wp-content/uploads/2019/01/goku-nino-nube-e1546512190734.jpg"))
        mutableListPersona.add(Persona("Jhonson", "957021616", R.drawable.ic_batman, "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/50dad8da-ce58-4540-a042-1313d34b7e56/dde1y6i-60031d4a-ff0c-4d32-808b-9c8b78eeb313.jpg/v1/fill/w_1000,h_799,q_70,strp/dragon_ball_super_by_dt501061_dde1y6i-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3siaGVpZ2h0IjoiPD0yODczIiwicGF0aCI6IlwvZlwvNTBkYWQ4ZGEtY2U1OC00NTQwLWEwNDItMTMxM2QzNGI3ZTU2XC9kZGUxeTZpLTYwMDMxZDRhLWZmMGMtNGQzMi04MDhiLTljOGI3OGVlYjMxMy5qcGciLCJ3aWR0aCI6Ijw9MzU5MiJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.u7CsMDKExVukwVE7eYnP04fQJ_4YY80O1FRK0Nd0tQE"))
        mutableListPersona.add(Persona("Jorge", "994694061", R.drawable.ic_lego,"https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/50dad8da-ce58-4540-a042-1313d34b7e56/dd9s4z6-3515d090-6eb1-415e-ba7c-331404caf35e.jpg/v1/fill/w_920,h_868,q_70,strp/dragon_ball_super_by_dt501061_dd9s4z6-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3siaGVpZ2h0IjoiPD0yMzU4IiwicGF0aCI6IlwvZlwvNTBkYWQ4ZGEtY2U1OC00NTQwLWEwNDItMTMxM2QzNGI3ZTU2XC9kZDlzNHo2LTM1MTVkMDkwLTZlYjEtNDE1ZS1iYTdjLTMzMTQwNGNhZjM1ZS5qcGciLCJ3aWR0aCI6Ijw9MjUwMCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.yGSw0patNAw5Ahf_AzA6ErbWItmDatjHfRY3wpTBViM"))
        mutableListPersona.add(Persona("Jose", "994694061", R.drawable.ic_spiderman,"https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/50dad8da-ce58-4540-a042-1313d34b7e56/dd9s4z6-3515d090-6eb1-415e-ba7c-331404caf35e.jpg/v1/fill/w_920,h_868,q_70,strp/dragon_ball_super_by_dt501061_dd9s4z6-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3siaGVpZ2h0IjoiPD0yMzU4IiwicGF0aCI6IlwvZlwvNTBkYWQ4ZGEtY2U1OC00NTQwLWEwNDItMTMxM2QzNGI3ZTU2XC9kZDlzNHo2LTM1MTVkMDkwLTZlYjEtNDE1ZS1iYTdjLTMzMTQwNGNhZjM1ZS5qcGciLCJ3aWR0aCI6Ijw9MjUwMCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.yGSw0patNAw5Ahf_AzA6ErbWItmDatjHfRY3wpTBViM"))
        return mutableListPersona
    }
}
