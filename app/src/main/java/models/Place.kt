package models

import java.io.Serializable

data class Place(val title: String, val descripiton: String, val latitude: Double, val longtitude: Double) : Serializable