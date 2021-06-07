package pb1;

import java.util.*;


public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner x = new Scanner(System.in);
		int i;
		int n = 10;
		int[] v = new int[n];
		for (i = 0; i < n; i++) {
			v[i] = new Random().nextInt(255);
		}

		System.out.print("Pe ce pozitie doriti sa adaugati ? ");
		int z = x.nextInt();
		System.out.print("Ce numar doresti sa adaugi ? ");
		int a = x.nextInt();
		
		System.out.println("Vector random");
		for (i = 0; i < n; i++) {
			if (i < n - 1) {
				System.out.print(v[i] + ",");
				Thread.sleep(100);
			} else if (i == n - 1) {
				System.out.print(v[i] + ".");
				Thread.sleep(100);
			}
		}
		n = n + 1;
		v = Arrays.copyOf(v, v.length + 1);

		for (int j = n - 1; j > 0; j--) {
			v[j] = v[j - 1];
			if (z == j) {
				v[j] = a;
				break;
			}
		}

		System.out.println("\nVector modificat");
		for (i = 0; i < n; i++) {
			if (i < n - 1) {
				System.out.print(v[i] + ",");
				Thread.sleep(100);
			} else if (i == n - 1) {
				System.out.print(v[i] + ".");
				Thread.sleep(100);
			}
		}
		
	}
}
