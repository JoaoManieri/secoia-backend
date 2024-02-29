package br.com.manieri.newtech.mapper

import br.com.manieri.newtech.dto.norma.NormaForm
import br.com.manieri.newtech.dto.norma.NormaViewList
import br.com.manieri.newtech.model.Norma
import org.springframework.stereotype.Component

@Component
class NormaViewListMapper : Mapper<Norma, NormaViewList> {
    override fun map(t: Norma): NormaViewList {
        return  NormaViewList(
            entidade = t.entidade!!.nome,
            codigo = t.codigo,
            idioma = t.idioma.name,
            ano = t.ano.toString()
        )
    }
}