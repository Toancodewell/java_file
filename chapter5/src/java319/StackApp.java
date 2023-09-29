package java319;

import java.util.Scanner;

public class StackApp implements Stack {
	private int a;
	private String b;
	 private boolean inputComplete = false;
	public int length() {
		Scanner sc = new Scanner(System.in );
		System.out.print("chieu dai : ");
		a= sc.nextInt() ;
		return a; 
	}

	@Override
	public int capacity() {
		return 3;
	}

	@Override
	public String pop() {
		Scanner sc = new Scanner(System.in );
		b= sc.nextLine();
		System.out.print("chieu du lieu: ");
		return b ;
	} 

	@Override
	public boolean push(String val) {
		Scanner sc = new Scanner(System.in );
		val=sc.nextLine();
		return false;
			
			
		
	}
	public static void main(String[] args) {
		StackApp pp = new StackApp();
		int k= pp.length();
		int stringCount = 0;
		String m[] = new String[pp.capacity()];
		String l[] = new String[k+1];
		Scanner sc = new Scanner(System.in );
		  do {
	            System.out.print("Enter a string value: ");
	            String inputString = sc.nextLine();
	            if (inputString.isEmpty()) {
	                break;
	            }
	            l[stringCount++] = inputString;
	        } while ( stringCount <= k);
		  if(stringCount>=pp.capacity()  ) {
  			  System.out.println("da du");
  		  }
		  System.arraycopy(l, 0, m , 0 , m.length);
//	        inputComplete = true;
	    
		for(int i =0 ; i<m.length  ; i++ ) {
			System.out.print(m[i ]+" ");
		}
		
		
		

	}
}
