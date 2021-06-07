package pb;

import java.util.*;

public class Main {
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {

		
		StudentDetails student1 = new StudentDetails("Popescu", "Ion", 10, 10);
		StudentDetails student2 = new StudentDetails("Helesteanu", "George", 8, 10);
		StudentDetails student3 = new StudentDetails("Alexandrescu", "Horia", 6.5, 5.5);
		StudentDetails student4 = new StudentDetails("Cristian", "Teodor", 7, 7);
		StudentDetails student5 = new StudentDetails("Alexandru", "Marian", 8, 8);
		StudentDetails student6 = new StudentDetails("Badulescu", "Maria", 9, 9);
		StudentDetails student7 = new StudentDetails("Marin", "Stefania", 10, 10);
		StudentDetails student8 = new StudentDetails("Tanase", "Georghe", 7, 10);
		StudentDetails student9 = new StudentDetails("John", "Cena", 10, 10);
		StudentDetails student10 = new StudentDetails("Randi", "Orton", 10, 10);

		
		HashMap<String, StudentDetails> studentList_HashMap = new HashMap<>();

		studentList_HashMap.put("0331", student1);
		studentList_HashMap.put("0992", student2);
		studentList_HashMap.put("0123", student3);
		studentList_HashMap.put("0214", student4);
		studentList_HashMap.put("0115", student5);
		studentList_HashMap.put("0126", student6);
		studentList_HashMap.put("0073", student7);
		studentList_HashMap.put("0138", student8);
		studentList_HashMap.put("0139", student9);
		studentList_HashMap.put("0101", student10);
		
		LinkedHashMap<String, StudentDetails> studentList_LinkedHashMap = new LinkedHashMap<>();

		studentList_LinkedHashMap.put("0331", student1);
		studentList_LinkedHashMap.put("0992", student2);
		studentList_LinkedHashMap.put("0123", student3);
		studentList_LinkedHashMap.put("0214", student4);
		studentList_LinkedHashMap.put("0115", student5);
		studentList_LinkedHashMap.put("0126", student6);
		studentList_LinkedHashMap.put("0073", student7);
		studentList_LinkedHashMap.put("0138", student8);
		studentList_LinkedHashMap.put("0139", student9);
		studentList_LinkedHashMap.put("0101", student10);
		
		System.out.print("CNP studenti:");
		String[] a = {"0331","0992","0123","0214","0115","0126","0073","0138","0139","0101"};
		for(int i = 0; i<a.length;i++) {
			if(i<a.length-1) {
				System.out.print(a[i]+",");				
			}else if(i == a.length -1) {
				System.out.println(a[i]);
			}
		}
		
		System.out.print("Introduce-ti CNP-ul studentului cautat : ");
		String CNP = x.nextLine();

		
		System.out.println("Lista HashMap");
		System.out.print(studentList_HashMap.get(CNP) +"");
		for (String key : studentList_HashMap.keySet()) {
		System.out.println(key);
		}
		
		System.out.println("Lista LinkedHashMap");
		System.out.print(studentList_LinkedHashMap.get(CNP));
		for (String key : studentList_LinkedHashMap.keySet()) {
			System.out.println(key);
		}
		

		

	}
}
