package pack4;

interface StringFn {
	String rev(String n);
}

	public class ReverseString {
	public static void main(String[] args) {
		// this block lambda that reverse the characters in a String
		StringFn reverse = (str) -> {
			String result = " ";
			int i;
			for (i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};

		System.out.println("Lambda reversed is :" + reverse.rev("lambda"));
	}
}
