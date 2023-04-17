object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val result = mutableMapOf<String, Int>()

        phrase.split(Regex("[^a-zA-Z0-9']+"))
            .map { it.trim('\'') }
            .filter { it.isNotBlank() }
            .map { it.lowercase() }
            .forEach { result[it] = (result[it] ?: 0) + 1 }

        return result
    }
}
