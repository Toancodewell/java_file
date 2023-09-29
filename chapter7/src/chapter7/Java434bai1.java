package chapter7;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
public class Java434bai1 {
	public static void main(String[] args) {
	Vector<Integer> vc = new Vector<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhập giá trị (hoặc -1 để kết thúc): ");
	int a;
	while(true) {
		a = sc.nextInt();
		if(a==-1 ) {
			break;
		}else {
			vc.add(a);
		}}
	for(int i=0;i<vc.size();i++ ) {
		int n = vc.get(i);
		System.out.print(n+" ");
	}
	int max=0;
	for(int i=0;i<vc.size();i++ ) {
		if(vc.get( i)> max) {
			max = vc.get( i);
		}
	}
	System.out.print("lon nhat: "+ max);
}}
