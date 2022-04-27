package List_Ex;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_Ex {
	
	public static void pushmethod(Stack<Integer> st,int a) {
		
		st.push(a);
		
		
		System.out.println("Stack:"+st);
	}
	
	public void show() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack <Integer> st = new Stack<>();

		
		pushmethod(st,10);
		pushmethod(st,12);
		pushmethod(st,14);
		
		
		
		try {
		st.pop();
		st.pop();
		st.pop();
			st.pop();
		}catch(EmptyStackException e) {
			System.out.println(e);
		}
		
		System.out.println("Stack:"+st);
	}

}
