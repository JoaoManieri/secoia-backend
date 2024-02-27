package br.com.manieri.newtech.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Endereco(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    val cep : String = "",
    val rua : String = "",
    val numero : String = "",
    val bairro : String = "",
    val cidade : String = "",
    val estado : String = "",
    val complemento: String? = null
) {

}