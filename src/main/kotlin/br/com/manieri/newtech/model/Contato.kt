package br.com.manieri.newtech.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Contato (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,
    val nome : String,
    val cargo : String,
    val telefone : String,
    val celular : String,
    val email : String
)
