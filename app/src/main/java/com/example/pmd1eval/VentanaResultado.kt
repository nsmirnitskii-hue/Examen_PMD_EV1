package com.example.pmd1eval

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
@Composable
fun VentanaResultado(navController: NavController,lista: MutableList<Int>){
    Column(
        modifier = Modifier
            .fillMaxSize(), // ocupa toda la pantalla
        verticalArrangement = Arrangement.Center, // centra en vertical
        horizontalAlignment = Alignment.CenterHorizontally // centra en horizontal
    ){
        Text("Suma de los numeros: ${sumar(lista)}")
        Button({
            lista.clear()
            navController.navigate("entrada")
        }) {Text("Volver") }
    }
}
fun sumar(list: MutableList<Int>): Int{
    return list.sum()
}
