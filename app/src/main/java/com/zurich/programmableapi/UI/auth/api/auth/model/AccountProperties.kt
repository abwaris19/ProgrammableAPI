package com.zurich.programmableapi.UI.auth.api.auth.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity (tableName = "account_properties")
data class AccountProperties(


    @SerializedName("pk")
    @Expose
    @PrimaryKey (autoGenerate = false)
    @ColumnInfo(name = "pk")
    var pk: Int,

    @SerializedName("email")
    @Expose
    @PrimaryKey (autoGenerate = false)
    @ColumnInfo(name = "email")
    var email: String,

    @SerializedName("username")
    @Expose
    @PrimaryKey (autoGenerate = false)
    @ColumnInfo(name = "username")
    var username: String,



)