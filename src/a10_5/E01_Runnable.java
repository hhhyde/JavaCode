package a10_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Printer implements Runnable {
	private static int taskCount;
	private final int id = taskCount++;

	Printer() {
		System.out.println("Printer started, ID = " + id);
	}

	public void run() {
		System.out.println("Stage 1..., ID = " + id);
		Thread.yield();
		System.out.println("Stage 2..., ID = " + id);
		Thread.yield();
		System.out.println("Stage 3..., ID = " + id);
		Thread.yield();
		System.out.println("Printer ended, ID = " + id);
	}
}

public class E01_Runnable {
	public static void main(String[] args) {
		ExecutorService exec=Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		System.out.println("----------------"+new LiftOff().getTaskcount());
		exec.shutdown();
	}
}