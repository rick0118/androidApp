package com.example.nfc.model

interface IUser {
    val username:String
    val password:String
    fun isDataValid ():Int
    //register_var
    val Bd:Int
    val Sex:Int
    val Email:String
    val IdNumber:Int
    val Nicknames:String


}