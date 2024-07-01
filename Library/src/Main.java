import Person.*;
import Book.*;
import java.util.Scanner;


public class Main {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name->");
        String name= scanner.nextLine();
        System.out.print("enter your identify-> (1.admin 2.normal)");
        int choise=scanner.nextInt();

        if(choise==1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }

    }

    public static void main(String[] args) {
        BookList bookList=new BookList();
        User A=login();
        while(true) {
            int choise=A.menu();
            A.doOperation(choise,bookList);
            System.out.println();
            System.out.println();
        }
    }
}