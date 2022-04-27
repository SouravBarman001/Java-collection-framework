package List_Ex;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> aq = new ArrayDeque<>();
		aq.add(2);
		aq.add(4);
		aq.add(5);
		aq.add(12);
		
		// Convert to Array->
		  
		Integer arr[] = new Integer[aq.size()];
		arr = aq.toArray(arr);
		
		for(Integer i:arr) {
			System.out.println(i);
		}
		//********************************
		
		//Print the ArrayDeque->
	    Iterator <Integer> it = aq.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
		
	}

}
