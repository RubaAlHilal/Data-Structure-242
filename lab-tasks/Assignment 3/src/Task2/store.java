/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;
import java.util.Scanner;
/**
 *
 * @author ruba5
 */
public class store {
    static Scanner in = new Scanner(System.in);
    
    private String type, brand;
    private double price;       
    private int id, quantity;

    public store() {
    }

    public store(int id, String type, String brand, double price, int quantity) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
    public void print(SinglyLinkedList list){
     while(!list.isEmpty()){
            list.print();
        }
    }
    public void addItem(){
    SinglyLinkedList items = new SinglyLinkedList();
    
   store o = new store();
   System.out.print("Enter id: " );
   int i = in.nextInt();
   o.setId(i);
   
   System.out.print("Enter type: ");
   String t = in.nextLine();
   o.setType(t);
   
   System.out.print("Enter brand: ");
   String b = in.nextLine();
   o.setBrand(b);
   
   System.out.print("Enter price: ");
   double p = in.nextDouble();
   o.setPrice(p);
   
   System.out.print("Enter quantity: ");
   int q = in.nextInt();
   o.setQuantity(q);
   
        items.addLast(o.getId()+o.getType()+o.getBrand()+o.getPrice()+o.getQuantity());
        
        if(items.isEmpty()){
            System.out.println("There is no item added. ");
        }
        print(items);
    }
    
    
    public void viewItemAscending(SinglyLinkedList list){
        
    SinglyLinkedList list2 = new SinglyLinkedList();
    list2.addLast(list.removeFirst());
    while(!list.isEmpty()){
    int temp = list.removeFirst();
   list2.addLast(temp);
    while(temp<list2.first()){
        list2.addLast(list2.removeFirst());
    }
    }print(list2);
}
    
    
    public void viewItemDescending(SinglyLinkedList list){
    
        SinglyLinkedList list2 = new SinglyLinkedList();
    list2.addLast(list.removeFirst());
    while(!list.isEmpty()){
    int temp = list.removeFirst();
   list2.addLast(temp);
    while(temp>list2.first()){
        list2.addLast(list2.removeFirst());
    }
    }print(list2);
     }
    
    public void searchItem(SinglyLinkedList list,double itemPrice){
        while(!list.isEmpty()){
            if(itemPrice==id)
            print(list); 
        }
        System.out.println("item not found. ");    
    }
    
    @Override
    public String toString() {
        return "store{" + "id=" + id + ", type=" + type + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
}
