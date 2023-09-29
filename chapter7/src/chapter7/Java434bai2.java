package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class Java434bai2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Character> grades = new ArrayList<Character>();

	        System.out.println("6개의 학점을 입력하세요 (A, B, C, D, F 중 하나씩 입력):");

	        for (int i = 0; i < 6; i++) {
	            char grade = sc.next().charAt(0);
	            grades.add(grade);
	        }

	        double totalScore = 0;
	        for (char grade : grades) {
	            double score = convert(grade);
	            totalScore += score;
	        }

	        double averageScore = totalScore / grades.size();
	        System.out.println("평균 점수: " + averageScore);
	    }
	   public static double convert(char grade) {
	        double score;
	        switch (grade) {
	            case 'A':
	                score = 4.0;
	                break;
	            case 'B':
	                score = 3.0;
	                break;
	            case 'C':
	                score = 2.0;
	                break;
	            case 'D':
	                score = 1.0;
	                break;
	            case 'F':
	                score = 0.0;
	                break;
	            default:
	                score = 0.0;
	                break;
	        }
	        return score;
}
	}

	


