package com.examen.jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.examen.jetpack_compose.interfaces.LoginForm
import com.examen.jetpack_compose.ui.theme.MyLoginApplicationTheme

/*https://medium.com/@WhiteBatCodes/simple-login-page-in-jetpack-compose-9c92af690234*/
class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent{
            MyLoginApplicationTheme {
                LoginForm()
            }
        }
    }
}