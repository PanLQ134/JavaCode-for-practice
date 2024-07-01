package Operation;

import Book.BookList;

public class BorrowOperation implements IOperation {
    public void work(BookList bookList) {
        System.out.println("Borrowed operation");
    }
}
