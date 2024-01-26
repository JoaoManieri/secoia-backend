package br.com.manieri.newtech.mapper

import br.com.manieri.newtech.model.Usuario

interface Mapper<T, U> {

    fun map(t: T):U

}
