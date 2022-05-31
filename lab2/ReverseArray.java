package lab2;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
	static int getSorted(int num) {
		int rev_num = 0;
		while(num>0) {
			rev_num = rev_num *10 + num %10;
			num = num/10;
		}
		return rev_num;
	}
		static void getsSort(int arr[],int n) {
			ArrayList<int[]> a1 = new ArrayList<>();
			for(int i = 0; i<n ;i++) {
				a1.add(new int[]{getSorted(arr[i]),arr[i]});
			}
			Collections.sort(a1,(a,b) -> a[0] - b[0]);
			for(int i = 0; i<a1.size();i++) {
				System.out.println(a1.get(i)[1] + " ");
			}
			}

	   public static void main(String[] args) { 
		int[] arr = {40,20,50,30};
		int n = arr.length;
		getsSort(arr,n);
	} 		

	}


