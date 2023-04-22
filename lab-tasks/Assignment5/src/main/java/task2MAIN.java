/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruba5
 */
import java.util.*;
import java.nio.file.Paths;

public class task2MAIN {
   

    public static void main (String [] args)throws Exception {

         
         
         
       String filename;
       System.out.print ("Please enter the file name "); 
       filename = "Dictionary.txt";

       Scanner input = new Scanner (Paths.get(filename));
       
        HashTable  hashtable2  = new HashTable(500);
   
    while (input.hasNext()){

        String currentword = input.next().toLowerCase();
       
       
       words word= hashtable2.get(currentword);

        if (word==null){
          
         word = new words (currentword,1);
         hashtable2.put(word);}
        else {
            
            word =hashtable2.remove(word.getWord());

            word.setFrequency(word.getFrequency()+1);

            hashtable2.put(word);}
            
        }
    
      words [] array= hashtable2.EntrySet();

       AHeap <Integer, String> maxheap = new AHeap (array.length) ;

       for (int i=0;i<array.length;i++){
           maxheap.insert(array[i].getFrequency(), array[i].getWord());
       }
        
       
        
       
      
     
    input.close();
    }
}

    

   


    

