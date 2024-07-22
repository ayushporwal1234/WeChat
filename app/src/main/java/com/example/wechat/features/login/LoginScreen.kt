package com.example.wechat.features.login

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.wechat.ui.theme.Primary
import com.example.wechat.ui.theme.Secondary

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun LoginScreen(){
    Scaffold (
        
        topBar = {
            TopAppBar(
                title = { Text(text = "WeChat") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White
                )
            )
        }
        
    ){paddingValues ->

        val context = LocalContext.current

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
         ){
              SignInWithGoogleButton(
                  onSuccess ={user ->
                Toast.makeText(context, "Signed-in as ${user.email}", Toast.LENGTH_SHORT).show()
              } ,
                  onError = {error ->
                      Toast.makeText(context, "Error : ${error?.message}", Toast.LENGTH_SHORT).show()

                  })
        }
    }
}