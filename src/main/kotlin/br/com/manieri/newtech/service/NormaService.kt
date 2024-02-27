package br.com.manieri.newtech.service

import br.com.manieri.newtech.model.Norma
import br.com.manieri.newtech.repository.NormaRepository
import org.springframework.stereotype.Service

@Service
class NormaService(private var repository: NormaRepository) {

    fun listar(): List<Norma> {
        return repository.findAll()
    }

    fun buscaPorId(id: Long?): Norma? {
        return repository.getReferenceById(id!!)
    }

    fun cadastrar(norma: Norma) {
        repository.save(norma)
    }

}