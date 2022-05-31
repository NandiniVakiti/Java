package pack4;
interface A {
	void swap(int x, int y);
}
public class Swap {
	int x=10;
	int y=20;
	public static void main(String[] args) {
		A s1 = (int x, int y) -> {
			System.out.println("before swapping x =" + x + ",y=" + y);
			int temp;
			temp=x;
			x=y;
			y=temp;
			System.out.println("Aftering swapping x=" + x + ",y=" + y);
		};
		s1.swap(10,20);
		
	}

}
