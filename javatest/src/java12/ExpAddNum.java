package java12;


public class ExpAddNum extends MyExp{

		private double num;

		public ExpAddNum(double base,int exp, double num) {
			this.setBase(base);
			this.setExp(exp);
			this.num = num;
		}
		public double getNum() {
			return num;
		}
		public void setNum(double num) {
			this.num = num;
		}
		public double getValue(double num ) {
			int n=0;
			double sum=0;
			double total=1;
			while(n<this.getExp()) {
				 total*=this. getBase();
				 n+=1;
			}
			return sum=total+num;
			}
			public void printExp() {
			System.out.println(this.getBase()+"의"+this.getExp()+"승+"+num+"="+this.getValue( num));
		}
		
	}



