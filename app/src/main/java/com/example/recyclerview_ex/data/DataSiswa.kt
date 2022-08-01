package com.example.recyclerview_ex.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataSiswa(
    val nama : String?,
    val umur : String?
) : Parcelable