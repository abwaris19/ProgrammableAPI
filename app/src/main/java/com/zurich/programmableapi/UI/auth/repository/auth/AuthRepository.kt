package com.zurich.programmableapi.UI.auth.repository.auth

import com.zurich.programmableapi.UI.auth.api.auth.OpenApiAuthService
import com.zurich.programmableapi.UI.auth.persistance.AccountPropertiesDao
import com.zurich.programmableapi.UI.auth.persistance.AuthTokenDao
import com.zurich.programmableapi.UI.auth.session.SessionManager

class AuthRepository
constructor(
   val authTokenDao: AuthTokenDao,
   val accountPropertiesDao: AccountPropertiesDao,
   val openApiAuthService: OpenApiAuthService,
   val sessionManager: SessionManager
)