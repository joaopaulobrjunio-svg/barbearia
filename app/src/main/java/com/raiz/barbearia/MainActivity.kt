package com.raiz.barbearia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.raiz.barbearia.ui.screens.AuthScreen
import com.raiz.barbearia.ui.theme.BarbeariaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BarbeariaTheme {
                AuthScreen()
            }
        }
    }
}