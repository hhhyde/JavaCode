package reflectDemo;

abstract class Shapes {
	void draw() {
		//这里this调用了toString()方法
		System.out.println(this + ".draw()");
	}

	public abstract String toString();
}
