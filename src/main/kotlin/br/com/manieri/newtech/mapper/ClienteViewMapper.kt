package br.com.manieri.newtech.mapper

import br.com.manieri.newtech.dto.ClienteView
import br.com.manieri.newtech.model.Cliente
import org.springframework.stereotype.Component

@Component
class ClienteViewMapper : Mapper<Cliente, ClienteView> {
    override fun map(t: Cliente): ClienteView {
        return ClienteView(
            nomeFantasia = t.nomeFantasia,
            cnpj = t.cnpj
        )
    }
}