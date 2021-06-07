package shape;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException {

		Scanner x = new Scanner(System.in);
		List<Shape> shape = new ArrayList<>();
		List<String> hexa = new ArrayList<>();

		System.out.print("Manual(m) or automat(a) :");
		String y = x.nextLine();
		switch (y) {
		case "a":
			try {
				shape.add(new Circle("#000000", 5, 5));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			try {
				shape.add(new Square("#ffffff", 5, 5));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			try {
				shape.add(new Rectangle("#f01ca0", 5, 5, 10));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			for (Shape s : shape) {
				System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
						+ s.getHexFillColor());
				s.draw();
				System.out.println();
			}
			break;
		case "m":
			int n = 0;
			while (n == 0) {
				System.out.println("Dreptunghi(d) / Cerc(c) / Patrat(p)");
				String z = x.nextLine();
				String hex;
				int borderWidth, radius, size, height, width;
				// switch (z) {
				if (z.equals("d")) {
					System.out.print("Codul culorii:");
					hex = x.next();
					System.out.print("Bordura:");
					borderWidth = x.nextInt();
					System.out.print("Inaltime:");
					height = x.nextInt();
					System.out.println("Latime:");
					width = x.nextInt();
					try {
						shape.add(new Rectangle(hex, borderWidth, height, width));
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}

					for (Shape s : shape) {

						System.out.println(s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();

					}
					
				}
				if (z.equals("c")) {
					System.out.print("Codul culorii:");
					hex = x.next();
					System.out.print("Bordura:");
					borderWidth = x.nextInt();
					System.out.print("Raza:");
					radius = x.nextInt();
					try {
						shape.add(new Circle(hex, borderWidth, radius));
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					for (Shape s : shape) {

						System.out.println(s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();

					}
					
				}
				if (z.equals("p")) {
					System.out.print("Codul culorii:");
					hex = x.next();
					System.out.print("Bordura:");
					borderWidth = x.nextInt();
					System.out.print("Latura:");
					size = x.nextInt();
					try {
						shape.add(new Circle(hex, borderWidth, size));
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					for (Shape s : shape) {

						System.out.println(s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();

					}

					
				}
				System.out.println("Doriti sa continuati ? Da sau Nu");
				String l = x.next();
				
				if (l.equals("Da")) {
					n = 0;
				} else {
					n = 1;
				}
			}
		}

		for (Shape s : shape) {
			hexa.add(s.getHexFillColor());
		}
		System.out.println("Lista culorilor:" + hexa);

		Set<String> elemente = new HashSet<String>(hexa);
		for (String c : elemente) {
			System.out.println(c + "-" + Collections.frequency(hexa, c));
		}

	}

}
