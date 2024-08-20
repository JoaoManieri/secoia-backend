package br.com.manieri.newtech.service

import br.com.manieri.newtech.model.Departamento
import org.springframework.stereotype.Service

@Service
class DepartamentoService (var departamentos : List<Departamento>) {

    init {
        val departamento01 = Departamento(
            id = 0L,
            nome = "Financeiro"
        )
        val departamento02 = Departamento(
            id = 1L,
            nome = "Administrativo"
        )
        departamentos = departamentos.plus(listOf(departamento01,departamento02))
    }

    fun buscarPorId(id : Long) : Departamento {
        return departamentos.stream().filter { c ->
            c.id == id
        }.findFirst().get()
    }

}