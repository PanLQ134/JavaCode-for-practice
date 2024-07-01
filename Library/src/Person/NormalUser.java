package Person;

import Operation.*;

import java.util.Scanner;

public class NormalUser extends User {

    public NormalUser(String name){
        super(name);
        op=new IOperation[]{
                new ExitOperation(),
                new FindOperatoin(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu(){
        System.out.println("--Enter Your Operation--");
        System.out.println("1.FindBook   2.BorrBook");
        System.out.println("3.ReturnBook 0.ExitSystem");
        System.out.println("-------------------------");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();

    }




}
