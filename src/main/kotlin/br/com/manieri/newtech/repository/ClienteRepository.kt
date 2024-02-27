package br.com.manieri.newtech.repository

import br.com.manieri.newtech.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository : JpaRepository<Cliente, Long> {
}