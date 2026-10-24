package com.example.foodrecipe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutScreen() {

    var selectedPage by remember {
        mutableStateOf("")
    }

    when (selectedPage) {

        "Contact Us" -> {
            ContactUsScreen(
                onBack = {
                    selectedPage = ""
                }
            )
            return
        }

        "About App" -> {
            AboutAppScreen(
                onBack = {
                    selectedPage = ""
                }
            )
            return
        }

        "Developer Info" -> {
            DeveloperInfoScreen(
                onBack = {
                    selectedPage = ""
                }
            )
            return
        }

        "Privacy Policy" -> {
            PrivacyPolicyScreen(
                onBack = {
                    selectedPage = ""
                }
            )
            return
        }

    }

    val aboutItems = listOf(
        "Contact Us",
        "About App",
        "Developer Info",
        "Privacy Policy"
    )

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {

            items(aboutItems) { item ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 6.dp),
                    onClick = {
                        selectedPage = item
                    }
                ) {

                    Text(
                        text = item,
                        modifier = Modifier.padding(20.dp),
                        fontSize = 18.sp
                    )

                }

            }

        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .navigationBarsPadding(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Food Recipe App",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text("Version 1.0.0")

                Spacer(modifier = Modifier.height(6.dp))

                HorizontalDivider()

                Spacer(modifier = Modifier.height(8.dp))

                Text("© 2026 All Rights Reserved")

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Developed by Mamun Hasan",
                    fontWeight = FontWeight.Bold
                )

            }

        }

    }

}
@Composable
fun ContactUsScreen(onBack: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Button(
            onClick = onBack
        ) {
            Text("← Back")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "📞 Contact Us",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Text(
                    text = "📧 Email",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text("supportfoodrecipe111@gmail.com")

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "📱 Phone",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text("+8801961328969")

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "🌐 Facebook",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text("facebook.com/foodrecipeapp")

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "📷 Instagram",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text("instagram.com/foodrecipe_111")

                Spacer(modifier = Modifier.height(16.dp))



                Text(
                    text = "📍 Location",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text("Dhaka, Bangladesh")

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = " Need Help?",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text("Contact us anytime.")
        Text("We'll Support you 24 hours.")

    }

}
@Composable
fun AboutAppScreen(onBack: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Button(onClick = onBack) {
            Text("← Back")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "About App",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = """
Food Recipe App is design For cook Every delicious recipes easily.

Features:
• Browse a variety of recipes
• Easy step-by-step cooking instructions
• Quick recipe search

Our goal is to make cooking easier, faster, and more enjoyable for everyone.
            """.trimIndent()
        )

    }

}

@Composable
fun DeveloperInfoScreen(onBack: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Button(onClick = onBack) {
            Text("← Back")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Developer Info",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Developer : Mamun Hasan")
        Text("Country : Bangladesh")
        Text("Role : Web Developer")
        Text("App Version : 1.0.0")

    }

}

@Composable
fun PrivacyPolicyScreen(onBack: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Button(onClick = onBack) {
            Text("← Back")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Privacy Policy",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = """
We respect your privacy.

• We do not collect personal information without your permission.
• Your data is kept secure.
• This app is intended for educational and recipe browsing purposes.

By using this app, you agree to this privacy policy.
            """.trimIndent()
        )

    }

}



