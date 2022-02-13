package com.ubaya.week1

class User (var _username: String, var _password: String) {
    override fun toString(): String {
        return "My username is $_username and my password is $_password"
    }

    fun Register(): String{
        return "Registration Successful"
    }
}