fun buscarCaracter(elemento: String): Char {
    var i = 0
    var j = 0

    var caracterRepetido = ' '
    while (i < elemento.length / 2) {
        j = elemento.length / 2
        while (j < elemento.length) {
            if (elemento[i] == elemento[j]) {
                caracterRepetido = elemento[i]
                return elemento[i]
            }
            j++
        }
        i++
    }

    return caracterRepetido
}

fun comprobarValor(caracter: Char): Int {
    var caracteres: String = "abcdefghijklmnopqrstuvwxyzABCDEFGHYJKLMNOPQRSTUVWXYZ"
    var valor = 0

    var i = 0
    while (i < caracteres.length) {
        if (caracteres[i] == caracter) {
            valor = i + 1
        }
        i++
    }

    return valor
}


fun main() {
    fun part1(input: List<String>): Int {
        var caracterRepetido = ' '
        var valorTotal = 0

        for (elemento in input) {
            caracterRepetido = buscarCaracter(elemento)
            valorTotal += comprobarValor(caracterRepetido)
        }

        return valorTotal
    }


    fun part2(input: List<String>): Int {
        var stringBadges = ""
        var fila = 2
        var caracter = 0

        while (fila < input.size) {

            for (caracterA in input[fila]) {
                for (caracterB in input[fila - 1]) {
                    for (caracterC in input[fila - 2]) {
                        if (caracterA == caracterB && caracterB == caracterC) {
                            if ((fila+1) / 3 == stringBadges.length +1) {
                                stringBadges += caracterA
                            }
                        }
                    }
                }
            }

            fila += 3
        }

        //println(stringBadges.length)

        var valorTotal = 0

        var i = 0
        while (i < stringBadges.length) {
            valorTotal += comprobarValor(stringBadges[i])
            i++
        }

        return valorTotal
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    check(part1(testInput) == 157)
    check(part2(testInput) == 70)

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}
