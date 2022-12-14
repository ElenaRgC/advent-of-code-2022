fun main() {
    fun part1(input: List<String>): Int {
        val rangos = input
        .map { it.split(",") }
        .flatMap { it.map { it.split("-") } }
        .flatMap { it.map { it.toInt() } }

        var paresContenidos = 0

        var inicioRango1 = 0
        var finRango1 = 0
        var inicioRango2 = 0
        var finRango2 = 0

        var i = 3

        while (i < rangos.size) {
            inicioRango1 = rangos[i-3]
            finRango1 = rangos[i-2]

            inicioRango2 = rangos[i-1]
            finRango2 = rangos[i]


            if ((inicioRango1 <= inicioRango2 && finRango1 >= finRango2) ||(inicioRango2 <= inicioRango1 && finRango2 >= finRango1)) {
                paresContenidos++
            }

            i += 4
        }

        return paresContenidos
    }


    fun part2(input: List<String>): Int {
        val rangos = input
            .map { it.split(",") }
            .flatMap { it.map { it.split("-") } }
            .flatMap { it.map { it.toInt() } }


        var paresContenidos = 0

        var inicioRango1 = 0
        var finRango1 = 0
        var inicioRango2 = 0
        var finRango2 = 0

        var i = 3

        while (i < rangos.size) {
            inicioRango1 = rangos[i-3]
            finRango1 = rangos[i-2]

            inicioRango2 = rangos[i-1]
            finRango2 = rangos[i]

            if ((inicioRango2 in inicioRango1..finRango1)||(inicioRango1 in inicioRango2..finRango2)||(finRango1 in inicioRango2..finRango2)||(finRango2 in inicioRango1..finRango1)) {
                paresContenidos++
            }

            i += 4
        }


        return paresContenidos
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day04_test")
    check(part1(testInput) == 2)
    check(part2(testInput) == 4)

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}
