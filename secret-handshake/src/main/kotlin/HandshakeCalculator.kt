object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {

        val result = mutableListOf<Signal>()

        number.toString(2).reversed().forEachIndexed { index, c ->
            if (c == '1') {
                when (index) {
                    0 -> result.add(Signal.WINK)
                    1 -> result.add(Signal.DOUBLE_BLINK)
                    2 -> result.add(Signal.CLOSE_YOUR_EYES)
                    3 -> result.add(Signal.JUMP)
                    4 -> result.reverse()
                }
            }
        }

        return result
    }
}
