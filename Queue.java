public class Queue {
    
    Node pointer;
    Node head;
    Node tail;

    public Queue(){}

    public void enqueue(Node add_val){
        if(head == null){
            head = add_val;
            tail = add_val;
        }else{
            tail.next = add_val;
            tail = tail.next;
        }
    }

    public Node dequeue(){
        if(head == null) return null;
        Node remove = head;
        head = head.next;
        return remove;
    }

    public boolean isEmpty(){
        if(head == null) return true;
        return false;
    }

    public void printQueueValuesInOrder(){
        pointer = head;
        while(pointer != null){
            System.out.println(pointer.position.rowPos + ", " + pointer.position.colPos);
            pointer = pointer.next;
        }
        System.out.println("");
    }

}
