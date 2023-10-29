package com.zurich.programmableapi.UI.auth.session

import android.app.Application
import com.zurich.programmableapi.UI.auth.persistance.AuthTokenDao

class SessionManager
constructor(val authTokenDao: AuthTokenDao,
            val application: Application
)
{

}