package com.example.pmd1eval


import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController

@Composable
fun VentanaEntrada(navController: NavController, lista: MutableList<Int>) {
    var numero by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize(), // ocupa toda la pantalla
        verticalArrangement = Arrangement.Center, // centra en vertical
        horizontalAlignment = Alignment.CenterHorizontally // centra en horizontal
    ) {
        Text("Introduce los numero")
        OutlinedTextField(
            value = numero,
            onValueChange = {newNumero ->
                numero = newNumero },
            label = {Text("numero")}
        )
        Button({
            try {
                if (numero.isEmpty()){
                    Toast.makeText(context, "Introduce  numero", Toast.LENGTH_LONG).show()
                }else{
                    lista.add(numero.toInt())
                    Toast.makeText(context, "EL numero $numero se ha insertado",Toast.LENGTH_SHORT).show()
                    numero = ""
                }
            }catch (e: Exception){
                Toast.makeText(context, "Valor no valido, tiene que ser un numero", Toast.LENGTH_LONG).show()
            }

        }) { Text("insertar")}
        Button({
            navController.navigate("resultado")
        }) {Text("sumar")}
    }
}