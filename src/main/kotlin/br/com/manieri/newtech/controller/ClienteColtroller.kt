package br.com.manieri.newtech.controller

import br.com.manieri.newtech.dto.ClienteView
import br.com.manieri.newtech.dto.NovoClienteForm
import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.service.ClienteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cliente")
class ClienteColtroller (private val clienteService : ClienteService) {

    @GetMapping
    fun listar() : List<ClienteView>{
        return clienteService.listar()
    }

    @GetMapping("/{cnpj}")
    fun buscarPorCNPJ(@PathVariable cnpj : String) : ClienteView{
        return clienteService.buscarPorCnpj(cnpj)
    }

    @PostMapping
    fun cadastrar(@RequestBody cliente : NovoClienteForm) {
        clienteService.cadastrar(cliente)
    }

}