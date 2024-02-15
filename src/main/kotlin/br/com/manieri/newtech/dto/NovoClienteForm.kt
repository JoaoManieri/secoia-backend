package br.com.manieri.newtech.dto

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

//    val solicitacaoPedido: Boolean, FALSE
//    val statusEmpresa: Boolean, TRUE

//    val dataDeCadastro: LocalDateTime = LocalDateTime.now(),
    val usuarioCriadorId: Long, // Usuario,
//    val status : StatusCliente = StatusCliente.ATIVO,

    val fatorCompetitivo: String?,
    val gestorDaContaUsuarioId: Long?, //Usuario?,
    val analistaDaContaUsuarioId: Long?, //Usuario?
)

