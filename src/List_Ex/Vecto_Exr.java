package List_Ex;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vecto_Exr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		Vector <Double> vector = new Vector<>();
		
		vector.add(13.00);
		vector.add(44.21212);
		
		
		
		Enumeration<Double> en = vector.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		System.out.println(vector.isEmpty());
	}

}
