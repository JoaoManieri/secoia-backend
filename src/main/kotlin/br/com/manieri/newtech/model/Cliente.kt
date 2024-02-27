package br.com.manieri.newtech.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Cliente (
    @Id
    val cnpj: String = "",
    val nomeFantasia: String = "",
    val nomeReal: String = "",
    val simplesNacionalAtivo: Boolean = false,
    val ramoDeAtividade: String = "",
    @OneToMany(mappedBy = "cep")
    val listaDeEnderecos: MutableList<Endereco> = mutableListOf(),
    @OneToMany(mappedBy = "telefone")
    val listaDeContatos: MutableList<Contato> = mutableListOf(),
    val solicitacaoPedido: Boolean = false,
    val statusEmpresa: Boolean = false,
    val dataDeCadastro: LocalDateTime = LocalDateTime.now(),
    val status : StatusCliente = StatusCliente.ATIVO,
    val fatorCompetitivo: String? = null,
    @ManyToOne
    val usuarioCriador: Usuario? = null,
    @ManyToOne
    val gestorDaConta : Usuario? = null,
    @ManyToOne
    val analistaDaConta : Usuario? = null
)



