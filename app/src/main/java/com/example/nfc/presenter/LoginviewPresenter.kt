package com.example.nfc.presenter

import com.example.nfc.model.User
import com.example.nfc.view.ILoginview

class LoginviewPresenter(internal var iLoginview: ILoginview):ILoginviewPresenter {
    override fun onLogin(username: String, password: String) {
        val user = User(username,password)
        val loginCode = user.isDataValid()
        if (loginCode ==0)
            iLoginview.onLoginError("username is empty")
        else if (loginCode == 1)
            iLoginview.onLoginError("wrong email")
        else if (loginCode == 2)
            iLoginview.onLoginError("Password must be greater than 6 ")
        else
            iLoginview.onLoginSuccess("Login failed")

    }

}