package br.com.manieri.newtech.repository

import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.model.Contato
import org.springframework.data.jpa.repository.JpaRepository

interface ContatoRepository: JpaRepository<Contato, Long> {
}