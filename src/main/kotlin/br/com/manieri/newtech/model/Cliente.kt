package br.com.manieri.newtech.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Cliente (
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long? = null,
    val cnpj: String,
    val nomeFantasia: String,
    val nomeReal: String,
    val simplesNacionalAtivo: Boolean = false,
    val ramoDeAtividade: String,
    @OneToMany(mappedBy = "cep")
    val listaDeEnderecos: MutableList<Endereco>,
    @OneToMany(mappedBy = "telefone")
    val listaDeContatos: MutableList<Contato>,
    val solicitacaoPedido: Boolean,
    val statusEmpresa: Boolean,
    val dataDeCadastro: LocalDateTime = LocalDateTime.now(),
    val status : StatusCliente,
    val fatorCompetitivo: String?,
    @ManyToOne
    val usuarioCriador: Usuario,
    @ManyToOne
    val gestorDaConta : Usuario?,
    @ManyToOne
    val analistaDaConta : Usuario?
)



