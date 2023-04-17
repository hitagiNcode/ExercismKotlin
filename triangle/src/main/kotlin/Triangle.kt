class Triangle<out T : Number>(a: T, b: T, c: T) {

    init {
        if(a.toDouble() == 0.0 || b.toDouble() == 0.0 || c.toDouble() == 0.0)
            throw IllegalArgumentException("Sides must be greater than 0")
        if (a.toDouble() + b.toDouble() < c.toDouble() ||
            a.toDouble() + c.toDouble() < b.toDouble() ||
            b.toDouble() + c.toDouble() < a.toDouble())
            throw IllegalArgumentException("Triangle inequality violation")
    }

    val isEquilateral: Boolean = a == b && b == c
    val isIsosceles: Boolean = (a == b || b == c || c == a)
    val isScalene: Boolean = a != b && b != c && c != a
}
