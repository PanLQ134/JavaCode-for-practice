package Person;
import Book.BookList;
import Operation.*;
import java.util.Scanner;

public class AdminUser extends User {
    public AdminUser(String name){
        super(name);
        this.op=new IOperation[] {
                new ExitOperation(),
                new FindOperatoin(),
                new ShowOperation(),
                new AddOperation(),
                new DelOperation(),
        } ;
    }

    @Override
    public int menu(){
        System.out.println("--Enter Your Operation(Admin)--");
        System.out.println("1.FindBook 2.ShowBook");
        System.out.println("3.AddBook  4.DelBook");
        System.out.println("0.ExitSystem");
        System.out.println("-------------------------");

        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }



}
