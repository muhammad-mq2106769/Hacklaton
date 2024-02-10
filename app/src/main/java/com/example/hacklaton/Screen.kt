package com.example.hacklaton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route :String, val title:String, val icon:ImageVector){
    object StartupScreen : Screen("startup-screen", "Startup Screen", Icons.Default.ArrowDropDown)
    object ArticleScreen : Screen("article-screen", "Article Screen", Icons.Default.Info)
    object Comments : Screen("comments", "Comment", Icons.Default.Add)
}
