//package com.example.hacklaton
//
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavController
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import java.lang.reflect.Modifier
//
//@Composable
//fun MyNavHost(navController: NavHostController, paddingValues: PaddingValues){
//
//    NavHost( navController = navController,
//        startDestination = Screen.StartupScreen.route){
//        composable(Screen.StartupScreen.route){
//           StartupScreen()
//        }
//        composable(Screen.ArticleScreen.route){
//            ArticleScreen()
//        }
//        composable(Screen.Comments.route){
//            CommentScreen()
//        }
//
//
//    }
//}