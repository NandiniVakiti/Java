package pack1;

public class WrapperClasses {

	public static void main(String[] args) {
	    // 1. covert primitive to object
		// using constructors
		Integer i1 = new Integer(10);
		System.out.println(i1.getClass().getName());//Double
		System.out.println(i1);//10
		// using valueOf()-method
		int i2 = 400;
		Integer i3 = Integer.valueOf(i2);//400
		System.out.println(i3.getClass().getName());
		// AutoBoxing
		Float f = 10.0f;
		System.out.println(f.getClass().getName());
		
		// 2. convert object to primitive
		// using xxxvalue()
		Long l1 = 23456l;
		Long l2 = l1.longValue();
		System.out.println(l1+" "+l2);
		// using AutoUnboxing
		int x = i3;
		
		// 3. covert wrapper obj to String obj
		// toString()
		System.out.println(i1.getClass().getName());//integer
		String str1 = i1.toString();
		System.out.println(str1.getClass().getName());//string
		
		// 4. convert primitive to String - valueOf
		String str2 = String.valueOf(10);// integer
		System.out.println(str2.getClass().getName());//string
		
		// 5. convert String to primitive - parsexxx()
		  String str3 = "100";
		 // int k2 = 200;
		  System.out.println(str3.getClass().getName());
		 // System.out.println(str3+k2);//100200
		  int k1 = Integer.parseInt(str3);
		  System.out.println(k1);//100
		//  System.out.println(k1+k2);//300
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
