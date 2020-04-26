package com.example.nfc.view

import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.nfc.presenter.LoginviewPresenter
import com.example.nfc.view.ILoginview
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() ,ILoginview{

    internal  lateinit var  loginviewPresenter: LoginviewPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //init
        loginviewPresenter = LoginviewPresenter(iLoginview =this)
        //Event
        btn_login.setOnClickListener{
            loginviewPresenter.onLogin(edt_username.text.toString(),edt_password.text.toString())
        }
    }


    override fun onLoginSuccess(message: String) {
       Toasty.success(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toasty.error(this,message,Toast.LENGTH_SHORT).show()
    }
    class MainActivity : AppCompatActivity() {
        private var mButton :Button
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            mButton = findViewById(R.id.button_send)
            mButton.setOnClickListener(object : OnClickListener() {
                fun onClick(view: View?) {
                    intent
                }
            })
        }
    }
}
