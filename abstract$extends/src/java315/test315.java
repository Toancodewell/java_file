package java315;

public class test315 extends Converter {
	public test315(double ratio ) {
		super(ratio);
	}
	
	protected double convert(double src) {
		return src/this.ratio;
	}

	@Override
	protected String getSrcString() {
		return "won";
	}

	@Override
	protected String getDestString() {
		return "dola";
	}
	public static void main(String[] args) {
		test315 t = new test315(1200 );
		t.run();

	}

}
