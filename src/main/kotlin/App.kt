import utils.CalculateAreaUtils

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }
    }

    fun  start() {
        printHeader()
    }

    private fun printHeader() {
        println("""
            ======================================
            Console app for Calculating Area in 2D
            ======================================
            1. Calculate Rectangle Area
            2. Calculate Circle Area
            3. Calculate Triangle Area
            ======================================
            Enter menu ? (1/2/3)
            ======================================
        """.trimIndent())
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                openMenuRectangle()
            }
            "2" -> {
                openMenuCircle()
            }
            "3" -> {
                openMenuTriangle()
            }
            else -> {
                println("No menu matches")
                start()
            }
        }
    }

    private fun openMenuRectangle() {
        println("Enter Length = ")
        val length = readLine()?.toInt() ?: 0
        println("Enter Width = ")
        val width = readLine()?.toInt() ?: 0
        println("Area of Rectangle is = ${CalculateAreaUtils.calculateAreaRectangle(length, width)}")
    }

    private fun openMenuCircle() {
        println("Enter Radius = ")
        val radius = readLine()?.toInt() ?: 0
        println("Area of Circle is = ${CalculateAreaUtils.calculateAreaCircle(radius)}")
    }

    private fun openMenuTriangle() {
        println("Enter Base = ")
        val base = readLine()?.toInt() ?: 0
        println("Enter Height = ")
        val height = readLine()?.toInt() ?: 0
        println("Area of Triangle is = ${CalculateAreaUtils.calculateAreaTriangle(base, height)}")
    }
}