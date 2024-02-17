package br.com.manieri.newtech.externo.receitaFederal.service

import br.com.manieri.newtech.externo.receitaFederal.dto.ReceitaFederalView
import br.com.manieri.newtech.externo.receitaFederal.mapper.ReceitaFederalViewMapper
import br.com.manieri.newtech.externo.receitaFederal.model.ReceitaFederalEmpresaInfo
import br.com.manieri.newtech.externo.receitaFederal.requisicao.RequisicaoReceitaFederal
import org.springframework.stereotype.Service

@Service
class ReceitaFederalService(
    private val receitaFederalViewMapper: ReceitaFederalViewMapper,
) {
    fun getDados(cnpj: String): ReceitaFederalView {
        val empresa: ReceitaFederalEmpresaInfo = RequisicaoReceitaFederal().getEmpresa(cnpj)
        println()
        println(empresa)
        println()
        return receitaFederalViewMapper.map(empresa)
    }
}