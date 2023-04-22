/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;
import java.util.Scanner;

public class onlineStore {
    public static void main(String[]args ){
    
        Scanner in = new Scanner(System.in);
        System.out.println("1. Add new item to the store\n" +
"2. View items in the store in ascending order of price\n" +
"3. View items in the store in descending order of price\n" +
"4. Search for items with a given price.\n" +
"5. Exit the system.\n ");
         store o = new store();
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        SinglyLinkedList items = new SinglyLinkedList();
        o.setId(111);
        o.setType("cup");
        o.setBrand("M&N");
        o.setPrice(5);
        o.setQuantity(12);
        items.addLast(o.getId()+o.getType()+ o.getBrand()+o.getPrice()+o.getQuantity());
        o.print(items);
        switch(choice){
            case 1:
                o.addItem();
            case 2:
                o.viewItemAscending(items);
            case 3:
                o.viewItemDescending(items);
            case 4:
                System.out.println("Enter the item to search: ");
                int itemId= in.nextInt();
                o.searchItem(items, itemId);
            case 5:
                System.out.print("Have a nice day. ");
        
        }
        
    }
    
}
