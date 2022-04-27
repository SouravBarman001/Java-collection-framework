package List_Ex;
import java.util.*;
public class LinkedList_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		
		
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(444);
		
		
		//list.addFirst(20);
		//list.addLast(90000);
		
		System.out.println("List items"+list);
		
		System.out.println("First item:"+list.getFirst());
		System.out.println("Last item:"+list.getLast());
		
		
		System.out.println("Remove first:"+list.pollFirst());
		System.out.println("Remove first:"+list.pollLast());
		
		Iterator<Integer> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}

}
