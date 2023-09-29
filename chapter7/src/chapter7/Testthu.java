package chapter7;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
public class Testthu {

//	    public static void main(String[] args) {
//	        HashMap<String, String> capitalsMap = new HashMap<>();
//	        capitalsMap.put("Việt Nam", "Hà Nội");
//	        capitalsMap.put("Mỹ", "Washington D.C.");
//	        capitalsMap.put("Anh", "London");
//	        capitalsMap.put("Nhật Bản", "Tokyo");
//
//	        String[] valuesArray = capitalsMap.values().toArray(new String[capitalsMap.size()]);
//
//	        System.out.println("Mảng các giá trị:");
//	        for (String value : valuesArray) {
//	            System.out.println(value);
//	        }
//	    }


//
//	    public static void main(String[] args) {
//	        HashMap<String, String> capitalsMap = new HashMap<>();
//	        capitalsMap.put("Việt Nam", "Hà Nội");
//	        capitalsMap.put("Mỹ", "Washington D.C.");
//	        capitalsMap.put("Anh", "London");
//	        capitalsMap.put("Nhật Bản", "Tokyo");
//
//	        Object[] keysArray = capitalsMap.keySet().toArray();
//	        Random random = new Random();
//	        int randomIndex = random.nextInt(keysArray.length);
//	        String randomKey = (String) keysArray[randomIndex];
//	        String[] valuesArray = capitalsMap.values().toArray(new String[capitalsMap.size()]);
//
//	        System.out.println("Giá trị key ngẫu nhiên: " + randomKey);
//	        System.out.println("Các giá trị value:");
//
//	        for (int i = 0; i < valuesArray.length; i++) {
//	            System.out.println((i + 1) + ". " + valuesArray[i]);
//	        }
//	        	
//	       
//	        System.out.println("Nhập số thứ tự đúng cho giá trị key: ");
//	        Scanner scanner = new Scanner(System.in);
//	        int userInput = scanner.nextInt();
//
//	        boolean isCorrect = userInput == (randomIndex + 1);
//	        System.out.println("Đúng? " + isCorrect);
//	    }



	    public static void main(String[] args) {
	        HashMap<String, String> capitalsMap = new HashMap<>();
	        capitalsMap.put("Việt Nam", "Hà Nội");
	        capitalsMap.put("Mỹ", "Washington D.C.");
	        capitalsMap.put("Anh", "London");
	        capitalsMap.put("Nhật Bản", "Tokyo");

	        Object[] keysArray = capitalsMap.keySet().toArray();
	        Random random = new Random();
	        int randomIndex = random.nextInt(keysArray.length);
	        String randomKey = (String) keysArray[randomIndex];

	        String correctValue = capitalsMap.get(randomKey);
	        String[] valuesArray = capitalsMap.values().toArray(new String[capitalsMap.size()]);

	        int halfSize = valuesArray.length / 2;
	        String[] displayValues = new String[halfSize];
	        int[] orderNumbers = new int[halfSize];

	        int correctIndex = random.nextInt(halfSize);
	        displayValues[correctIndex] = correctValue;

	        int valueIndex = 0;
	        for (int i = 0; i < halfSize; i++) {
	            if (i != correctIndex) {
	                displayValues[i] = valuesArray[valueIndex];
	                valueIndex++;
	            }
	            orderNumbers[i] = i + 1;
	        }

	        System.out.println("Giá trị key ngẫu nhiên: " + randomKey);
	        System.out.println("Các giá trị value:");

	        for (int i = 0; i < halfSize; i++) {
	            System.out.println(orderNumbers[i] + ". " + displayValues[i]);
	        }

	        System.out.print("Nhập số thứ tự đúng cho giá trị key: ");
	        Scanner scanner = new Scanner(System.in);
	        int userInput = scanner.nextInt();

	        boolean isCorrect = userInput == (correctIndex + 1);
	        System.out.println("Đúng? " + isCorrect);
	    }
	}

	


