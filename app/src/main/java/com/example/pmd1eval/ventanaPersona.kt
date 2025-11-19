package com.example.pmd1eval

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

data class Persona(var nombre: String, var edad: Int)
@Composable
fun ventanaPersona(navController: NavController){
    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        OutlinedTextField(
            value = nombre,
            onValueChange = {nombre = it},
            label = {Text("nombre")}
        )
        OutlinedTextField(
            value = edad,
            onValueChange = {edad = it},
            label = {Text("edad")}
        )
        Button({
            var edadInt = edad.toInt()
            Presentarse(nombre)

        }) { }
    }
}
fun Presentarse(nom: String): String{
    return "Hola soy $nom"
}

@Composable
fun cumplirEdad(edad: Int): String{
    var edadNueva = edad +1
  return  "ahora tengo $edadNueva años"
}