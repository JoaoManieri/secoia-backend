package br.com.manieri.newtech.model

import jakarta.persistence.*

@Entity
data class Norma(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long? = null,
    val codigo: String,
    val ano: Int,
    val titulo : String,
    @Enumerated(EnumType.STRING)
    val idioma: Idioma,
    @ManyToOne
    val usuarioCriador : Usuario,
    @ManyToOne
    val entidade: Entidade? = null
    )