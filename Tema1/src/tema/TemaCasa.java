package tema;
import java.util.*;

public class TemaCasa {
	public static void main(String[] args) {
		
		int a , b , distance ;
		Scanner x;
		x = new Scanner(System.in);
		System.out.print("Primul numar introdus este :");
		a = x.nextInt();
		//if(a<0)
			//throw new RuntimeException("Bossule vezi ca ai introdus gresit");
		System.out.print("Al doilea numar introdus este :");
		b = x.nextInt();
		
		double average = (double)(a+b)/2 ;
		int sum = a+b;
		int dif = a-b;
		if (a>b)
			distance = a - b;
		else 
			distance = b - a;
			
		
		//System.out.println("Distanta dintre cele doua numere este de " + distance + "\nMedia lor este " + average + "\nMaximul este " + max + "\nMinimul este " + min + "\nSuma lor este " + sum + "\nDiferenta lor este " + dif);
		System.out.print("Type : dist / avg / sum / dif / max / min : ... ");
		String y = x.next();
		switch(y) {
		case "dist": System.out.println("Distanta dintre cele doua numere este de " +distance);
				break;
		case "avg": System.out.println("Media lor este " + average);
				break;
		case "sum": System.out.println("Suma lor este " + sum);
				break;
		case "dif": System.out.println("Diferenta lor este " + dif);
				break;
		case "max": System.out.println("Maximul este " + Math.max(a, b));
				break;
		case "min": System.out.println("Minimul este " + Math.min(a, b));
				break;
		}
	}
}
