package br.com.manieri.newtech.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Entidade (
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id : Long? = null,
    val nome : String = ""
)