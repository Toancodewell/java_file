package java12;

public class MyExp {
		private double base;
		private int exp;
		
		public MyExp() {
		}
		public MyExp(double base, int exp) {
			this.base = base;
			this.exp = exp;
		}
		public double getBase() {
			return base;
		}
		public void setBase(double base) {
			this.base = base;
		}
		public int getExp() {
			return exp;
		}
		public void setExp(int exp) {
			this.exp = exp;
		}
		public double getValue(double base,int exp) {
			int n=0;
			double total=1;
			while(n<exp) {
				 total*=base;
				n+=1;
			}
			return total;
		}
		public void printExp() {
			System.out.println(this.getBase()+"의"+this.getExp()+"승="+this.getValue(base, exp));
		}
	}



