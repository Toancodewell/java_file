package chapter6;

public class Circle {

	public static void main(String[] args) {
		Java384 a = new Java384(2,3,5); 
		Java384 b = new Java384(2,3,30); 
		System.out.println(a.toString());
		System.out.println(b);
		if(a.equals(b)) {
			System.out.println("ok ");
		}
		else {
			System.out.println("khac ");
		}
	}

}
