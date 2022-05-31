package pack4;

import java.util.Arrays;

interface f1 {
	void second(int[] a);
}

public class SecondHigh {

	public static void main(String[] args) {
		// find Second highest number ina given array
		int[] arr = { 11, 29, 31, 45, 5 };
		f1 f2 = (int[] a) -> {
			Arrays.sort(arr);
			System.out.println("second highest number in a given array :" + arr[arr.length - 2]);
		};
		f2.second(arr);
	}
}
