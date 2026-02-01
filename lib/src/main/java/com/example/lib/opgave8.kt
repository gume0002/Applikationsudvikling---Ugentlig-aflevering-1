fun main() {
    val words = listOf("apple", "hi", "banana", "cat", "elephant")

    val result = filterByLength(words, 5)
    println(result)
}

fun filterByLength(words: List<String>, minLength: Int): List<String> {
    return words.filter { word ->
        word.length >= minLength
    }
}