package java438bai9;

public class Stack {

	public static void main(String[] args) {
		IStack<Integer> st = new MyStack<>();
		for(int i =0 ; i< 10 ; i++ ) 
			st.push(i);
		while(true) {
			Integer n = st.pop();
			if(n==null) break;
			System.out.print(n+" ");
		}
	}

}
