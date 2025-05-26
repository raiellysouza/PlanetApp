package com.example.planetapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.example.planetapp.navigation.NavGraph
import com.example.planetapp.ui.theme.PlanetAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Edge-to-edge support
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            PlanetAppTheme {
                NavGraph(
                    onSettingsClick = { },
                    onHelpClick = { }
                )
            }
        }
    }
}
