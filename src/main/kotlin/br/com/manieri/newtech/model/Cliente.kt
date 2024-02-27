package br.com.manieri.newtech.model
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne
import java.time.LocalDateTime

@Entity
data class Cliente (
        @Id
        val cnpj: String,
        val nomeFantasia: String,
        val nomeReal: String,
        val simplesNacionalAtivo: Boolean,
        val ramoDeAtividade: String,
        @OneToMany(mappedBy = "cep")
        val listaDeEnderecos: ArrayList<Endereco>,
        @OneToMany(mappedBy = "telefone")
        val listaDeContatos: ArrayList<Contato>,
        val solicitacaoPedido: Boolean,
        val statusEmpresa: Boolean,
        val dataDeCadastro: LocalDateTime, // = LocalDateTime.now()
        @OneToOne
        val usuarioCriador: Usuario,
        val status : StatusCliente = StatusCliente.ATIVO,
        val fatorCompetitivo: String?,
        @OneToOne
        val gestorDaConta : Usuario?,
        @OneToOne
        val analistaDaConta : Usuario?
)


