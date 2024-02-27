package br.com.manieri.newtech.repository

import br.com.manieri.newtech.model.Endereco
import br.com.manieri.newtech.model.Norma
import org.springframework.data.jpa.repository.JpaRepository

interface NormaRepository : JpaRepository<Norma, Long> {
}