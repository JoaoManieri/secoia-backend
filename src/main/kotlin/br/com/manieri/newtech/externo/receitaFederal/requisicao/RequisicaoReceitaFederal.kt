package br.com.manieri.newtech.externo.receitaFederal.requisicao

import br.com.manieri.newtech.externo.receitaFederal.model.Atividade
import br.com.manieri.newtech.externo.receitaFederal.model.Billing
import br.com.manieri.newtech.externo.receitaFederal.model.Qsa
import br.com.manieri.newtech.externo.receitaFederal.model.ReceitaFederalEmpresaInfo
import com.google.gson.Gson

import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RequestCallback
import org.springframework.web.client.ResponseExtractor
import org.springframework.web.client.RestTemplate

class RequisicaoReceitaFederal {

    private val gson = Gson()
    fun getEmpresa(cnpj : String): ReceitaFederalEmpresaInfo {

        print(cnpj)

        val restTemplate = RestTemplate()
        val url = "https://www.receitaws.com.br/v1/cnpj/$cnpj"
        val response: ResponseEntity<String> = restTemplate.exchange(url, HttpMethod.GET, null, String::class.java)

        val responseBody = response.body
        return gson.fromJson(responseBody, ReceitaFederalEmpresaInfo::class.java)
    }
    fun getEmpresa__() : ReceitaFederalEmpresaInfo {
        return ReceitaFederalEmpresaInfo(
            cnpj = "12.345.678/9000-12",
            nome = "Empresa Fantástica Inc.",
            fantasia = "Empresa Fantástica",
            natureza_juridica = "205-4 - Sociedade Anônima Fechada",
            data_abertura = "01/04/2000",
            situacao = "ATIVA",
            motivo_situacao = "",
            data_situacao = "01/04/2000",
            capital_social = 1000000.00,
            porte = "MICROEMPRESA",
            tipo = "FILIAL",
            efr = "",
            complemento = "",
            numero = "123",
            logradouro = "Rua da Fantasia",
            bairro = "Centro",
            municipio = "Cidade Alegre",
            uf = "SP",
            cep = "12345-678",
            telefone = "(11) 5555-5555",
            email = "contato@empresafantastica.com",
            ultima_atualizacao = "2024-02-16T17:08:42.000Z",
            status = "OK",
            atividades_secundarias = listOf(
                Atividade("47.21-0-00", "Comércio varejista de material de construção"),
                Atividade("85.59-5-00", "Cursos de desenvolvimento profissional")
            ),
            atividade_principal = listOf(Atividade("55.30-2-00", "Restaurantes e similares")),
            qsa = listOf(
                Qsa("Fada Madrinha", "Sócia-Fundadora"),
                Qsa("Pinóquio", "Diretor Executivo")
            ),
            billing = Billing(false, true)
        )
    }
}