package abstract$extends;

public class test {

	public static void main(String[] args) {
		hangsanxuat h1 = new hangsanxuat("hang1"," viet nam ");
		hangsanxuat h2 = new hangsanxuat("hang2"," my ");
		
		Phuongtiendichuyen pt1 = new Maybay("may bay ",h1,"xang");
		pt1.layten();
		System.out.println(pt1.layten());
		System.out.println(pt1.vantoc());
	}

}
