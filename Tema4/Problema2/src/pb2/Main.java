package pb2;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner x = new Scanner(System.in);
		int i;
		int n = 10;
		int[] v = new int[n];
		for(i = 0 ; i < n ; i++) {
			v[i] = new Random().nextInt(255);
		}
		System.out.println("Vector random");
		for (i = 0; i < n; i++) {
			if(i < n-1) {
			System.out.print(v[i] + ",");
			Thread.sleep(100);
			}else if(i == n-1) {
				System.out.println(v[i] + ".");
			}
		}
		
		System.out.print("\nSelectati pozitia dorita pentru a fi stersa : ");
		int z = x.nextInt(); 
		System.out.println();
		for(i = 0 ; i < n ; i++) {
			if(z == i) {
				for(int j = i ; j < n-1 ; j++) {
					v[j] = v[j+1];
				}
			}
		}
		System.out.println("Vectorul modificat");
		for (i = 0; i < n; i++) {
			if(i < n-1){
			System.out.print(v[i] + ",");
			Thread.sleep(100);
			}else {
				System.out.println("null");
			}
		}
	}
}
