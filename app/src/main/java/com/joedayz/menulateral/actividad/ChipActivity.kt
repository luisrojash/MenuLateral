package com.joedayz.menulateral.actividad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.joedayz.menulateral.R
import kotlinx.android.synthetic.main.activity_chip.*

class ChipActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chip)

        chipJava.setOnCloseIconClickListener {
            Toast.makeText(applicationContext,"Eliminar Java",Toast.LENGTH_LONG).show()
        }
    }
}
