class Squares (private val n: Int) {

    private val numberArray = IntArray(n) { it + 1 }

    fun sumOfSquares() : Int {
        return numberArray.sumOf { it * it }
    }

    fun squareOfSum() : Int {
        return numberArray.sum().let { it * it }
    }

    fun difference() : Int {
        return squareOfSum() - sumOfSquares()
    }
}
