package Demo;
import java.util.*;

public class hashingDemo {
	public static void main(String[] args) {
		//HashMap
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
	    mp.put(1,"Remo");
		mp.put(3,"Sashi");
		mp.put(4,"Mohit");
		
		System.out.println("The Element of hasmap are: ");
		for(Map.Entry m: mp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(5,"Rohan");  
	      ht.put(6,"Roky");  
	      ht.put(7,"Deepanshu");  
	      ht.put(8,"Deepa");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      //TreeMap
	      TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	      tm.put(9,"Aakash");
	      tm.put(10,"Sahil");
	      tm.put(11,"Ankit");
	      System.out.println("The Element of Treemap are: ");
	      for(Map.Entry i:tm.entrySet() ) {
	    	  System.out.println(i.getKey()+" "+i.getValue());
	      }

	}
}
