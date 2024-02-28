package br.com.manieri.newtech.dto

import br.com.manieri.newtech.model.Idioma

class NormaForm (
    val codigo: String,
    val ano: Int,
    val titulo : String,
    val idioma: Idioma,
    val idUsuarioCriador : Long,
    val idEntidade: Long
)