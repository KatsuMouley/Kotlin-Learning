package com.example.practiceaplication.examples
// https://github.com/oguscaetano/aplicativos-moveis-2025-2/blob/main/aulas/2-listas/listas.md
fun main()
{
    val produtos = listOf("Banana","Shampoo","Soda")

    println(produtos[1])

    val frutas = mutableListOf("Carambola", "Maçã", "Pessego")

    println(frutas)

    frutas.add("Pitaia")

    println(frutas)

    frutas.removeAt(2)

    println(frutas)
    println("\n-----------------------------------------------\n")
    for (fruta in frutas)
    {
        println(fruta+"\n")
    }
    println("-----------------------------------------------\n")

    for ((index, fruta) in frutas.withIndex())
    {
        println(""+(index+1)+"- $fruta\n")
    }
    println("-----------------------------------------------\n")
}

fun saudacao(nome: String): String
{
    return nome
}

fun soma(value1: Int, value2: Int): Int
{
    return value1 + value2
}

fun soma2(value1: Int, value2: Int): Int = value1+value2

