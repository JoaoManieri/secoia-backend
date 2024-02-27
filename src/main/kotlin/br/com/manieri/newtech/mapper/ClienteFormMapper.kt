package br.com.manieri.newtech.mapper

import br.com.manieri.newtech.dto.NovoClienteForm
import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.model.StatusCliente
import br.com.manieri.newtech.service.ClienteService
import br.com.manieri.newtech.service.UsuarioService
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class ClienteFormMapper(
    private val usuarioService: UsuarioService,

) : Mapper<NovoClienteForm, Cliente> {
    override fun map(t: NovoClienteForm): Cliente {
        return Cliente(
            id = 0,
            nomeFantasia = t.nomeFantasia,
            nomeReal = t.nomeReal,
            cnpj = t.cnpj,
            usuarioCriador = usuarioService.buscarPorUsuario(t.usuarioCriadorId)!!,
            dataDeCadastro = LocalDateTime.now(),
            statusEmpresa = true,
            solicitacaoPedido = false,
            listaDeContatos = t.listaDeContatos,
            listaDeEnderecos = t.listaDeEnderecos,
            ramoDeAtividade = t.ramoDeAtividade,
            simplesNacionalAtivo = t.simplesNacionalAtivo,
            fatorCompetitivo = t.fatorCompetitivo,
            gestorDaConta = usuarioService.buscarPorUsuario(t.gestorDaContaUsuarioId),
            status = StatusCliente.ATIVO,
            analistaDaConta = usuarioService.buscarPorUsuario(t.analistaDaContaUsuarioId)
        )
    }
}