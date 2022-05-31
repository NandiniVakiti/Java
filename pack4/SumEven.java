package pack4;

interface even {
	int sum(int[] a);
}

public class SumEven {
		public static void main(String[] args) {
				int[] arr = {11,29,31,45,5,34};
				even e = (int[] a) -> {
					int sum = 0;
					for(int i=0;i<arr.length;i++) {
						if(arr[i] %2 ==0) {
							sum=sum+arr[i];
						}
					}
					return sum;
				};
				 System.out.println("Sum is:" +e.sum(arr));
		  }
	}


