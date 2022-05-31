package pack2;
import java.util.*;
public class CollectionDemo {
       // List
	public static void main(String[] args) {
	//List <String> al = new ArrayList<String>();//al-arrayList,Generic <> use particular data type in angulars
		List <String> al = new ArrayList<>();
		al.add("Abhi");
		al.add("Nandini");
		al.add("Sindu");
		al.add("Bindu");// add method
		al.add("Anu");
		al.add(2,"Arjun");
		//al.add(25);
		//al.add(23.5);
		
		List <String> al1 = new ArrayList<>();
		al1.add("ravi");
		al1.add("Nani");
		al1.clear();//clear() method
		al1.add("hima");
		al1.add("junu");
		al1.add(1,"gani");
		al1.addAll(1,al);//addAll() method
		
		// 1. using foreach loop	
		for(String s : al) { //
		System.out.println(s);
		}
		//System.out.println();
		for(String s1 : al1) { //
			System.out.println(s1);
		}
	}
}
	// 2. using for loop	
		/*for(int i =0;i<al.size();i++) {
		//	System.out.println(i);
		 * }
// shows only index numbers to get index values for paticular index numbers we use get()
			System.out.println(al.get(i));*/
		//3. using farward iterator method
		/*ListIterator<String> itr = al.listIterator();
		System.out.println("In farward direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
			// reverse direction
		/*	System.out.println("In Reverse direction");
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
		}*/
	


