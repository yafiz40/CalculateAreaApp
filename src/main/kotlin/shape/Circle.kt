package shape

class Circle(private val radius: Int): Shape() {
    init {
        shapeName = "Circle"
    }

    override fun calculateArea(): Double {
        return 3.4 * radius * radius
    }

    override fun calculateCircular(): Double {
        return return 3.4 * radius * 2
    }
}