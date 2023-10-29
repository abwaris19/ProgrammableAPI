package com.zurich.programmableapi.UI.auth

import androidx.lifecycle.ViewModel
import com.zurich.programmableapi.UI.auth.repository.auth.AuthRepository

class AuthViewModel
constructor(
    val authRepository: AuthRepository
): ViewModel()
{

}