package com.example.nfc.model

import android.text.TextUtils
import android.util.Patterns

class User(override val username:String ,override val password:String) :IUser {
    override fun isDataValid(): kotlin.Int{
        if(TextUtils.isEmpty(username))
            return 0 // email empty
        else if (Patterns.EMAIL_ADDRESS.matcher(username).matches())
            return 1 // wrong patterns
        else if (password.length <= 6)
            return  2
        else {
            // password too short
            return  -1
        } //success

    }

}