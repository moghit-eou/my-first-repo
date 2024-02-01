package com.example.calculatrice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.calculatrice.ui.theme.CalculatriceTheme
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          home_screen()
        }
    }
}

@Composable
fun home_screen(){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.rearcolor)),
        verticalArrangement = Arrangement.SpaceEvenly


    ){

        Text(
            text = "AAAAAAA" ,
            modifier = Modifier.fillMaxWidth() ,
            style = TextStyle( color = Color.White , fontSize = 30.sp )
        )

        Column( modifier = Modifier.fillMaxWidth()
            , horizontalAlignment = Alignment.Start
        ) {
            Row(modifier = Modifier.fillMaxWidth()){

                create_button(symbol = "1" )
                create_button(symbol = "2" )
                create_button(symbol = "3" )
                create_symbol(symbol = "+")
            }

            Row(modifier = Modifier.fillMaxWidth()){
                create_button(symbol = "4" )
                create_button(symbol = "5" )
                create_button(symbol = "6" )
                create_symbol(symbol = "-")

            }

            Row(modifier = Modifier.fillMaxWidth()){
                create_button(symbol = "7" )
                create_button(symbol = "8" )
                create_button(symbol = "9" )
                create_symbol(symbol = "x")


            }
           
            Button(onClick = { /*TODO*/ } , modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.symbols_color))
            ) {
                Text(text = "=" , fontSize = 20.sp)
            }

            Button(onClick = { /*TODO*/ } , modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(top = 20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.symbols_color))
            ) {
                Text(text = "erase" , fontSize = 20.sp)
            }


        }


    }
}
@Composable
fun create_button( symbol:String )  {
   Button(
       onClick = { /*TODO*/ } ,
       modifier = Modifier
           .width(90.dp)
           .height(90.dp),
       shape = RoundedCornerShape(150.dp) ,
       colors = ButtonDefaults.buttonColors( containerColor = colorResource(id = R.color.teal_700),

       )
       ) {
       Text( text = symbol , fontSize = 20.sp)
   }
}
@Composable
fun create_symbol( symbol:String ){
     Button(
         onClick = { /*TODO*/ } ,
         modifier = Modifier
             .width(120.dp)
             .height(90.dp),
         colors = ButtonDefaults.buttonColors( containerColor = colorResource(id = R.color.symbols_color))
     ) {
           Text(text = symbol , fontSize = 20.sp)
     }
}
