package a9_3;

public class a9_3 {
	enum Sex{male,female}
	public static void main(String[] args) {
//		for (Sex sexes : Sex.values()) {
//			System.out.println(sexes);
//			System.out.println(sexes.compareTo(Sex.female));
//		}
		String s="middle";
		Sex sex=Enum.valueOf(Sex.class, s);
		System.out.println(sex);
	}
}
