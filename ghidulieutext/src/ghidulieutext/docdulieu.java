package ghidulieutext;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.File;
public class docdulieu {

	public static void main(String[] args) {
		File f1 = new File("/Users/nguyentoan/Documents/java9thang4/ghidulieutext/File.txt");
		try {
			List<String>  alltext = Files.readAllLines(f1.toPath(),StandardCharsets.UTF_8);
			for(String ten : alltext) {
				System.out.println(ten);
			}
		}catch(Exception e) {
			e.printStackTrace( );
		}

	}

}
