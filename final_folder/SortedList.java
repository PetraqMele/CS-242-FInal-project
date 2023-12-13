package final_folder;

public class SortedList {
    public Node head;
    public Node tail;

    public SortedList(){
        head = null;
        tail = null;
    }

    public void append(Node newNode) {
        if (head == null) {
           head = newNode;
           tail = newNode;
        }
        else {
           tail.next = newNode;
           newNode.previous = tail;
           tail = newNode;
        }
     }
}
