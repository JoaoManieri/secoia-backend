package br.com.manieri.newtech.dto

data class NovoClienteForm(
    val nomeFantasia: String,
    val nomeReal: String,
    val cnpj: String,
    val anoDeRegistro: String,
    val usuarioCriador: Long,
) {}

