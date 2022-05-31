package pack3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.cg.eis.bean.Employee;

import pack3.Student;

public class ListDemo {

	public static void main(String[] args) {
		// CREATE ARRAYLIST
		List l1 = new ArrayList();
		// ADD ELEMENTS TO ARRAYLIST
		l1.add(10);
		l1.add("hello");
		l1.add(true);
		// update
		l1.set(2, false);

		System.out.println(l1);// 10,hello,false
		System.out.println(l1.get(2));// false
		// remove
		// l1.remove(2);
		// 1. using forloop
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));// 10 hello false
		}

		// 2. using Iterator
		Iterator itr = l1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());// 10 hello false
		}

		// 3. using ListIterator
		ListIterator listItr = l1.listIterator();
		// reading elements from starting to end
		while (listItr.hasNext()) {
			System.out.println(listItr.next());// 10 hello false
		}
		// reading elements from end to staring
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());// false hello 10
		}
		// creating 2nd ArrayList
		List l2 = new ArrayList();

		l2.add(20);
		l2.add('a');
		l2.add(null);
		l2.add(null);
		// using Iterator
		Iterator itr2 = l2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());// 20 a null null
		}
		System.out.println();
		// using addAll()
		l1.addAll(l2);
		System.out.println(l1);// 10 hello false 20 a null null

		// using contains()
		System.out.println(l1.contains("hello"));// true
		System.out.println(l1.indexOf('a'));

		// using 3rd ArrayList
		List l3 = new ArrayList();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();

		l3.add(emp1);
		l3.add(emp2);
		l3.add(emp3);
		l3.add(std1);
		l3.add(std2);
		l3.add(std3);
		System.out.println();
		System.out.println(l3);
		// using Iterator
		Iterator itr3 = l3.iterator();
		while (itr3.hasNext()) {
			Object obj = itr3.next();
			if (obj instanceof Employee) {
				Employee emp = (Employee) obj;
				System.out.println(emp.id + "|" + emp.name + "|" + emp.dept);
			} else {
				Student std = (Student) obj;
				System.out.println(std.rollNo + "|" + std.name + "|" + std.age);
			}
			// using Generic type
			List<Student> l4 = new ArrayList<>();
			l4.add(std1);
			l4.add(std2);
			l4.add(std3);
			l4.add(std1);
			// using foreach loop
			for (Student std : l4) {
				System.out.println(std);
			}
		}
	}
}
