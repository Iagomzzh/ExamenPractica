package com.iago.practicando.navegacion

import kotlinx.serialization.Serializable

// RUTAS
@Serializable
object Screen1

@Serializable
object Screen2

// Estas dos son dataclass para que se le puedan pasar parametros
@Serializable
data class Screen3(val valorAPasarle: String) // La dataClass es la  screen que va a recibir parametro

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

