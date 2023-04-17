data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(private val matrix: List<List<Int>>) {

    fun saddlePoints(): Set<MatrixCoordinate> {
        val saddlePoints = emptySet<MatrixCoordinate>().toMutableSet()

        for (row in matrix.indices) {
            for (col in matrix[row].indices) {
                val value = matrix[row][col]
                val isMaxInRow = value == matrix[row].maxOrNull()
                val isMinInCol = value == matrix.minOfOrNull { it[col] }
                if (isMaxInRow && isMinInCol) {
                    saddlePoints += MatrixCoordinate(row + 1, col + 1)
                }
            }
        }

        return saddlePoints
    }

}
