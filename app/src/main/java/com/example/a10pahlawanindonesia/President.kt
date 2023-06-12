package com.example.a10pahlawanindonesia

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class President (
    var name: String,
    var description: String,
    var photo: Int,
    var country: String,
    var periode: String
        ) : Parcelable