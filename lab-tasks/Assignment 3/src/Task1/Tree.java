/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;


import java.util.Scanner;

public class Tree {

    static Scanner in = new Scanner(System.in);
    
    public static void printInOrder(TNode root){
        if(root==null)
            return;
        
       printInOrder(root.getLeft());
       System.out.print("  "+root.getItem()+"\n");
       printInOrder(root.getRight());
    }
            
     public static void inorderPrint(){
     BinaryTree t = new BinaryTree();
         if (t.getRoot()!= null){
      printInOrder(t.getRoot());
    }
     }
         
    
     public static void printpreOrder(TNode root){
        if(root==null)
            return;
        
        char o =(char) root.getItem();
       switch(o) {
                case '+':
                    System.out.print('+'); 
                    break;
                case '-':
                    System.out.print('-'); 
                    break;
                case '*':
                    System.out.print('*'); 
                    break;
                case '/':
                    System.out.print('/'); 
                    break;
       }
       printInOrder(root.getLeft());
       printInOrder(root.getRight());
    }
     public static void preorderPrint(){
     BinaryTree t =new BinaryTree();
         if (t.getRoot()!= null){
      printpreOrder(t.getRoot());
    }
}
     
      public static void printpostOrder(TNode root){
        if(root==null)
            return;
        
       printInOrder(root.getLeft());
       printInOrder(root.getRight());
       
       char o = (char) root.getItem();
       
       switch (o) {
                case '+':
                    System.out.print('+'); 
                    break;
                case '-':
                    System.out.print('-'); 
                    break;
                case '*':
                    System.out.print('*'); 
                    break;
                case '/':
                    System.out.print('/'); 
                    break;
            }
    }
     public static void postorderPrint(){
     BinaryTree t =new BinaryTree();
         if (t.getRoot()!= null){
      printpostOrder(t.getRoot());
    }
}
     private static boolean isOperator(char c){
         if(c=='+'|| c=='-'||c=='*'||c=='/'){
         return true;}
         return false;
     }     
     public static void  separateExpression(SinglyLinkedList expression){
         
         
         LinkedStack<Integer> operand = new LinkedStack<>();
         LinkedQueue operator = new LinkedQueue<>();
         
         int treeSize= expression.size();
         for(int i=0;i<treeSize;i++){
         if(isOperator((expression.first()))) {
             operator.enqueue(expression.first());
             } else {
             operand.push((Integer)expression.removeFirst());
             }
          
         }
     
         
     }
     
         
     
     private static void writeExpression(SinglyLinkedList treeInput){
         
         String e = in.nextLine();
         treeInput.moveToStart();
         int treeSize= treeInput.size();
         System.out.print("Write expression : ");
        for (int i=0;i<treeSize;i++)
             treeInput.addLast(e);
         separateExpression(treeInput);
         
         
         
     }
    public static void main(String[] args) {
        
              
               TNode<Integer> root;
               TNode<Integer> leftRoot;
               TNode<Integer> rightRoot;
               
               
        SinglyLinkedList treeExpression = new SinglyLinkedList();
        
        writeExpression(treeExpression);
        
        BinaryTree<Integer> treeInput = new BinaryTree<>();
        System.out.println();
        System.out.println(" INFIX: ");
        treeInput.inorderPrint();
        System.out.println();
        System.out.println(" PREFIX: ");
        treeInput.preorderPrint();
        System.out.println();
        System.out.print(" POSTFIX: ");
        treeInput.postorderPrint();
        System.out.println();
        
        
    }

     
      
}

