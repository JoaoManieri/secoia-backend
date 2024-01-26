package br.com.manieri.newtech.mapper

import br.com.manieri.newtech.dto.NovoClienteForm
import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class ClienteFormMapper(private val usuarioService: UsuarioService) : Mapper<NovoClienteForm, Cliente> {
    override fun map(t: NovoClienteForm): Cliente {
        return Cliente(
            nomeFantasia = t.nomeFantasia,
            nomeReal = t.nomeReal,
            cnpj = t.cnpj,
            anoDeRegistro = t.anoDeRegistro,
            usuraioCriador = usuarioService.buscarPorUsuario(t.usuarioCriador)
        )
    }
}