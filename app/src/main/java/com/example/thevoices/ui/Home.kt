package com.example.thevoices.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.thevoices.R
import com.example.thevoices.presentations.components.BottomBar

@Composable
fun HomeScreen(
    navController: NavController
) {
    Home(navController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val isPlayingAudio by rememberSaveable {
        mutableStateOf(false)
    }

    Scaffold(
        topBar = {
           Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(56.dp),
               verticalAlignment = Alignment.CenterVertically
           ){
               Text(
                   text = "Home",
                   modifier = Modifier
                       .padding(16.dp)
                   ,
                     style = TextStyle(
                          fontSize = with(LocalDensity.current) { dimensionResource(id = R.dimen.Title).toSp()},
                          fontWeight = FontWeight.Bold
                     )
               )
               Row(
                     modifier = Modifier
                          .fillMaxWidth()
                          .padding(16.dp)
                         .weight(1f, fill = true),
                     horizontalArrangement = Arrangement.End,
                   verticalAlignment = Alignment.CenterVertically,
               ) {
                   Icon(
                       painter = painterResource(id = R.drawable.ic_actions_notifications),
                       contentDescription = null,
                       modifier = Modifier.size(24.dp)
                           .clickable {
                               //TODO: Implement Notification
                           }
                   )
                     Icon(
                          painter = painterResource(id = R.drawable.ic_contact_message),
                          contentDescription = null,
                          modifier = Modifier.size(24.dp)
                            .clickable {
                                //TODO: Implement Message
                            }
                     )
               }
           }
        }
    ) {paddingValue ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValue)
                .verticalScroll(rememberScrollState())
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    val context = androidx.compose.ui.platform.LocalContext.current
    Home(navController = NavController(context = context))
}