package pack2;

public class Arrays {

	public static void main(String[] args) {
	/*	int[] intArr = {10,20,30,40,50};
		System.out.println(intArr[2]);//30
		System.out.println(intArr[4]);//50
		System.out.println(intArr[0]);//10 */
		
		// using new keyword
		/*int[] intArr = new int[5];
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		for(int i :intArr) {
		System.out.println(i);
		}*/
		String[] strArr = new String[10];
		//for(String str : strArr);
		strArr[2] = "ram";
		strArr[4] = "ravi";
		strArr[0] = "jhon";
		strArr[5] = "roja";
		strArr[1] = "remo";
		strArr[7] = "raju";
		strArr[9] = "twinkel";
		strArr[8] = "rajini";
		for(String str : strArr) {
			if(str instanceof String) {
		System.out.println(str);
		}
		}
	}
}
		