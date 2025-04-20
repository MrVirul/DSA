package LAB02;

public class LinkedList {
    private int size;
    private ChainNode head;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int getSize() {
        return size;
    }
    public void addFirst(int data) {
        if(isEmpty()) {
            head = new ChainNode(data);
        }
    }
}
