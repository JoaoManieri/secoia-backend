package br.com.manieri.newtech.externo.receitaFederal.dto

import br.com.manieri.newtech.externo.receitaFederal.model.Atividade

data class ReceitaFederalView (

    val nome: String,
    val fantasia: String,
    val situacao: String,
    val complemento: String,
    val numero: String,
    val logradouro: String,
    val bairro: String,
    val municipio: String,
    val uf: String,
    val cep: String,
    val telefone: String,
    val email: String,
    val atividade_principal: List<Atividade>
)