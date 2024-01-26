package br.com.manieri.newtech.service

import br.com.manieri.newtech.dto.ClienteView
import br.com.manieri.newtech.dto.NovoClienteForm
import br.com.manieri.newtech.mapper.ClienteFormMapper
import br.com.manieri.newtech.mapper.ClienteViewMapper
import br.com.manieri.newtech.model.Cliente
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class ClienteService(
    private var clientes: List<Cliente> = ArrayList(),
    private val clienteViewMapper: ClienteViewMapper,
    private val clienteFormMapper: ClienteFormMapper
) {
    fun listar(): List<ClienteView> {
        return clientes.stream().map {
                t -> clienteViewMapper.map(t)
        }.collect(Collectors.toList())
    }

    fun buscarPorCnpj(cnpj: String): ClienteView {
        val cliente = clientes.stream().filter {
            t-> t.cnpj == cnpj
        }.findFirst().get()
        return clienteViewMapper.map(cliente)
    }

    fun cadastrar(dto: NovoClienteForm) {
        clientes = clientes.plus(clienteFormMapper.map(dto))
    }

}