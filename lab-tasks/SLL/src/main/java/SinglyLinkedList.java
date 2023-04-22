


public class SinglyLinkedList<E> {
    
    private Node<E> head;
    private Node<E> tail;
    private Node<E> curr;   // Acess to current element
    private int size;
    
    public SinglyLinkedList() {

        head = null;
        tail = null;
        curr = null;
        size = 0;
    }
    
    public int size() {
        return size;
    }
        
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void clear(){
        head=tail=null;
        size=0;
    }
    
    public E first(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }
    
    public E last(){
        if(isEmpty()){
            return null;}
        return tail.getElement();
    } 
    
    public void addFirst(E e){
        
        head = new Node<>(e, head);
        if(size==0)
            tail=head;
        size++;
    }
    
    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if(isEmpty()){
            head=newest;
        }else{
            tail.setNext(newest);
        }
        tail=newest;
        size++;
    }
    
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        E answer = head.getElement();
        head= head.getNext();
        size--;
        if(size==0){
            tail=null;
        }
        return answer;
    }
    
    
    public E removelast(){
    if(isEmpty()){
        return null;
    }
    E answer = tail.getElement();
    size--;
     if(size==0){
        tail=head=null;
    }
     curr=head;
     while(curr!= null){
         curr=curr.getNext();
     }
     curr.setNext(null);
     answer=tail.getElement();
     tail=curr;
     
     return answer;
    }
    public void print(){ 
        if(head==null)
            System.out.print("null");
        
    curr=head;
    while(curr!= null){
        System.out.print(curr.getElement() + " ");
        curr= curr.getNext();
    }
    }
    
}
