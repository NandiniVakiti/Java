package pack3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

import com.cg.eis.bean.Employee;

public class StackDemo {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.add(10);
		st.add(10.34f);
		st.add("hello");
		st.add(null);
		st.add(null);
		st.add(100);
		// using iterator
		Enumeration enm = st.elements();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());// 10 10.34 hello null null 100
		}
		// LIFO
		// get last inserted element
		System.out.println();
		System.out.println(st.peek());// 100

		// add new element to stack
		st.push(new Employee());
		System.out.println();
		ListIterator lst = st.listIterator();
		while (lst.hasNext()) {
			System.out.println(lst.next());
		}
		// print last inserted element/peek element
		System.out.println();
		System.out.println("peek element");
		System.out.println(st.peek());

		// remove elements from stack
		System.out.println();
		st.pop();
		// read stack after removing last element
		Iterator itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			// Generic type
			System.out.println();
			Stack<String> str1 = new Stack<>();
			str1.add("nandi");
			str1.add("ll");
			// using for each loop
			for (String str : str1) {
				System.out.println(str);
			}
		}
	}
}
