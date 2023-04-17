object ScrabbleScore {

    private val onePointLetters = setOf('a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't')
    private val twoPointLetters = setOf('d', 'g')
    private val threePointLetters = setOf('b', 'c', 'm', 'p')
    private val fourPointLetters = setOf('f', 'h', 'v', 'w', 'y')
    private val fivePointLetters = setOf('k')
    private val eightPointLetters = setOf('j', 'x')
    private val tenPointLetters = setOf('q', 'z')

    private fun scoreLetter(c: Char): Int {
        return when (c.lowercaseChar()) {
            in onePointLetters -> 1
            in twoPointLetters -> 2
            in threePointLetters -> 3
            in fourPointLetters -> 4
            in fivePointLetters -> 5
            in eightPointLetters -> 8
            in tenPointLetters -> 10
            else -> 0
        }
    }

    fun scoreWord(word: String): Int {
        return word.sumOf { scoreLetter(it) }
    }
}
