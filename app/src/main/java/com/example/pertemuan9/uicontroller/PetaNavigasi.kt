package com.example.pertemuan9.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan9.view.EntrySiswaScreen
import com.example.pertemuan9.view.HomeScreen

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController()) {
    HostNavigasi(navController = navController)
}

