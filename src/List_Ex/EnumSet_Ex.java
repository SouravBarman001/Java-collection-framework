package List_Ex;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSet_Ex {
	
	
	enum lang{
		java,javascript,python,r,csharp
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // create a new enum set using enum
		
		EnumSet<lang> langs = EnumSet.allOf(lang.class);
		System.out.println("all :"+langs);
		
		//empty enum set
		EnumSet<lang> l = EnumSet.noneOf(lang.class);
		System.out.println("empty :"+l);
		
		// enum range
		EnumSet<lang> range = EnumSet.range(lang.java,lang.r);
		System.out.println("range :"+range);
		
		//get a particular value from enum : of
		EnumSet<lang> of = EnumSet.of(lang.javascript);
		System.out.println("of :"+of);
		
		//add a  element : add & addall
		
		EnumSet<lang> lang1 = EnumSet.noneOf(lang.class);
		EnumSet<lang> lang2 = EnumSet.allOf(lang.class);
		lang1.add(lang.python);
		lang1.addAll(lang2);
		System.out.println("lang1 :"+lang1);
		
		// iterator
		
		EnumSet<lang> iterator1 = EnumSet.allOf(lang.class);
		
		Iterator <lang> it = iterator1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// remove & removeall
		EnumSet<lang> rem = EnumSet.allOf(lang.class);
		rem.remove(lang.python);
	    System.out.println(rem);
		
	}

}
