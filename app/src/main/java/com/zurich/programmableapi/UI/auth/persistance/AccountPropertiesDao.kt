package com.zurich.programmableapi.UI.auth.persistance

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zurich.programmableapi.UI.auth.api.auth.model.AccountProperties

@Dao
interface AccountPropertiesDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAndReplace(accountProperties: AccountProperties): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun  insertOrIgnore(accountProperties: AccountProperties): Long

    @Query(value = "SELECT *FROM account_properties WHERE pk = :pk")
    fun searchByPk(pk: Int): AccountProperties?

    @Query(value = "SELECT *FROM account_properties  WHERE email = :email")
    fun searchByEmail (email: String): AccountProperties?



}