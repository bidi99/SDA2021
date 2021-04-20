package pb1;
import java.util.*;

public class Main extends Tip{
	public static void main(String[] args) {
			Scanner x = new Scanner(System.in);
			System.out.println("Introduceti tipul oras/zona rezidentiala/drum express/autostrada");
			String a = x.nextLine(); 
			a = a.toLowerCase();  
			System.out.println("vitezamax1");
			System.out.println(tip(a));
			System.out.println("vitezamax2");
			System.out.println(tip1(a));
			System.out.println("vitezamax3");
			System.out.println(tip2(a));
	}
}
