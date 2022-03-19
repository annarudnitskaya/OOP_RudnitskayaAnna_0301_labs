package lab1

data class Book(val number: String, val name: String, val authors: String) {}

fun parserBooks(books: String): List<Book>? {
    if (books.isEmpty()) { return null }
    val splitString = books.split('\n')
    val listBooks = mutableListOf<Book>()
    for (str in splitString) {
        val number = books.substringBefore('.')
        val name = books.substringBeforeLast('.').substringAfter("//")
        val author = books.substringBeforeLast("//").substringAfter("//")
        val yearBook = books.substringAfterLast("//")
        val strBook = Book(name, author, yearBook)
        listBooks.add(strBook)
    }
    return listBooks
}

fun oldestBook(){}

fun youngestBook(){}

fun longestNameBook(){}

fun shortestNameBook(){}

fun main() {
    val books = "1. Отцы и дети // И.С.Тургенев // 1862\n"+
            "2. Горе от ума // А.С.Грибоедов // 1825\n"+
            "3. Война и мир // Л.Н.Толстой // 1867\n"+
            "4. Евгений Онегин // А.С.Пушкин // 1833\n".trimIndent()
    val listBooks: List<Book>? = parserBooks(books)
    if (listBooks !=null) {
        println("The oldest book is: ${oldestBook()}")
        println("The youngest book is: ${oldestBook()}")
        println("The longest name of the book is: ${oldestBook()}")
        println("The shortest name of the book is: ${oldestBook()}")

    }

}
