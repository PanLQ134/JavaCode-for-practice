package Operation;

import Book.BookList;

public class AddOperation implements IOperation{
    public void work(BookList booklist) {
        System.out.println("add operation");
    }
}
