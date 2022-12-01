fun main() {
    fun part1(input: List<String>): Int {
        var suma = 0
        var sumaMayor = 0

        for (i in input) {
            if (i == "") {
                if (suma > sumaMayor) {
                    sumaMayor = suma
                }
                suma = 0
            } else {
                suma += i.toInt()
            }
        }

        return sumaMayor
    }

    fun part2(input: List<String>): Int {
        var nuevaSuma = 0
        var sumaMayor = 0
        var segundaMayor = 0
        var terceraMayor = 0

        for (i in input) {
            if (i == "") {
                if (nuevaSuma > sumaMayor) {

                    terceraMayor = segundaMayor
                    segundaMayor = sumaMayor
                    sumaMayor = nuevaSuma

                } else if (nuevaSuma > segundaMayor) {
                    terceraMayor = segundaMayor
                    segundaMayor = nuevaSuma
                } else if (nuevaSuma > terceraMayor) {
                    terceraMayor = nuevaSuma
                }

                nuevaSuma = 0
            } else {
                nuevaSuma += i.toInt()
            }
        }

        return sumaMayor + segundaMayor + terceraMayor
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24000)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
