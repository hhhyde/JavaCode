package reflectDemo;


public class Mmm {
	static void Info(Class cc) {
		System.out.println(cc.getName());
		System.out.println(cc.getSimpleName());
	}
	static void Info(Circle cc) {
		System.out.println(cc.getClass().getName());
		System.out.println(cc.getClass().getCanonicalName());
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class circle = null;
		try {
			circle = Class.forName("reflectDemo.Circle");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Circle cc=(Circle)circle.newInstance();
		cc.draw();
//		Circle[] ciecles={new Circle(),new Circle(),new Circle()};
//		System.out.println(ciecles);
//		System.out.println(ciecles.getClass().getCanonicalName());
		Info(circle);
	}
}
