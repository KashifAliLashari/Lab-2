package com.example.lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab2.ui.theme.Lab2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

// Task 3

@Composable
fun Greeting() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
//        1st Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .height(120.dp)
                .shadow(elevation = 5.dp, shape = RoundedCornerShape(5.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ironman),
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(start = 20.dp),
                contentScale = ContentScale.FillHeight
            )
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "Iron Man",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
                )
                Text(text = "Age: 43", fontSize = 15.sp)
            }
        }

        //        2nd Row

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .height(120.dp)
                .shadow(elevation = 5.dp, shape = RoundedCornerShape(5.dp)),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(
                painter = painterResource(id = R.drawable.hult),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .size(70.dp)
                    .padding(start = 20.dp)
            )
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "Hulk",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
                )
                Text(text = "Age: 43", fontSize = 15.sp)
            }
        }

        //        3rd Row

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .height(120.dp)
                .shadow(elevation = 5.dp, shape = RoundedCornerShape(5.dp)),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(
                painter = painterResource(id = R.drawable.deadpool),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .size(70.dp)
                    .padding(start = 20.dp)
            )
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "Deadpool",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
                )
                Text(text = "Age: 43", fontSize = 15.sp)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .height(120.dp)
                .shadow(elevation = 5.dp, shape = RoundedCornerShape(5.dp)),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(
                painter = painterResource(id = R.drawable.wolverine),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .size(70.dp)
                    .padding(start = 20.dp)
            )
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "Wolverine",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
                )
                Text(text = "Age: 43", fontSize = 15.sp)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .height(110.dp)
                .shadow(elevation = 5.dp, shape = RoundedCornerShape(5.dp)),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(
                painter = painterResource(id = R.drawable.blackwidow),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .size(70.dp)
                    .padding(start = 20.dp)
            )
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "Black Widow",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
                )
                Text(text = "Age: 43", fontSize = 15.sp)
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .height(110.dp)
                .shadow(elevation = 5.dp, shape = RoundedCornerShape(5.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.thor),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .size(70.dp)
                    .padding(start = 20.dp)
            )
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = "Thor",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
                )
                Text(text = "Age: 43", fontSize = 15.sp)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Lab2Theme {
        Greeting()
    }
}
