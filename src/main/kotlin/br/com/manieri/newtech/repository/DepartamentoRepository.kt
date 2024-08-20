package br.com.manieri.newtech.repository

import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.model.Departamento
import org.springframework.data.jpa.repository.JpaRepository

interface DepartamentoRepository: JpaRepository<Departamento, Long> {
}