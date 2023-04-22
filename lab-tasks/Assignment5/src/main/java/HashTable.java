import java.util.*;


public class HashTable {
    private words[] w;
    private int maxSize;
    
    public HashTable(int N) {
		w = new words[N];
		for (int i = 0; i < w.length; i++)
			w[i] = new words (" ",0);
	}

    public static int hash(char key) {
    
      return ((int)key)-97;
      
	} 

    public void put(words w) {
        int index =hash( w.getWord().charAt(0));

        if (this.w[index].getFrequency()==0){
            this.w[index] = w;
            return ;
        }
        while (index < this.w.length && this.w[index].getFrequency()!=0){
          index++;
        }

        this.w[index]=w;
       
    }

    public words get (String w){

      int i =hash(w.charAt(0));
      
      
              if (this.w[i].getWord().equals(w)){
                  return this.w[i] ;  
              }
              i=(i+1)%maxSize;
              
              while (i < this.w.length && !this.w[i].getWord().equals(w)){
      
                i++;
      
              }
            if (i==this.w.length){
              return null;
            }
             return this.w[i] ;
      
        }

    public words remove(String w) {
        
      int i = hash(w.charAt(0));
      
      if (this.w[i].getWord().equals(w)){// find direct in index
        words word =this.w[i];
        this.w[i]=new words (" ",0);
        return word;
      }
    

        while (i < this.w.length && !this.w[i].getWord().equals(w)){// find based on lieaner prob

          ++i;
         
        }

        if (i < this.w.length &&this.w[i].getWord().equals(w)){
          words word =this.w[i];
        this.w[i]=new words (" ",0);
        return word; 
        }else {

         return null;
        }

      }



    public void print() {
        for (int i = 0; i < w.length; i++) {
                if (w[i].getFrequency()!=0){
          System.out.println("i is "+ i +"the word is " + w[i]);}
        }
    }

    public words  [] EntrySet (){
      return w;
    }
    
   
    
    
}
