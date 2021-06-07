package pb5;

import java.util.*;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner x = new Scanner(System.in);
		int pixel = 3, n, m, i, j, sum = 0, k, l, media = 0;

		System.out.print("Nr. Linii :");
		n = x.nextInt();
		System.out.print("Nr. Coloane :");
		m = x.nextInt();

		int[][] matrice = new int[n][m];

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matrice[i][j] = new Random().nextInt(255);
			}
		}
		System.out.println("Matrice random :");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == n - 1) {
					System.out.println(matrice[i][j]);
					Thread.sleep(100);
				} else {
					System.out.print(matrice[i][j] + " ");
					Thread.sleep(100);
				}
			} 
		}
		
		for (i = 0; i < n; i = i + pixel) {
			for (j = 0; j < m; j = j + pixel) {
				int px = Math.min(pixel, m - j);
				int py = Math.min(pixel, n - i);

				for (k = 0; k < py; k++) {
					for (l = 0; l < px; l++) {
						sum += matrice[i + k][j + l];
					}
				}
				media = (int) sum / (px * py);
				for (k = 0; k < py; k++) {
					for (l = 0; l < px; l++) {
						matrice[i + k][j + l] = media;
					}
				}

			}
		}
		System.out.println("Matricea dupa adaugarea filtrului:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == n - 1) {
					System.out.println(matrice[i][j]);
					Thread.sleep(100);
				} else {
					System.out.print(matrice[i][j] + " ");
					Thread.sleep(100);
				}
			} 
		}
	}
}
