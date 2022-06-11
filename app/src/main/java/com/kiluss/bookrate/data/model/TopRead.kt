package com.kiluss.bookrate.data.model

import com.google.gson.annotations.SerializedName

data class TopRead(
    @SerializedName("iD_Book") var iDBook: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("picture") var picture: String? = null,
    @SerializedName("readed") var read: Int? = null
)
