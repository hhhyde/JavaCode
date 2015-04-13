package 父类调用子类方法;

public class fatherCallSon {
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.call());
	}
}

class Father {
	protected String name() {
		return "father";
	}

	/**
	 * 调用子类的name()
	 * */
	protected String call() {
		return this.name();
	}
}

class Son extends Father {
	@Override
	protected String name() {
		return "son";
	}

}