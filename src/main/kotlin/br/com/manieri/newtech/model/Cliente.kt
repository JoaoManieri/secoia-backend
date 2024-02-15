package br.com.manieri.newtech.model
import java.time.LocalDateTime

data class Cliente (
        val nomeFantasia: String,
        val nomeReal: String,
        val cnpj: String,
        val simplesNacionalAtivo: Boolean,
        val ramoDeAtividade: String,

        val listaDeEnderecos: ArrayList<Endereco>,
        val listaDeContatos: ArrayList<Contato>,

        val solicitacaoPedido: Boolean,
        val statusEmpresa: Boolean,

        val dataDeCadastro: LocalDateTime, // = LocalDateTime.now()
        val usuarioCriador: Usuario,
        val status : StatusCliente = StatusCliente.ATIVO,

        val fatorCompetitivo: String?,
        val gestorDaConta : Usuario?,
        val analistaDaConta : Usuario?
)


