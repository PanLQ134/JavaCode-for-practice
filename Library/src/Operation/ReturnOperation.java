package Operation;

import Book.BookList;

public class ReturnOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("Find operation");
    }
}
