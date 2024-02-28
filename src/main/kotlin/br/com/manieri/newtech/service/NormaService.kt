package br.com.manieri.newtech.service

import br.com.manieri.newtech.dto.NormaForm
import br.com.manieri.newtech.mapper.ClienteFormMapper
import br.com.manieri.newtech.mapper.NormaFormMapper
import br.com.manieri.newtech.model.Cliente
import br.com.manieri.newtech.model.Norma
import br.com.manieri.newtech.repository.NormaRepository
import org.springframework.stereotype.Service

@Service
class NormaService(
    private var repository: NormaRepository,
    private val normaFormMapper: NormaFormMapper,
    ) {

    fun listar(): List<Norma> {
        return repository.findAll()
    }

    fun buscaPorId(id: Long?): Norma? {
        return repository.getReferenceById(id!!)
    }

    fun cadastrar(norma: NormaForm) {
        repository.save(normaFormMapper.map(norma))
    }

    fun atualizar(norma: Norma) {
        repository.save(norma)
    }

    fun delete(id : Long){
        repository.deleteById(id)
    }
}