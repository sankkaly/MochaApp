package com.example.mochaapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mochaapp.R


@Composable
fun StartScreen (navController: NavHostController){

    Column (modifier = Modifier.fillMaxSize()

    ){
        Image(painter = painterResource(id = R.drawable.coffee),
            contentDescription = "StartScreenImage",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth())
        Column (modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff0c0f14)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){

            Text(text = "FIND THE BEST \nCOFFEE FOR YOU", style = TextStyle(
               color = Color.White,
                fontSize = 35.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Medium
            ))
            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = { navController.navigate("NavigationScreen")},
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFD17842)

                )
            ) {
                Text(text = "Proceed")
            }

        }
    }
}