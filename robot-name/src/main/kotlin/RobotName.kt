class Robot {

    var name = getNewName()

    companion object{
        private val usedNames = mutableSetOf<String>()
    }

    fun reset() {
        name = getNewName()
    }

    private fun getNewName(): String {
        val letterSet = ('A'..'Z')
        val numberSet = (0..9)

        fun generateName () = letterSet.shuffled().take(2).joinToString("") +
                numberSet.shuffled().take(3).joinToString("")

        var newName = generateName()

        while (usedNames.contains(newName)) {
            newName = generateName()
        }

        usedNames.add(newName)

        return newName
    }

}

