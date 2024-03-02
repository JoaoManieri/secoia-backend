package br.com.manieri.newtech.model

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime

@Entity
data class Norma(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long? = null,
    val codigo: String,
    val ano: Int,
    @CreationTimestamp
    val dataDeCadastro : LocalDateTime = LocalDateTime.now(),
    @CreationTimestamp
    val dataUltimaModificacao : LocalDateTime? = null,
    val titulo : String,
    @Enumerated(EnumType.STRING)
    val idioma: Idioma,
    @ManyToOne
    val usuarioCriador : Usuario,
    @ManyToOne
    val entidade: Entidade? = null
    )