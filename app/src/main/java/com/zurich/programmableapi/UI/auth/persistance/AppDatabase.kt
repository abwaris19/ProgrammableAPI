package com.zurich.programmableapi.UI.auth.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zurich.programmableapi.UI.auth.api.auth.model.AccountProperties
import com.zurich.programmableapi.UI.auth.api.auth.model.AuthToken


@Database(entities = [AuthToken::class, AccountProperties::class], version = 1)
abstract class AppDatabase: RoomDatabase() {


    abstract fun getAuthTokenDao(): AuthTokenDao

    abstract fun getAccountPropertiesDao(): AccountPropertiesDao


    companion object {
        const val DATABASE_NAME ="app_db"
    }
}