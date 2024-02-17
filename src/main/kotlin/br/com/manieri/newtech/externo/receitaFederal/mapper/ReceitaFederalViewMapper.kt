package br.com.manieri.newtech.externo.receitaFederal.mapper

import br.com.manieri.newtech.externo.receitaFederal.dto.ReceitaFederalView
import br.com.manieri.newtech.externo.receitaFederal.model.ReceitaFederalEmpresaInfo
import br.com.manieri.newtech.mapper.Mapper
import org.springframework.stereotype.Component

@Component
class ReceitaFederalViewMapper : Mapper<ReceitaFederalEmpresaInfo, ReceitaFederalView> {
    override fun map(t: ReceitaFederalEmpresaInfo): ReceitaFederalView {
        return ReceitaFederalView(
            nome = t.nome,
            fantasia = t.fantasia,
            situacao = t.data_situacao,
            complemento = t.complemento,
            numero = t.numero,
            logradouro = t.logradouro,
            bairro = t.bairro,
            municipio = t.municipio,
            uf = t.uf,
            cep = t.cep,
            email = t.email,
            telefone = t.telefone,
            atividade_principal = t.atividade_principal
        )
    }
}