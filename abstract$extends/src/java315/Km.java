package java315;

public class Km extends Converter{
	

	public Km(double ratio) {
		super(ratio);
	}
	



	@Override
	protected double convert(double src) {
		return src/this.ratio;
	}



	@Override
	protected String getSrcString() {
		return "km";
	}
	@Override
	protected String getDestString() {
		return "mile";
	}

	public static void main(String[] args) {
		Km  k = new Km(1.6 );
		k.run();

	}

}
