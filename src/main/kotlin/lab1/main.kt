package lab1

fun main() {
    val books = "1. Отцы и дети // И.С.Тургенев // 1862\n"+
            "2. Горе от ума // А.С.Грибоедов // 1825\n"+
            "3. Война и мир // Л.Н.Толстой // 1867\n"+
            "4. Евгений Онегин // А.С.Пушкин // 1833\n".trimIndent()
    val listBooks: List<Book>? = parserBooks(books)
    if (listBooks !=null) {
        println("The oldest book was published: ${oldestBook(listBooks)}")
        println("The youngest book was published: ${oldestBook(listBooks)}")
        println("The longest name of the book is: ${oldestBook(listBooks)}")
        println("The shortest name of the book is: ${oldestBook(listBooks)}")
    } else {
        println("List of the books is empty")
    }

}
