package br.com.manieri.newtech.service

import br.com.manieri.newtech.dto.norma.NormaForm
import br.com.manieri.newtech.dto.norma.NormaViewList
import br.com.manieri.newtech.mapper.NormaFormMapper
import br.com.manieri.newtech.mapper.NormaViewListMapper
import br.com.manieri.newtech.model.Norma
import br.com.manieri.newtech.repository.NormaRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class NormaService(
    private var repository: NormaRepository,
    private val normaFormMapper: NormaFormMapper,
    private val normaViewListMapper: NormaViewListMapper
    ) {

    fun listar(): List<NormaViewList> {
        return repository.findAll().stream().map {
            t -> normaViewListMapper.map(t)
        }.collect(Collectors.toList())
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