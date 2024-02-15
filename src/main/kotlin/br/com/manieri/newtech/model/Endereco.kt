package br.com.manieri.newtech.model

data class Endereco(
    val cep : String,
    val rua : String,
    val numero : String,
    val bairro : String,
    val cidade : String,
    val estado : String,
    val complemento: String?
)