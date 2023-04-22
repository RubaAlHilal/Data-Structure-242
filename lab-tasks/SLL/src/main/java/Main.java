
public class Main {
    public static void main(String args[]){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head= new Node(10);
        Node one = new Node(12);
        Node two = new Node(13);
        
        sll.head.next = one;
        one.next = two;
        
        sll.print();
        System.out.println("length: "+sll.size());
        System.out.println();
        
        sll.insertFirst(20);
        sll.print();
        
        
    }
}
