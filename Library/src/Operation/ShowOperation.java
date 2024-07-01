package Operation;

import Book.BookList;

public class ShowOperation implements IOperation {
    public void work(BookList bookList) {
        System.out.println("Show operation");
    }
}
