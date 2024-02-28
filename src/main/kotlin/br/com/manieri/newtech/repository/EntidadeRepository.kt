package br.com.manieri.newtech.repository

import br.com.manieri.newtech.model.Endereco
import br.com.manieri.newtech.model.Entidade
import org.springframework.data.jpa.repository.JpaRepository

interface EntidadeRepository: JpaRepository<Entidade, Long> {
}