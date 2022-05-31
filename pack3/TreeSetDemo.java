package pack3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TreeSet
		Set<Integer> set2 = new TreeSet<>();
		set2.add(10);
		set2.add(109);
		set2.add(100);
		set2.add(345);
		set2.add(32);
		set2.add(87);
		// set2.add(null); // invalid, null value won't allow

		System.out.println();
		Iterator itr4 = set2.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next()); // 10, 32, 87, 100, 109, 345
		}

		// Create TreeSet
		Set<Student> students = new TreeSet<>();

		// Create Student objects
		Student std1 = new Student(101, "Sai", 23);
		Student std2 = new Student(102, "Ramesh", 21);
		Student std3 = new Student(103, "Suresh", 20);
		Student std4 = new Student(104, "Kavitha", 22);
		Student std5 = new Student(104, "Kavitha", 22);
		Student std6 = std1;

		// Add student objects in TreeSet
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		students.add(std6);

		// Print all student objects from TreeSet
		System.out.println();
		Iterator itr5 = students.iterator();
		while (itr5.hasNext()) {
			System.out.println(itr5.next());//
		}
	}

}
