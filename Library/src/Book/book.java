package Book;

public class book {
    public String name;
    public int price;
    public boolean IsBorrowed=false;
    public book(String name, int price) {
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBorrowed() {
        return IsBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        IsBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "book{" +
                "书名'" + name + '\'' +
                ", 价格=" + price +
                ", 状态=" + (IsBorrowed?"已借出":"未借出 ") +
                '}';
    }
}
