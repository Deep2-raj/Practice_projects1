package Demo;
import java.util.*;

public class Collections {
	public static void main(String[] args) {
		//creating Arraylist
		//creating arraylist
				System.out.println("ArrayList");
				ArrayList<String> city=new ArrayList<String>();   
			      city.add("Gurgaon");//
			      city.add("Mumbai");    	   
			      System.out.println(city);  
				
				//creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector();
			      vec.addElement(25); 
			      vec.addElement(55); 
			      System.out.println(vec);
				
				//creating linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("Gagan");  
			      names.add("Aryan");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(100);  
			       set.add(200);  
			       set.add(300);
			       set.add(400);
			       System.out.println(set);
			       
			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(150);  
			       set2.add(180);  
			       set2.add(200);
			       set2.add(240);	       
			       System.out.println(set2);

	}
}
}
