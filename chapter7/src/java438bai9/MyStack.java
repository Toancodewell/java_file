package java438bai9;

import java.util.Vector;


	public class MyStack<T> implements IStack<T> {
//	    private Vector<T> stack;
//
//	    public MyStack() {
//	        stack = new Vector<>();
//	    }
//
	    Vector<T> stack =new Vector<T>();
	    public T pop() {

	    	   if (stack.isEmpty()) {
	               return null; // Stack is empty
	           }
	           
	           T item = stack.get(stack.size() - 1);
	           stack.remove(stack.size() - 1);
	           return item;
	       }


		@Override
	    public boolean push(T ob) {
	        stack.add(ob);
	        return true;
	    }
	}

