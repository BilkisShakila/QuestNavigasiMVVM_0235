package com.example.activity5

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.activity5.view.FormIsian
import com.example.activity5.view.TampilData

enum class Navigasi{
    FormulirSaya,
    Detail
}
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
){
    Scaffold (){ isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,

            modifier = Modifier.padding(isiRuang)){
            composable(route = Navigasi.FormulirSaya.name){
                FormIsian (
                    //pilihanJK = jenisK,map { id -> konteks.resources.getSring(id)
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }

