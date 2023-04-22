/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;



public class Node <E>{
    
    public E data;
    public Node<E> next;

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }
    public void setData(E data) {
        this.data = data;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
    
    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }   
}


   
