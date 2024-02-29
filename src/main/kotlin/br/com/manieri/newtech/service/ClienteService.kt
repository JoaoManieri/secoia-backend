package br.com.manieri.newtech.service

import br.com.manieri.newtech.dto.cliente.ClienteView
import br.com.manieri.newtech.dto.cliente.NovoClienteForm
import br.com.manieri.newtech.mapper.ClienteFormMapper
import br.com.manieri.newtech.mapper.ClienteViewMapper
import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.model.StatusCliente
import br.com.manieri.newtech.repository.ClienteRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class ClienteService(
    private val repository: ClienteRepository,
    private val clienteViewMapper: ClienteViewMapper,
    private val clienteFormMapper: ClienteFormMapper,
) {
    fun listar(): List<ClienteView> {
        return repository.findAll().stream().map {
                t -> clienteViewMapper.map(t)
        }.collect(Collectors.toList())
    }

    fun clientePorCnpj(cnpj: String): Cliente {
        return repository.findByCnpj(cnpj)
    }

    fun cadastrar(novoClienteForm: NovoClienteForm) {
        repository.save(clienteFormMapper.map(novoClienteForm))
    }

    fun atualizar(cliente: Cliente) {
        repository.save(cliente)
    }

    fun delete(id : Long){
        repository.deleteById(id)
    }

    fun getStatus(status: Boolean) : StatusCliente {
        return if (status) StatusCliente.ATIVO
        else StatusCliente.INATIVO
    }

}