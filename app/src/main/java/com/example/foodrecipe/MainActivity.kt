package com.example.foodrecipe
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.foodrecipe.screens.AboutScreen
import com.example.foodrecipe.screens.FavoriteScreen
import com.example.foodrecipe.screens.RecipeScreen
import com.example.foodrecipe.screens.HomeScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            MaterialTheme(

                colorScheme = darkColorScheme(
                    primary = Cyan,
                    secondary = Cyan,
                    background = AppBackground,
                    surface = AppCard,
                    onBackground = Color.White,
                    onSurface = Color.White
                )

            ) {

                RecipeApp()

            }

        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeApp() {

    var selectedScreen by remember {
        mutableStateOf("Home")
    }

    Scaffold(

        containerColor = AppBackground,

        topBar = {

            CenterAlignedTopAppBar(

                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = AppCard,
                    titleContentColor = Cyan
                ),

                title = {

                    Text(
                        text = "🍽 Food Recipe",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )

                }

            )

        },

        bottomBar = {

            NavigationBar(
                containerColor = AppCard
            ) {

                NavigationBarItem(
                    selected = selectedScreen == "Home",
                    onClick = { selectedScreen = "Home" },
                    icon = { Icon(Icons.Default.Home, null) },
                    label = { Text("Home") }
                )

                NavigationBarItem(
                    selected = selectedScreen == "Recipe",
                    onClick = { selectedScreen = "Recipe" },
                    icon = { Icon(Icons.Default.List, null) },
                    label = { Text("Recipe") }
                )

                NavigationBarItem(
                    selected = selectedScreen == "Favorite",
                    onClick = { selectedScreen = "Favorite" },
                    icon = { Icon(Icons.Default.Favorite, null) },
                    label = { Text("Favorite") }
                )

                NavigationBarItem(
                    selected = selectedScreen == "About",
                    onClick = { selectedScreen = "About" },
                    icon = { Icon(Icons.Default.Info, null) },
                    label = { Text("About") }
                )

            }

        }

    ) { padding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AppBackground)
                .padding(padding)
        ) {

            when (selectedScreen) {

                "Home" -> HomeScreen()

                "Recipe" -> RecipeScreen()

                "Favorite" -> FavoriteScreen()

                "About" -> AboutScreen()

            }

        }

    }

}