package java319bai10;

public class DictionaryApp{

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("toan", "java");
		dic.put("tu", "c");
		dic.put("van", "python");
		System.out.println(dic.get("toan"));
		System.out.println(dic.get("tu"));
		dic.delete("tu");
		System.out.println(dic.get("tu"));
	}

}
