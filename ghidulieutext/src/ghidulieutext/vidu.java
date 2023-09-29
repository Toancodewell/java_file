package ghidulieutext;
import java.io.PrintWriter;
public class vidu {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("/Users/nguyentoan/Documents/java9thang4/ghidulieutext/File.txt","UTF-8");
			pw.println("van toan ");
			hocsinh hs = new hocsinh(23,"van toan ");
			pw.println(hs);
			pw.flush();
			pw.close();
			
		}catch(Exception e) {
			e.printStackTrace( );
			
		}
	
		
		

	}

}
