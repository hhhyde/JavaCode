package syncDemo;

public class MultiSyncTest {

	public static void main(String[] args) {
		MultiSync sync = new MultiSync();
		sync.test2();
	}
}

class MultiSync {

	public synchronized void syncA() {
		System.out.println('A');
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void syncB() {
		System.out.println('B');
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 测试同一个实例中的多个同步方法，如果A在运行时，B是不是阻塞的?是
	 * */
	public void test1() {
		this.syncA();
		this.syncB();
	}

	/**
	 * 测试不同实例中的多个同步方法，如果A在运行时，B是不是阻塞的?不是，即使调用相同的同步方法也不阻塞
	 * */
	public void test2() {
		Thread t1 = new Thread(new Test1());
		t1.start();
		Thread t2 = new Thread(new Test2());
		t2.start();
	}

}

class Test1 implements Runnable {
	// 不同实例
	MultiSync sync = new MultiSync();

	public void run() {
		sync.syncA();
	}
}

class Test2 implements Runnable {
	MultiSync sync = new MultiSync();

	public void run() {
		sync.syncA();
	}
}
