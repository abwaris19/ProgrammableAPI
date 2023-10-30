package com.zurich.programmableapi.UI.auth.persistance

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zurich.programmableapi.UI.auth.api.auth.model.AuthToken

@Dao
interface AuthTokenDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert (authToken: AuthToken): Long

    @Query("UPDATE auth_token SET token = null WHERE account_pk = :pk")
    fun nullifyToken(pk: Int): Int


}