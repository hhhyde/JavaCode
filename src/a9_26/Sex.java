package a9_26;

public abstract class Sex {
	String name;
	int age;

	abstract void doSomethingInWC();

	void eat() {
		System.out.println("我正在吃饭");
	};

	void walk() {
		System.out.println("我正在走路");
	};
}
