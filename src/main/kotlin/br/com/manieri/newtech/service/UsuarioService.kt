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

//    init {
//        cadastrar(UsuarioForm("João", 0))
//    }

    fun buscarPorUsuario(id: Long?): Usuario? {
        println()
        println("-----------------------------------------------------------[LOG] Chegou aqui!!!")
        println()
        return repository.getReferenceById(id!!)
    }

    fun cadastrar(usuario: UsuarioForm) {
        repository.save(Usuario(
            nome = usuario.nome,
        ))
    }
}