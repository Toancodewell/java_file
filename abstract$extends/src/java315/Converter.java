package java315;

import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src );
	protected abstract String getSrcString( );
	protected abstract String getDestString( );
	protected double ratio;
//	
	public Converter(double ratio) {
		this.ratio = ratio;
	}
	public void run() {
		Scanner sc = new Scanner(System.in );
		System.out.println(getSrcString( )+getDestString( ) );
		System.out.print(getSrcString( )+"nhap: ");
		double val = sc.nextDouble(); 
//		double res = convert(val );
		System.out.println( convert(val )+getDestString( ) );
		sc.close();
	}

}
