package br.com.manieri.newtech.service

import br.com.manieri.newtech.dto.UsuarioForm
import br.com.manieri.newtech.model.Usuario
import br.com.manieri.newtech.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private var repository: UsuarioRepository,
    private var departamentoService: DepartamentoService
) {

    fun buscarPorUsuario(id: Long?): Usuario? {
        return repository.getReferenceById(id!!)
    }

    fun cadastrar(usuario: UsuarioForm) {
        repository.save(Usuario(
            nome = usuario.nome,
        ))
    }
}