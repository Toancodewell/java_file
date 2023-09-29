package chapter4;

public class java236 {
	private String t;
	private int a,b;
	
	

	public java236(String t, int a, int b) {
		this.t = t;
		this.a = a;
		this.b = b;
	}
	public void show() {
		System.out.println(t + a +b );
	}



	public static void main(String[] args) {
		java236 t = new java236("Lg ",2017,32 );
		t.show();
		

	}

}
