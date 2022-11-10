package br.imaginefree.myharraypotterapp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Spells(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("description")
    val description: String? = null
): Parcelable