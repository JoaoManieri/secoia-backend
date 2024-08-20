package br.com.manieri.newtech.externo.receitaFederal.controller

import br.com.manieri.newtech.externo.receitaFederal.dto.ReceitaFederalView
import br.com.manieri.newtech.externo.receitaFederal.service.ReceitaFederalService
import br.com.manieri.newtech.service.ClienteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/externo")
class ReceitaFederalController (private val receitaFederalService: ReceitaFederalService ) {
    @GetMapping("/busca/{cnpj}")
    fun buscaPorCNPJ(@PathVariable cnpj : String) : ReceitaFederalView {
        return receitaFederalService.getDados(cnpj)
    }
}

