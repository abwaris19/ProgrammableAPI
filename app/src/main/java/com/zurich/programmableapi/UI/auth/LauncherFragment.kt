package com.zurich.programmableapi.UI.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.zurich.programmableapi.R
import com.zurich.programmableapi.databinding.FragmentLauncherBinding

class LauncherFragment : Fragment() {


    private lateinit var launcherBinding: FragmentLauncherBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        launcherBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_launcher, container, false);
        
        return launcherBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        launcherBinding.login.setOnClickListener {
            navLogin();
        }

        launcherBinding.register .setOnClickListener {
            navRegister()
        }

        launcherBinding.forgotPassword .setOnClickListener {
            navForgetPassword();
        }

    }

    private fun navForgetPassword() {
        findNavController().navigate(R.id.action_launcherFragment_to_forgotFragment)
    }

    private fun navRegister() {
        findNavController().navigate(R.id.action_launcherFragment_to_registerFragment)
    }

    private fun navLogin() {
        findNavController().navigate(R.id.action_launcherFragment_to_loginFragment)
    }
}