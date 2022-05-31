package pack3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashSet {

	public static void main(String[] args) {
		Set set1 = new LinkedHashSet();

		set1.add(20);
		set1.add(false);
		set1.add("Ram");
		set1.add('d');
		set1.add(null);
		set1.add(20);

		System.out.println();
		Iterator itr3 = set1.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next()); // 20, false, Ram, d, null
		}

	}

}
