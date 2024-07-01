package Operation;

import Book.BookList;

public class ExitOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("exit system");
        System.exit(0);
    }
}
