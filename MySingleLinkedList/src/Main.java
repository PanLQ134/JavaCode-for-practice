public class Main {
    public static void main(String[] args) {
        SingleLinkedList test =new SingleLinkedList();
        test.addLast(1);
        test.addLast(2);
        test.addLast(3);
        test.addLast(4);
        test.addLast(5);
        test.addLast(6);
        test.addLast(7);
        test.addIndex(0,100);
        test.addIndex(2,100);
        test.addIndex(4,100);
        test.addIndex(6,100);
        test.addIndex(7,100);
        test.addIndex(9,100);
        test.addIndex(6,100);
        //test.addIndex(4,100);

        test.removeAllKey(100);
        test.display();
        System.out.println();
        System.out.println(test.size());

    }
}