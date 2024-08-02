package com.example.navigationwithcompose.Utils

import android.content.Context
import android.widget.Toast

object Routes {

    var loginScreen = "Login"
    var dashboardScreen = "Dashboard"
}

fun isValidate(email: String, password: String, context: Context): Boolean {
    var returnValue = true
    var message = ""

    if (password.isBlank() || password.isEmpty()) {
        message = "Please enter password"
        returnValue = false
    }

    if (email.isBlank() || email.isEmpty()) {
        message = "Please enter email"
        returnValue = false
    }

    if (!returnValue) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    return returnValue
}