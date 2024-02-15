package br.com.manieri.newtech.service

import br.com.manieri.newtech.dto.UsuarioForm
import br.com.manieri.newtech.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private var usuarios: List<Usuario>,
    private var departamentoService: DepartamentoService
) {

    init {
        val usuario = (Usuario(
            id = 0L,
            nome = "User id 0",
            deparatamento = departamentoService.buscarPorId(0)
        ))
        usuarios = listOf(usuario)
    }

    fun buscarPorUsuario(id: Long?): Usuario? {
        if (id != null) {
            return usuarios.stream().filter { t ->
                t.id == id
            }.findFirst().get()
        } else {
            return null
        }
    }

    fun cadastrar(usuario: UsuarioForm) {
        usuarios.plus(
            Usuario(
                id = usuarios.size.toLong() + 1,
                nome = usuario.nome,
                deparatamento = departamentoService.buscarPorId(usuario.departamentoId)
            )
        )
    }
}