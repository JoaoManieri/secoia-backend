package br.com.manieri.newtech.repository

import br.com.manieri.newtech.dto.ClienteView
import br.com.manieri.newtech.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ClienteRepository : JpaRepository<Cliente, Long> {

    @Query("SELECT c FROM Cliente c WHERE c.cnpj = :cnpj")
    fun findByCnpj(cnpj: String): Cliente

}