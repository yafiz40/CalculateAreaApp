package utils

@Deprecated("Change implementation to Shape Class")
class CalculateAreaUtils {
    fun calculateAreaRectangle(length: Int, width: Int): Int {
        return length * width
    }

    fun calculateAreaCircle(radius: Int): Double {
        return 3.4 * radius * radius
    }

    fun calculateAreaTriangle(base: Int, height: Int): Double {
        return 0.5 * base * height
    }
}