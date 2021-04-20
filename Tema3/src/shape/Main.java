package shape;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IllegalArgumentException {

		Scanner x = new Scanner(System.in);

		List<Shape> shape = new ArrayList<>();
		try {
			shape.add(new Circle("#FFFFFF", 5, 5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			shape.add(new Square("#FFFFFF", 5, 5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			shape.add(new Rectangle("#FFFFFF", 5, 5, 10));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.print("Manual(m) or automat(a) : ");
		String y = x.nextLine();
		switch (y) {
		case "a":
			for (Shape s : shape) {
				System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
						+ s.getHexFillColor());
				s.draw();
				System.out.println();
			}
			break;
		case "m":
			System.out.println("Rectangle(d) / Circle(c) / Square(p)");
			String z = x.nextLine();
			switch (z) {
			case "d":
				for (Shape s : shape) {
					if (s.getName() == "Rectangle") {
						System.out.println(s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;
			case "c":

				for (Shape s : shape) {
					if (s.getName() == "Circle") {
						System.out.println(s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;

			case "p":

				for (Shape s : shape) {
					if (s.getName() == "Square") {
						System.out.println(s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;

			}
		}

	}

}
