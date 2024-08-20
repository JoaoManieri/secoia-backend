package br.com.manieri.newtech.dto.cliente

import br.com.manieri.newtech.model.Contato
import br.com.manieri.newtech.model.Endereco

data class NovoClienteForm(
    val nomeFantasia: String,
    val nomeReal: String,
    val cnpj: String,
    val simplesNacionalAtivo: Boolean,
    val ramoDeAtividade: String,
    val listaDeEnderecos: ArrayList<Endereco>,
    val listaDeContatos: ArrayList<Contato>,
    val usuarioCriadorId: Long,
    val fatorCompetitivo: String?,
    val gestorDaContaUsuarioId: Long?,
    val analistaDaContaUsuarioId: Long?,
)

