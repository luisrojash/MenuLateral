package com.joedayz.menulateral.actividad

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.joedayz.menulateral.R
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu_calificaciones ->Toast.makeText(baseContext,"Calificaciones",Toast.LENGTH_LONG).show()
                R.id.menu_asistencia ->Toast.makeText(baseContext,"Asistencia",Toast.LENGTH_LONG).show()
                R.id.menu_edades ->Toast.makeText(baseContext,"Edades",Toast.LENGTH_LONG).show()
                R.id.menu_puesto ->Toast.makeText(baseContext,"Puesto",Toast.LENGTH_LONG).show()
            }
             true
        }
    }
}
