package br.com.manieri.newtech.externo.receitaFederal.model

import br.com.manieri.newtech.externo.receitaFederal.model.Atividade
import br.com.manieri.newtech.externo.receitaFederal.model.Billing
import br.com.manieri.newtech.externo.receitaFederal.model.Qsa

data class ReceitaFederalEmpresaInfo (
    val cnpj: String,
    val nome: String,
    val fantasia: String,
    val natureza_juridica: String,
    val data_abertura: String,
    val situacao: String,
    val motivo_situacao: String,
    val data_situacao: String,
    val capital_social: Double,
    val porte: String,
    val tipo: String,
    val efr: String,
    val complemento: String,
    val numero: String,
    val logradouro: String,
    val bairro: String,
    val municipio: String,
    val uf: String,
    val cep: String,
    val telefone: String,
    val email: String,
    val ultima_atualizacao: String,
    val status: String,
    val atividades_secundarias: List<Atividade>,
    val atividade_principal: List<Atividade>,
    val qsa: List<Qsa>,
    val billing: Billing
)