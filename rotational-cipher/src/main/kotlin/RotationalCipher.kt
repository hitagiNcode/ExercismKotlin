class RotationalCipher (private val shift: Int) {

    fun encode(text: String): String {
        var result = ""

        for (c in text) {
            if (c.isLetter()) {
                val start = if (c.isUpperCase()) 'A' else 'a'
                result += (start + (c - start + shift) % 26)
            } else {
                result += c
            }
        }

        return result
    }
}
