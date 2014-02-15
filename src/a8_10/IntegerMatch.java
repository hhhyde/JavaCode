package a8_10;

public class IntegerMatch {
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d+"));
		String a = "hello, world";
		String[] aa = a.split("\\W+");
		for (String string : aa) {
			System.out.println(string);
		}
	}
}
