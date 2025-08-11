package com.example.practiceaplication.exercises1

fun contaPalavra(frase: String): Int
{
    return frase.split(" ").size
}

fun main()
{
    val frase = "Ola meu nome é ishiogaki kira blabla bla balls eu sou um personagem de jojo ui ui"
    val quantidade = contaPalavra(frase)
    println("A frase $frase\npossui $quantidade palavras.")


    println("\n---------------------------------")
    val filmes = listOf("Filme1", "filme2", "filme3")
    filmes.forEach{ filme ->
        println("Assistindio: $filme")

        // Isso é uma função lambda
        //Em programação, "lambda" refere-se a uma função anônima, ou seja, uma função sem um nome definido.
    // Essa função é definida em uma única expressão e é frequentemente usada para criar funções simples que
    // serão usadas uma vez ou em contextos onde uma função completa não é necessária.
    }


}