package com.app.intrumentedtest.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Information(
        val title: String,
        val subtitle: String
) : Parcelable
