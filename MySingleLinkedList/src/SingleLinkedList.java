import java.util.List;

public class SingleLinkedList implements IOperation{

    static class ListNode {
        public int data;
        public ListNode next;
        public ListNode(int data) {
            this.data=data;
        }
    }
    public ListNode head;
    private int size=0;
    @Override
    public void addFirst(int data) {
        ListNode node=new ListNode(data);
        if(head==null) {
            head=node;
        } else {
            node.next=head;
            head=node;
        }
        size++;

    }

    @Override
    public void addLast(int data) {
        ListNode node=new ListNode(data);
        if(head==null) {
            head=node;
        } else {
            ListNode tmp=head;
            while(tmp.next!=null) {
                tmp=tmp.next;
            }
            tmp.next=node;

        }
        size++;
    }

    @Override
    public boolean addIndex(int index, int data) {
        if(index<0 || index>=this.size+1) {
            return false;
        }
        if(index==0) {
            this.addFirst(data);
        } else {
            ListNode node=new ListNode(data);
            ListNode tmp=head;
            while((index--)>1) {
                tmp=tmp.next;
            }
            node.next=tmp.next;
            tmp.next=node;
            size++;

        }
        return true;
    }

    @Override
    public boolean contains(int key) {
        ListNode tmp=head;
        for(;tmp!=null;tmp=tmp.next) {
            if(tmp.data==key) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(int key) {
        if(head.data==key) {
            head=head.next;
            size--;
            return;
        }
        ListNode tmp =head;
        for (;tmp!=null;tmp=tmp.next) {
            if(tmp.next.data==key) {
                tmp.next=tmp.next.next;
                size--;
                return;
            }
        }
    }

    @Override
    public void removeAllKey(int key) {
        while(head.data==key) {
            head=head.next;
            size--;
        }

        ListNode tmp =head;
        for (;tmp.next!=null;tmp=tmp.next) {
            while(tmp.next.data==key) {
                tmp.next=tmp.next.next;
                size--;
            }
        }


    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void display() {
        ListNode tmp=head;

        while(tmp!=null) {
            System.out.print(tmp.data);
            if(tmp.next!=null) {
                System.out.print("->");
            }
            tmp=tmp.next;
        }


    }

    @Override
    public void clear() {
        head.next=null;
    }
}
