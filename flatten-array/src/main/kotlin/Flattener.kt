object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        val result = mutableListOf<Any>()

         source.forEach{
            if(it is Collection<*>)
                result.addAll(flatten(it))
            else if (it != null)
                result.add(it)
        }

        return result
    }
}
