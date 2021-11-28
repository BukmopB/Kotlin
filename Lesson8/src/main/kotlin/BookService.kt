package bookservice

class LendBookManager(private val bookService: BookService) {
    fun checkout(bookId: Int, memberId: Int) { // вот эту функцию тестируем
        if(bookService.inStock(bookId)) {
            bookService.lend(bookId, memberId)
        } else {
            throw IllegalStateException("Book is not available")
        }
    }
}

interface BookService { // нужно сделать mock
    fun inStock(bookId: Int): Boolean
    fun lend(bookId: Int, memberId: Int)
}
// Тестируем бизнес логику класса LendBookManager
// 1. создаем мок BookService
// 2. настраиваем этот мок чтобы     BookService.inStock(100) -> должен возвратить true
// 3. создаем экземпляр LendBookManager и передаем в конструктор настроенный мок BookService
// 4. вызываем BookService.checkout(...)
// 5. нужно убедиться, что у мока BookService вызывался метод lend с нужным параметром
// 6. протестить нужно и исключение
