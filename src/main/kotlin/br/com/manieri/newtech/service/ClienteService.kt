package br.com.manieri.newtech.service

import br.com.manieri.newtech.dto.ClienteView
import br.com.manieri.newtech.dto.NovoClienteForm
import br.com.manieri.newtech.externo.receitaFederal.dto.ReceitaFederalView
import br.com.manieri.newtech.mapper.ClienteFormMapper
import br.com.manieri.newtech.mapper.ClienteViewMapper
import br.com.manieri.newtech.externo.receitaFederal.mapper.ReceitaFederalViewMapper
import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.model.StatusCliente
import br.com.manieri.newtech.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class ClienteService(
    private val repository: UsuarioRepository,
    private val clienteViewMapper: ClienteViewMapper,
    private val clienteFormMapper: ClienteFormMapper,
    private val receitaFederalViewMapper: ReceitaFederalViewMapper
) {
    fun listar(): List<ClienteView> {
        return clientes.stream().map {
                t -> clienteViewMapper.map(t)
        }.collect(Collectors.toList())
    }

    fun clientePorCnpj(cnpj: String): ClienteView {
        repository.getBy
    }

    fun cadastrar(dto: NovoClienteForm) {
        clientes = clientes.plus(clienteFormMapper.map(dto))
    }

    fun getStatus(status: Boolean) : StatusCliente {
        return if (status) StatusCliente.ATIVO
        else StatusCliente.INATIVO
    }

}