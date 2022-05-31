package pack3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.cg.eis.bean.Employee;

import pack3.Student;

public class SetDemo {

	public static void main(String[] args) {
		// Set<Integer> intSet = new Hashset<>();
		Set<Employee> hashSet2 = new HashSet<>();
		Employee emp1 = new Employee(1000, "ravi", "HR");
		Employee emp2 = new Employee(1001, "ram", "IT");
		Employee emp3 = new Employee(1002, "raju", "Admin");
		Employee emp4 = new Employee(1002, "raju", "Admin");
		Employee emp5 = emp1;

		// Add emp objects to HashSet
		hashSet2.add(emp1);
		hashSet2.add(emp2);
		hashSet2.add(emp3);
		hashSet2.add(emp4);
		hashSet2.add(emp5);
		// read
		System.out.println();
		System.out.println(emp1.hashCode()); // 1023487453
		System.out.println(emp2.hashCode()); // 1865127310
		System.out.println(emp3.hashCode()); // 515132998
		System.out.println(emp4.hashCode()); // 1694819250
		System.out.println(emp5.hashCode()); // 1365202186

		Iterator itr = hashSet2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); // emp1, emp2, emp3, emp4
		}
// After overiding equals and hashcode method in Employee class to return code based on id, name and dept instead of obj address

		// allows null values
		hashSet2.add(null);
		hashSet2.add(null);

		System.out.println();
		Iterator itr2 = hashSet2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next()); // emp1, emp2, emp3 and emp4
		}

		Set<Integer> intSet = new HashSet<>();
		intSet.add(10);
		intSet.add(5);
		intSet.add(34);
		intSet.add(34);
		intSet.add(1200);
		intSet.add(76);
		intSet.add(100);

		Iterator itr1 = intSet.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next()); // 5, 10, 34, 1200, 76, 100
		}
		System.out.println(hashSet2.contains(emp5)); // true
		System.out.println(hashSet2.isEmpty()); // false
	}
}
