package a10_2;

class Test11 {
	public static final int staticFinal = 11;

	void show() {
		System.out.println(this.getClass().getCanonicalName());
	}
}

public class Temp {
	public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException {
		Test11 test = new Test11();
		test.show();
		
		Class test1=null;
		try {
			test1=Class.forName("a10_2.Test11");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test1.getDeclaredField("staticFinal").getInt("staticFinal"));
//		Class intClass=int.class;
//		intClass=double.class;
	}
}
