package com.example.practiceaplication.exercises1

import java.util.Scanner
//variavel scanner global
val scanner = Scanner(System.`in`) // Create a Scanner object
fun main()
{

    println("Qual o seu nome?:\n")
    var nome = readln()
    println("Ola $nome, agora insira sua idade:\n")
    var idade = readln().toInt()
    println("hmm, então você tem $idade anos de idade?\n")
    var estudante: Boolean
    estudante = verdade()
    println("saquei então\nvlw $nome! me avise quando vc fizer "+(idade+1)+" anos de idade :D")
    if (estudante == true)
    {
        println("bons estudos!")
    } else {
        println("bom, já que tu não estuda então boa sorte na vida viu!")
    }
}

fun verdade (): Boolean
{
    println("Você estuda?\nY-(Sim)\nN-(Não)")
    var resposta = scanner.next()
    if (resposta == "Y")
    { return true}
    else if (resposta == "N")
    { return false}
    else {
        println("\nHmmm isso não foi uma resposta clara para mim... vou interpretar como um não\n")
        return false
    }
}