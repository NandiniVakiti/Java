package pack3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import com.cg.eis.bean.Employee;

import pack3.Student;

public class VectorDemo {

	public static <E> void main(String[] args) {
		// create vector
		Vector v = new Vector();
		// adding addElement()
		v.addElement("Hello");
		v.addElement(new Employee());
		v.addElement(new Employee());
		v.addElement(new Student());
		// using Iterator we iterate the vector element
		Enumeration enm = v.elements();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		// creating 2nd vector
		List v1 = new Vector();
		v1.add(10);
		v1.add(23.4f);
		v1.remove(0);
		v1.add(new Employee());
		v1.add(new Employee());
		v1.add(new Student());

		System.out.println();
		// using iterator we iterate the vector element
		Iterator<E> itr = v1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
