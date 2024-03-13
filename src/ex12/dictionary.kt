package ex12

//Use a map to represent a dictionary of words and their translations.

fun main() {
    val dictionary: MutableMap<String, String> = mutableMapOf(
        "hello" to "olá",
        "apple" to "maçã",
        "car" to "carro",
        "house" to "casa"
    )

    var continueLoop = true

    while (continueLoop) {
        println("Escolha uma opção:")
        println("1. Adicionar uma nova palavra")
        println("2. Traduzir uma palavra")
        println("3. Sair")

        val choice = readLine()?.trim()

        when (choice) {
            "1" -> {
                println("Digite a palavra que gostaria de adicionar ao dicionário (em inglês):")
                val newWord = readLine()?.trim()
                if (newWord != null) {
                    println("Digite a tradução de '$newWord' (para português):")
                    val translation = readLine()?.trim()
                    if (translation != null) {
                        dictionary[newWord] = translation
                        println("'$newWord' foi adicionada com sucesso ao dicionário! Com a tradução: '$translation'.")
                    } else {
                        println("Tradução inválida.")
                    }
                } else {
                    println("Palavra inválida.")
                }
            }
            "2" -> {
                println("Qual palavra gostaria de traduzir? (Digite em inglês) ")
                val wordToSearch = readLine()?.trim()
                if (wordToSearch != null) {
                    val translation = dictionary[wordToSearch]
                    if (translation != null) {
                        println("A tradução de '$wordToSearch' é '$translation'.")
                    } else {
                        println("Palavra não encontrada no dicionário.")
                    }
                } else {
                    println("Palavra inválida.")
                }
            }
            "3" -> {
                continueLoop = false
            }
            else -> {
                println("Opção inválida.")
            }
        }

        println("Dicionário Completo:")
        for ((key, value) in dictionary) {
            println("$key -> $value")
        }
    }
}
