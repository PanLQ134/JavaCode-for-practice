package Operation;

import Book.BookList;

public class DelOperation implements IOperation{
    public void work(BookList booklist) {
        System.out.println("delete operation");
    }
}
