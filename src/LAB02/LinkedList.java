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

    // This method adds a new node at the beginning of the list
    public void addFirst(int data) {
        if(isEmpty()) {
            head = new ChainNode(data);
        } else {
            head = new ChainNode(data, head);
        }
        size++;
    }

    // This method adds a new node at the end of the list
    public void addLast(int data) {
        if (isEmpty()){
            head = new ChainNode(data);
        }else {
              ChainNode temp = head;
              while (temp.next != null) {
                    temp = temp.next;
              }
                temp.next = new ChainNode(data);
        }
        size++;
    }

    // This method removes the first node from the list
    public int removeFirst() {
        int removedData = 0;
        if(isEmpty()) {
            System.out.println("List is empty");
        } else {
            removedData = head.data;
            head = head.next;
            size--;
        }
        return removedData;
    }

    public int removeLast() {
        int removedata = 0;
        if (isEmpty()) {
            System.out.println("List is empty");
        }else {
            if(size == 1) {
                removedata = head.data;
                head = null;
            }
            else {
                ChainNode temp = head;
                while (temp.next != null){
                    if (temp.next.next != null) {
                        temp = temp.next;
                    }
                    removedata = temp.next.data;
                    temp.next = null;
                }
                size--;
            }
        }
        return removedata;
    }
    
}
