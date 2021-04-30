import LevelOne.adjacentElementsProduct
import LevelOne.adjacentElementsProductClever

fun main(args: Array<String>) {

    val inputArray = mutableListOf(3, 6, -2, -5, 7, 3)
    val value = adjacentElementsProduct(inputArray)
    val value2 = adjacentElementsProductClever(inputArray)
    println(value)
    println(value2)

}

