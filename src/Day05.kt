fun main() {
    fun part1(input: List<String>): Int {

        return 1
    }


    fun part2(input: List<String>): Int {

        return 2
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day05_test")
    check(part1(testInput) == 2)
    //check(part2(testInput) == 4)

    val input = readInput("Day05")
    println(part1(input))
    println(part2(input))
}
