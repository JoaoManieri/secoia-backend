package br.com.manieri.newtech.repository

import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.model.Endereco
import org.springframework.data.jpa.repository.JpaRepository

interface EnderecoRepository: JpaRepository<Endereco, Long> {
}