package pack2;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Collection {
	
				public static void main(String[] args) {
					List<Student> list = new ArrayList<>();
					Student s1 = new Student(01,"abhi","hyd");
					Student s2 = new Student(02,"anu","mbnr");
					Student s3 = new Student(03,"ankush","warangal");
					Student s4 = new Student(04,"ammu","delhi");
					list.add(s1);
					list.add(s2);
					list.add(s3);
					list.add(s4);
					
					for(Student s : list) {
						System.out.println(s.rollno+" "+s.name+" "+s.address);
					}
				}
           }


