public interface IOperation {
    public void addFirst(int data);                 //finish
    //尾插法
    public void addLast(int data);                  //finish
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data);    //finish
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key);               //finish
    //删除第一次出现关键字为key的节点
    public void remove(int key);                    //finish
    //删除所有值为key的节点
    public void removeAllKey(int key);              //finish
    //得到单链表的长度
    public int size();                              //finish
    public void display();                          //finish
    public void clear();                            //finish
}
