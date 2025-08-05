package com.example.practiceaplication.exercises1


fun main()
{
    val numeros = listOf(10, 1, 6, 4 ,8, 2, 7, 3)

    var soma = 0
    println("\n-------------------------\n")
    for (numero in numeros)
    {
        soma += numero
        println(soma)
    }
    println("\n-------------------------\n")
    var somatorio = numeros.sum()

    println(somatorio)
    println("\n-------------------------\n")

    var maior = numeros[0]
    for (numero in numeros)
    {
        if (numero > maior){
            maior = numero
        }
    }
    println("Maior número é: $maior")

    println("\n-------------------------\n")

    var biggest = numeros.maxOrNull()
    println("Maior número é: $biggest")

}
