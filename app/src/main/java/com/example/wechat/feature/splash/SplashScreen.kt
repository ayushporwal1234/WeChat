package com.example.wechat.feature.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wechat.R
import com.example.wechat.ui.theme.Gradient

@Preview
@Composable
fun SplashScreen() {
   Box(
       modifier = Modifier.fillMaxSize()
           .background(Gradient),
       contentAlignment = Alignment.Center
   ){
        Image(
            modifier = Modifier.size(150.dp),
            painter = painterResource(id = R.drawable.ic_chat_splash),
            contentDescription ="Chat",
            colorFilter = ColorFilter.tint(Color.White)
        )
   }
}