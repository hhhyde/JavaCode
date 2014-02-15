package threadDemo;

public class ThreadSafety implements Runnable {
	private String d;
	public static String result = "W";

	ThreadSafety(String d) {
		this.d = d;
	}

	public static String get() {
		return result;
	}

	@Override
	public synchronized void run() {
		synchronized (this) {
			result=ThreadSafety.get();
			System.out.println(result);
			result += d;
//			System.out.println(result+d);
		}
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException {
		ThreadSafety tSafetyA = new ThreadSafety("A");
		ThreadSafety tSafetyB = new ThreadSafety("B");
		Thread threadA = new Thread(tSafetyA);
		Thread threadB = new Thread(tSafetyB);
		threadA.start();
		threadB.start();
//		threadA.
		System.out.println(ThreadSafety.get());
	}
}