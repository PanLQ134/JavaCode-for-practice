package Book;

public class BookList {
    private book[] books;
    private int bookNum;
    public BookList() {
        this.books= new book[10];
        this.books[0] =new book("操作系统", 20);
        this.books[1] =new book("组成原理", 20);
        this.books[2] =new book("网络基础", 20);
        this.books[3] =new book("数据结构", 20);
        this.bookNum=4;
    }

    public book[] getBooks() {
        return books;
    }

    public void setBooks(book[] books) {
        this.books = books;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }
}
