package Lab05;

public class Link {
    int studentId;
    int marks;
    Link next;
//constructor
    public Link(int studentId, int marks, Link next) {
        this.studentId = studentId;
        this.marks = marks;
        this.next = null;
    }
    //default constructor
    public Link() {
        this.studentId = 00;
        this.marks = 00;
        this.next = null;
    }
    //display all data properties of the link
    public void displayLink(){
        System.out.println("Student ID: " + studentId + ", Marks: " + marks);
    }
}
class LinkedList{

    private Link head;

    public LinkedList(){
        head = null;
    }

    // Check if the list is empty
    public boolean isEmpty(){
        return head == null;
    }
    // Insert new student record as the first
    public void InsertFirst(){
        Link newLink = new Link;

    }

}
