package com.example.thevoices.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.thevoices.R
import com.example.thevoices.ViewModel.AppViewModel
import com.example.thevoices.ViewModel.LoginViewModel

@Composable
fun LoginScreen(navController: NavController? = null, appViewModel: AppViewModel){
    val viewModel = viewModel<LoginViewModel>()
    Login(
        viewModel = viewModel,
        navController = navController,
        appViewModel = appViewModel
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(
    viewModel: LoginViewModel,
    appViewModel: AppViewModel? = null,
    navController: NavController? = null,
    modifier: Modifier = Modifier
){
    Box(
        modifier = Modifier.fillMaxSize(),
    ){
        Box(
            modifier = Modifier
                .padding(start = 10.dp)
                .clip(CircleShape)
                .clickable {  }
                .background(MaterialTheme.colorScheme.surface),
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier.size(30.dp),
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(bottom = 200.dp)
            ){

                Spacer(modifier = Modifier.padding(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.jerry2),
                    modifier = Modifier.size(100.dp),
                    contentDescription = null
                )
                Text(text = "Login",
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
           Column {
               TextField(
                   value = viewModel.username,
                   onValueChange = {viewModel.username = it},
                   label = { Text(text = stringResource(id = R.string.usernameLogin)) },
                   colors = TextFieldDefaults.colors(
                       focusedContainerColor = MaterialTheme.colorScheme.primaryContainer,
                       unfocusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                   ),
                   modifier = Modifier.size(400.dp, 60.dp)
               )
               Spacer(modifier = Modifier.padding(4.dp))
               TextField(
                   value = viewModel.password,
                   onValueChange = {viewModel.password = it},
                   label = { Text(text = stringResource(id = R.string.passwordLogin)) },
                   colors = TextFieldDefaults.colors(
                       focusedContainerColor = MaterialTheme.colorScheme.primaryContainer,
                       unfocusedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                   ),
                   modifier = Modifier.size(400.dp, 60.dp)
               )
               Spacer(modifier = Modifier.padding(4.dp))
               Text(text = stringResource(id = R.string.forgotpasswordLogin),
                   modifier = Modifier
                       .align(Alignment.End)
                       .padding(end = 10.dp)
               )
           }
            Spacer(modifier = Modifier.padding(20.dp))
            Button(onClick = {
                if (viewModel.onLoginClicked()) {
                    appViewModel?.setLoginState(true)
                    navController?.navigate("home")
                }
            },
                colors = ButtonDefaults.buttonColors(
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                modifier = Modifier.size(300.dp, 60.dp)
            ) {
                Text(text = stringResource(id = R.string.loginLogin))
            }

            Row {
                Text(text = stringResource(id = R.string.donthaveaccount),
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(end = 5.dp)
                )
                Text(text = stringResource(id = R.string.register),
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 5.dp)
                        .clickable {
                            navController?.navigate("register")
                        }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview(){
    val appViewModel = AppViewModel()
    LoginScreen(appViewModel = appViewModel)
}