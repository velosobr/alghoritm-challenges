package LevelOne

/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.
 */
fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    val first = inputArray.indices.first()
    val last = inputArray.indices.last()
    var element = 0
    var actualElement = 0
    for (i in inputArray.indices) {

        if (i == first) {
            element = inputArray[i] * inputArray[i + 1]
            actualElement = element
        } else if (i == last) {
            actualElement = inputArray[i] * inputArray[i - 1]
            if (actualElement > element) {
                element = actualElement
            }
        } else {
            actualElement = inputArray[i] * inputArray[i + 1]
            if (actualElement > element) {
                element = actualElement
            }
            actualElement = inputArray[i] * inputArray[i - 1]
            if (actualElement > element) {
                element = actualElement
            }
        }
    }
    return element
}

fun adjacentElementsProductClever(a: List<Int>) = a.zipWithNext(Int::times).maxOrNull()!!