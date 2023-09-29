package ghidulieutext;

import java.util.Scanner;
public class javatest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object std_sbj [][] = new Object[6][3];
		std_sbj[0][0]="학생이름";
		std_sbj[1][0]="학생1";
		std_sbj[2][0]= "학생2";
		std_sbj[3][0]= "학생3";
		std_sbj[4][0]="학생4";
		std_sbj[5][0]="학생5";
		std_sbj[0 ][1]="과목1";
		std_sbj[0 ][2]="과목2";
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<6;j++)
////			std_sbj[0][i]= Double.parseDouble(k[i]);
//			std_sbj[i][j]=k[j];
//		}
		for(int i =1;i<std_sbj.length;i++) {
			for(int j=1; j< std_sbj[i].length;j++) {
				System.out.printf("std_sbj[%d][%d]",i,j);
				 std_sbj[i][j]= sc.nextDouble();
				 }
		}
		
		for(int i =0;i<std_sbj.length;i++) {
			for(int j=0; j< std_sbj[i].length;j++) 
				System.out.print(std_sbj[i][j]+" ");
				System.out.println();
			}
		
		for(int i =1;i<std_sbj.length;i++) {
			for(int j=1; j< std_sbj[i].length;j++) {
				 std_sbj[i ][j]=(double)std_sbj[i ][j];
			}
				
		}
		double max = (double) std_sbj[1][1];
		double	min =(double) std_sbj[1][1];
		double max1=0,min1=0;
		for(int i =1;i<std_sbj[i].length;i++) {
			for(int j=1; j< std_sbj.length;j++) {
				if((double) std_sbj[j][i]>max) {
					max=(double)std_sbj[j][i];
					}
				if((double)std_sbj[j][i]<min ) {
					min=(double)std_sbj[j][i];
					}
			}
//			for(int m=1;m<2;m++) {
			System.out.println(std_sbj[0][i]+ "최고점수"+max+"+"+std_sbj[0][i]+"최저점수"+min);}
			max1+=max;
			min1+=min;
		
		double totalmax = max1/3;
		double totalmin = min1/3;
		System.out.println("최고평균점수"+totalmax);
		System.out.println("최저평균점수"+totalmin);
		
	}
}
