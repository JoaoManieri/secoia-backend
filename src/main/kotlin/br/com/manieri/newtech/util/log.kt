package br.com.manieri.newtech.util

import kotlin.time.times

fun log(text : String){

    val t = "-".repeat(text.length)
    val m = "-".repeat(text.length / 2)

    println(" $t$m.,.$m$t")
    println("-$t $text $t--")
    println(" $t$m.,.$m$t")
}