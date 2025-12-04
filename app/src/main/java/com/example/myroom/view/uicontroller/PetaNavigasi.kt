package com.example.myroom.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myroom.view.EntrySiswaScreen
import com.example.myroom.view.HomeScreen
import com.example.myroom.view.route.DestinasiDetailSiswa
import com.example.myroom.view.route.DestinasiDetailSiswa.itemIdArg
import com.example.myroom.view.route.DestinasiEntry
import com.example.myroom.view.route.DestinasiHome

@Composable
fun SiswaApp(navController: NavHostController= rememberNavController(),
             modifier: Modifier){
    HostNavigasi(navController = navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(navController=navController, startDestination = DestinasiHome.route
    , modifier = Modifier)
    {
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = {navController.navigate(DestinasiEntry
                    .route)},
                //edit 1 : tambah parameter navigate to item update
                navigateToItemUpdate ={
                    navController.navigate("${DestinasiDetailSiswa.route}/${it}")
                }
            )
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = { navController.popBackStack()})
        }
        //edit 2 : tambah 2 composable route
        composable (route = DestinasiDetailSiswa.routeWithArgs,
            arguments = listOf(navArgument(itemIdArg){
                type = NavType.IntType
            })
        ){

        }
    }
}
