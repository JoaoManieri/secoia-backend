package br.com.manieri.newtech.service

import br.com.manieri.newtech.model.Entidade
import br.com.manieri.newtech.model.Norma
import br.com.manieri.newtech.repository.EntidadeRepository
import br.com.manieri.newtech.repository.NormaRepository
import org.springframework.stereotype.Service

@Service
class EntidadeService (private var repository: EntidadeRepository) {

    fun buscaPorId(id: Long?): Entidade? {
        return repository.getReferenceById(id!!)
    }

}