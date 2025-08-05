package com.example.practiceaplication.examples
// https://github.com/oguscaetano/aplicativos-moveis-2025-2/blob/main/aulas/1-Introducao/01-introducao.md

fun main()
{
    var nome = "Katsu"
    val constant = 10

    println("hello world\nI'm alive\nI'm Happy $constant $nome")
    nome = "vitor"
    println(nome)
    println("\n-------------------\nvamos somar os valores 1 e 2\nA soma desses valores é "+ somar(1,2))
    val frutas = mutableListOf("Banana","Maçã","Morango")
    println("\n-------------------\n")
    println("O array frutas é igual a "+frutas)
    frutas.add("Tomate")
    println("Após a adição o array frutas é igual a "+frutas)
    frutas.removeAt(3)
    frutas.removeAt(2)
    println("Após as 2 remoções o array frutas é igual a "+frutas)

    println("\n-------------------\n")
}

fun somar(value1: Int, value2: Int): Int = value1 + value2