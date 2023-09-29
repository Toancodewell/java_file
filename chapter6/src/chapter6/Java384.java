package chapter6;

public class Java384 {
	private int a,b,c;
	
	public Java384(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Java384(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Java384 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public boolean equals(Object obj ) {
		Java384 p = (Java384)obj;
		if(a==p.a&& b == p.b)
			return true;
		else
			return false;
	}
	
	
}
