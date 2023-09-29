package chapter4;

public class javaArrayutil {
	public static int[] conca(int[]a , int[]b ) {
		int c[]=new int[a.length+b.length];
//		int pos=0;
//		  for (int element : a) {
//		      c[pos] = element;
//		      pos++;
//		    }
//		  for (int element : b) {
//		      c[pos] = element;
//		      pos++;
//		    }
		System.arraycopy(a, 0, c, 0, a.length);
	    System.arraycopy(b, 0, c, a.length, b.length);
		  return c;
	}
	public static void print(int a[ ]) {
		for(int c: a ) {
			System.out.print(c+" ");
		}
	}}
