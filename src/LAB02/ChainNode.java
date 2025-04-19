package LAB02;
class ChainNode{
    ChainNode next;
    int data;

    public ChainNode(int data) {
        this.next = null;
        this.data = data;
    }
    public ChainNode(int data, ChainNode next) {
        this.next = next;
        this.data = data;
    }
}
