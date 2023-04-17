class Matrix(private val matrixAsString: String) {

    fun column(colNr: Int): List<Int> {
        val matrix = matrixAsString.split("\n").map { it.split(" ").map { it.toInt() } }
        return matrix.map { it[colNr - 1] }
    }

    fun row(rowNr: Int): List<Int> {
        val matrix = matrixAsString.split("\n").map { it.split(" ").map { it.toInt() } }
        return matrix[rowNr - 1]
    }

}
