package com.joedayz.recicladores.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Persona(
    var nombre: String,
    var numero: String,
    var imagen: Int,
    var imagenUrl: String
) : Parcelable