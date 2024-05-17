public class Main {
    public static void main(String[] args) {
        int num=9;
        int sum=0;
        for(num=9;num<100;num++) {
            if(num%10==9) {
                System.out.print(num+" ");
                sum++;
            }
            if(num/10==9){
                System.out.print(num+" ");
                sum++;
            }
        }
        System.out.println();
        System.out.println(sum);
    }




    public static void main111(String[] args) {
        int year = 1000;
        int i=1;
        for (year=1000; year <= 2000; year += 4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.print(year + " ");
                i++;
                if(i%25==0) {
                    System.out.println(" ");
                    i=1;
                }
            }
        }
    }

    public static void main11() {
        int num=1;
        boolean flg=true;
        for(num=1 ;num <= 100 ;num++){
            for (int i=2 ;i<num ; i++) {
                if(num%i == 0) {
                    flg = false;
                    break;
                }
            }
            if(flg) {
                System.out.print(num+" ");
            }
            flg=true;
        }
    }

    public static void main1 () {
        int num = 5;
        boolean flg = true;
        for (int i=2 ;i<(num/2) ; i++) {
            if(num%i == 0)
            {
                flg = false;
                break;
            }
        }
        if(flg==true){
            System.out.println("the number " + num + " is prime number");
        }else {
            System.out.println("the number " + num + " isn't prime number");
        }
    }
}