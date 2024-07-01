import java.util.Arrays;

public class MyArrayList implements IList{

    public int[] element;
    private int capacity=5;
    private int size=0;

    public MyArrayList() {
        element= new int[capacity];
    }

    @Override
    public void add(int data) {
        if(isFull()){
            element= Arrays.copyOf(element,2*capacity);
            capacity*=2;
        }
            this.element[size++]=data;
    }

    @Override
    public void add(int pos, int data) {
        if(isFull()){
            element= Arrays.copyOf(element,2*capacity);
            capacity*=2;
        }
        int end=(this.size)-1;
        while(end>=pos) {
            element[end+1]=element[end];
            end--;
        }
        element[pos]=data;
        size++;
    }

    @Override
    public boolean contains(int toFind) {
        for(int i=0;i<size;i++) {
            if(element[i] == toFind) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int indexOf(int toFind) {
        for(int i=0;i<size;i++) {
            if ( element[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int pos) {

        checkPosOfAdd(pos);
        return element[pos];

    }
    private void checkPosOfAdd (int pos) {
        if(pos>size || pos<=0) {
            throw new PosException("unlegal pos");
        }
    }
    @Override
    public void set(int pos, int value) {
        checkPosOfAdd(pos);
        element[pos]=value;
    }

    @Override
    public void remove(int toRemove) {
        int key=indexOf(toRemove);
        while(key<size-1) {
            element[key]=element[++key];
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size=0;

    }

    @Override
    public void display() {
        for(int x=0;x<size;x++) {
            System.out.println(element[x]+ " ");
        }
    }

    @Override
    public boolean isFull() {
        if(this.size==this.capacity){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
