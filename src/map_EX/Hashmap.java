package map_EX;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		
		//null value 1 ber
		
		hp.put(10, "A");
		hp.put(2, "B");
		hp.put(5, "C");
		hp.put(4, "D");
		
		System.out.println(hp);
		
		System.out.println(hp.keySet()); // returns all keys as a set
		System.out.println(hp.values());// returns all values as a collections
		
		System.out.println();
		
		for(Object i:hp.keySet()) {
			System.out.println(i +"    "+hp.get(i));
		}
		
		//**********
		System.out.println("_________________________ Map.entry");
		
		System.out.println();
		
		
		for(Map.Entry entry:hp.entrySet()) // Entryset = returns all entry as a set
		{ 
			System.out.println(entry.getKey()+" ->  "+entry.getValue());
		}
		
		//**********
		System.out.println("_________________________ Iterator");
		
		System.out.println();
		
		
			Set set = hp.entrySet();
			
			
			
			 Iterator itr = set.iterator();	
				
			 while(itr.hasNext()) {
				 
				 Map.Entry entry =  (Entry)itr.next();
				 System.out.println(entry.getKey()+" -  "+entry.getValue());
			 }
			 
			 
			 hp.forEach((key,value)->{
				 
				 System.out.println(key+"=="+value);
				 
			 });
			 
		
	}

}
