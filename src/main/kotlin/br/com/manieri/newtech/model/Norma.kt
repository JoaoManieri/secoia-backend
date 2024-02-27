package br.com.manieri.newtech.model

import jakarta.persistence.*

@Entity
data class Norma(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long? = null,
    val codigo: String = "",
    val ano: Int = 0,
    val titulo : String = "",
    @Enumerated(EnumType.STRING)
    val idioma: Idioma = Idioma.PORTUGUES,
    @ManyToOne
    val usuarioCriador : Usuario? = null,
    @ManyToOne
    val entidade: Entidade? = null
    )