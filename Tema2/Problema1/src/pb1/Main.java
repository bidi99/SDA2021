package pb1;
import java.util.*;

public class Main extends Tip{
	public static void main(String[] args) {
			Scanner x = new Scanner(System.in);
			System.out.println("Introdu' ceva");
			String a = x.nextLine();
			a = a.toLowerCase();
			System.out.println("Pentru tip");
			System.out.println(tip(a));
			System.out.println("Pentru tip1");
			System.out.println(tip1(a));
			System.out.println("Pentru tip2");
			System.out.println(tip2(a));
	}
}
