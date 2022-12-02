fun main() {
    fun part1(input: List<String>): Int {
        var valorJugada = 0
        var valorRonda = 0

        var valorTotal = 0

        for (i in input) {
            valorRonda = 3

            when (i[0]) {
                'A' -> when (i[2]) {
                    'Y' -> valorRonda = 6
                    'Z' -> valorRonda = 0
                }

                'B' -> when (i[2]) {
                    'X' -> valorRonda = 0
                    'Z' -> valorRonda = 6
                }

                'C' -> when (i[2]) {
                    'X' -> valorRonda = 6
                    'Y' -> valorRonda = 0

                }
            }

            when (i[2]) {
                'X' -> valorJugada = 1
                'Y' -> valorJugada = 2
                'Z' -> valorJugada = 3
            }
            //println("$valorJugada, $valorRonda")
            valorTotal += valorJugada + valorRonda
        }

        return valorTotal
    }

    fun part2(input: List<String>): Int {
        var valorJugada = 0
        var valorRonda = 0

        var valorTotal = 0

        for (i in input) {
            valorRonda = 3

            when (i[0]) {
                'A' -> when (i[2]) {
                    'X' -> {
                        valorRonda = 0
                        valorJugada = 3
                    }
                    'Z' -> {
                        valorRonda = 6
                        valorJugada = 2
                    } else -> valorJugada = 1

                }

                'B' -> when (i[2]) {
                    'X' -> {
                        valorRonda = 0
                        valorJugada = 1
                    }

                    'Z' -> {
                        valorRonda = 6
                        valorJugada = 3
                    }

                    else -> valorJugada = 2
                }

                'C' -> when (i[2]) {
                    'X' -> {
                        valorRonda = 0
                        valorJugada = 2
                    }
                    'Z' -> {
                        valorRonda = 6
                        valorJugada = 1
                    } else -> valorJugada = 3
                }
            }

            //println("$valorJugada, $valorRonda")
            valorTotal += valorJugada + valorRonda
        }

        return valorTotal
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)
    check(part2(testInput) == 12)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
