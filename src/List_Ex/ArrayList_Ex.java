package List_Ex;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> aa = new ArrayList<>();
		aa.add(12);
		aa.add(44);
		aa.add(22);
		aa.add(11);
		
		Integer Arr[] = new Integer[aa.size()];
		Arr = aa.toArray(Arr);
		
		for(Integer p:Arr) {
			System.out.println(p);
		}
		
		System.out.println("....................");

		ArrayList<Integer> al = new ArrayList<>();
		
		 al.add(2);
		 al.add(10);
		 al.add(5);
		 al.add(9);
		 al.add(5);
		 al.set(1, 111);
		 System.out.println("Contents of al:"+al);

		 Integer ia[] = new Integer[al.size()];
		 
		 ia = al.toArray(ia);
		 
		for(Integer i:  ia) {
			System.out.println(i);
		}
		
		 
		 //**************************
		 
		System.out.println("....................");
		
			Iterator<Integer> itr = al.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
	}

}
