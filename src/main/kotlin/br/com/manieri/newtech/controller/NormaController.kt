package br.com.manieri.newtech.controller

import br.com.manieri.newtech.dto.NormaForm
import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.model.Norma
import br.com.manieri.newtech.service.NormaService
import br.com.manieri.newtech.util.log
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/norma")
class NormaController(private val normaService: NormaService) {

    @GetMapping
    fun listar(): List<Norma> {
        return normaService.listar()
    }

    @GetMapping("/{id}")
    fun normaPorId(@PathVariable id : Long) : Norma {
        return normaService.buscaPorId(id)!!
    }

    @PostMapping
    fun cadastrar(@RequestBody norma: NormaForm) {
        normaService.cadastrar(norma)
    }

    @PutMapping
    fun atualizar(@RequestBody norma: Norma) {
        normaService.atualizar(norma)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id : Long){
        normaService.delete(id)
    }
}