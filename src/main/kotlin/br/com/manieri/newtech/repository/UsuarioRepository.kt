package br.com.manieri.newtech.repository

import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository: JpaRepository<Usuario, Long> {
}