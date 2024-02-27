package br.com.manieri.newtech.model

import jakarta.persistence.*

@Entity
class Usuario(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val nome: String = "",
        @ManyToOne
        val departamento : Departamento? = null,
//        @ManyToMany(mappedBy = "analistasDaConta")
//        val clientes: MutableList<Cliente> = mutableListOf()
)
