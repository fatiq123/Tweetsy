package com.example.tweetsy.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

/*@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "registration") {
        composable(route = "registration") {
            *//*Registration(navController = navController)*//*
            RegistrationScreen {
                navController.navigate("home/${it}")
            }
        }
        composable(route = "login") {
            Login()
        }
        composable(
            route = "home/{email}",
            arguments = listOf(navArgument("email") {
                type = NavType.StringType
            })
        ) {
            val email = it.arguments?.getString("email")
            Home(email)
        }
    }
}

@Composable
fun RegistrationScreen(*//*navController: NavController,*//*onClick: (email: String) -> Unit) {
    Text(
        text = "Registration",
        style = MaterialTheme.typography.displayMedium,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                *//*navController.navigate("login")*//*
                onClick("fatiqhussnain1@gmail.com")
            },
        textAlign = TextAlign.Center
    )
}

@Composable
fun Login() {
    Text(
        text = "Login",
        style = MaterialTheme.typography.displayMedium,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun Home(email: String?) {
    Text(
        text = "Home - $email",
        style = MaterialTheme.typography.displayMedium,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}*/
