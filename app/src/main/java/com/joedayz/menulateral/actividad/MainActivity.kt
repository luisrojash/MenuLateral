package com.joedayz.menulateral.actividad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.joedayz.menulateral.R
import com.joedayz.menulateral.fragmentos.DetalleAlumnosFragment
import com.joedayz.menulateral.fragmentos.InformacionFragment
import com.joedayz.menulateral.fragmentos.ListadoAlumnosFragment
import com.joedayz.menulateral.fragmentos.OtrosFragment
import com.joedayz.menulateral.interfaz.PruebaInterface
import com.joedayz.recicladores.model.Persona
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.menu_lateral.view.*
import kotlinx.android.synthetic.main.toolbar_main.view.*

class MainActivity : AppCompatActivity(), PruebaInterface{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        include_toolbar.botonMenu.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        menu_lateral.listadoAlumnos.setOnClickListener { onClickMenuLateral(1) }
        menu_lateral.informes.setOnClickListener { onClickMenuLateral(2) }
        menu_lateral.otros.setOnClickListener { onClickMenuLateral(3) }
    }

    private fun onClickMenuLateral(tipo: Int) {
        var fragment = Fragment()
        when (tipo) {
            1 -> fragment = ListadoAlumnosFragment()
            2 -> fragment = InformacionFragment()
            3 -> fragment = OtrosFragment()
        }
        supportFragmentManager.beginTransaction().replace(R.id.frame, fragment).commit()
        closeDrawer()
    }

    private fun closeDrawer() {
        drawerLayout.closeDrawer(GravityCompat.START)
    }

    override fun onClickOption(persona: Persona) {
        val fragment = DetalleAlumnosFragment()
        val bundle = Bundle()
        bundle.putParcelable("DETALLE",persona)
        fragment.arguments=bundle
        supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).addToBackStack("").commit()
        //Toast.makeText(baseContext,"$persona",Toast.LENGTH_LONG).show()
    }

    override fun onClickPrueba(titulo: String) {
        Toast.makeText(baseContext,titulo,Toast.LENGTH_LONG).show()
    }
}
