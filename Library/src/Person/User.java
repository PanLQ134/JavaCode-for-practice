package Person;


import Book.BookList;
import Operation.IOperation;

public abstract class User {
    protected String name;
    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    protected IOperation[] op;
    public  void doOperation(int choose, BookList bookList) {
        this.op[choose].work(bookList);
    }
}
