package br.com.manieri.newtech.model
import java.time.LocalDateTime

data class Cliente (
        val nomeFantasia: String,
        val nomeReal: String,
        val cnpj: String,
//        val simplesNacionalAtivo: Boolean,
        val anoDeRegistro: String,
//        val solicitacaoPedido: Boolean,
//        val statusEmpresa: Boolean,
//        val ramoDeAtividade: String,
//        val fatorCompetitivo: String,
        val dataDeCadastro: LocalDateTime = LocalDateTime.now(),
        val usuraioCriador: Usuario,
        val status : StatusCliente = StatusCliente.ATIVO


//        val costumerAddresses: ArrayList<CostumerAddress>,
//        val costumerContacts: ArrayList<CostumerContact>
)


