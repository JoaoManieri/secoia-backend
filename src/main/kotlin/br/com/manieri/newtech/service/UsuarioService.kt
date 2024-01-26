package br.com.manieri.newtech.service

import br.com.manieri.newtech.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(private var usuarios: List<Usuario>) {

    init {
        val usuario = (Usuario(
            id = 0L,
            nome = "User id 0"
        ))
        usuarios = listOf(usuario)
    }

    fun buscarPorUsuario(id: Long): Usuario {
        return usuarios.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }
}