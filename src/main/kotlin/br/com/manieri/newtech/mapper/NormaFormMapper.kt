package br.com.manieri.newtech.mapper


import br.com.manieri.newtech.dto.norma.NormaForm
import br.com.manieri.newtech.model.Norma
import br.com.manieri.newtech.service.EntidadeService
import br.com.manieri.newtech.service.UsuarioService
import br.com.manieri.newtech.util.log
import org.springframework.stereotype.Component

@Component
class NormaFormMapper (
    private val entidadeService: EntidadeService,
    private val usuarioService: UsuarioService,

    ) : Mapper<NormaForm, Norma> {
    override fun map(t: NormaForm): Norma {
        return Norma(
            codigo = t.codigo,
            ano = t.ano,
            titulo = t.titulo,
            idioma = t.idioma,
            usuarioCriador = usuarioService.buscarPorUsuario(t.idUsuarioCriador)!!,
            entidade = entidadeService.buscaPorId(t.idEntidade)
        )
    }
}