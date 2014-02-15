package reflectDemo;

public class Circle extends Shapes {

	public String toString() {
		return this.getClass().getSimpleName()+"11";
	}

	static {
		System.out.println("来了");
	}
	Circle(){
		System.out.println("调用Circle构造方法");
	}
}
