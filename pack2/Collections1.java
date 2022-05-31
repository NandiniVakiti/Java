package pack2;
import java.util.*;
public class Collections1 {

	public static void main(String[] args) {
		/*List <String> al = new ArrayList<>();
		al.add("Abhi");
		al.add("Nandini");
		al.add("Sindu");
		al.add("Bindu");// add method
		al.add("Anu");
		al.add(2,"Arjun");
		//System.out.println(al);*/
		
		List <String> al1 = new ArrayList<>();
		al1.add("abhi");
		al1.add("Nandini");
		al1.add("sindu");
		al1.add("Bindu");// add method
		al1.add("Anu");
		//al1.sort("String".CASE_INSENSITIVE_ORDER);
		//al1.sort(Comparator.naturalOrder());
		System.out.println(al1.subList(1, 4));
		System.out.println(al1);
		//al1.add("Sindu");
		//al1.add(2,"Arjun");
		//al1.remove(3);
		//al1.remove("Abhi");
		//al1.set(2, "Jai");
		
		//al1.addAll(1,al1);
		//System.out.println(al1.removeAll(al));
		//System.out.println(al.equals(al1));
	//we created objust of al but doesn't contain any values then we get al as true
		//System.out.println(al1.isEmpty());
		//System.out.println(al1.indexOf("Sindu"));
      //  System.out.println(al1.lastIndexOf("Sindu"));
      //  System.out.println(al1.contains("Anu"));//if doesn't contain we get false
	}

}
