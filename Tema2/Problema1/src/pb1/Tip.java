package pb1;

public class Tip {
	public static int tip(String name) {
		if (name.equals("oras"))
			return 50;
		else if (name.equals("zona rezidentiala"))
			return 30;
		else if (name.equals("drum express"))
			return 100;
		else if (name.equals("autostrada"))
			return 130;
		else
			return 0;
	}

	public static int tip1(String name) {
		if (name.equals("oras")) {
			return 50;
		} else {
			if (name.equals("zona rezidentiala")) {
				return 30;
			} else {
				if (name.equals("drum express")) {
					return 100;
				} else {
					if (name.equals("autostrada")) {
						return 130;
					} else {
						return 0;
					}
				}
			}
		}
	}

	public static int tip2(String name) {

		switch (name) {
		case "oras":
			return 50;

		case "drum express":
			return 100;

		case "autostrada":
			return 130;

		case "zona rezidentiala":
			return 30;
		}
		return 0;
	}
}
