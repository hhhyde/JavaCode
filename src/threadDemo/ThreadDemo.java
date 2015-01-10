package threadDemo;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.ietf.jgss.Oid;

public class ThreadDemo {
	// 测试线程池的submit方法
	private void submit() {
		Thread t1 = new Thread(new Thread1());
		t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			public void uncaughtException(Thread arg0, Throwable arg1) {
				System.out.println(arg0.getName() + arg1.getMessage());
			}
		});
		ExecutorService executors = Executors.newCachedThreadPool();
		// executors.execute(t1);
		Future<String> result1 = executors.submit(new Thread2());
		Future<String> result2 = executors.submit(new Thread2());
		Future<String> result3 = executors.submit(new Thread2());
		Future<String> result4 = executors.submit(new Thread2());
		Future<String> result5 = executors.submit(new Thread2());
		executors.shutdown();
		System.out.println("main");
		// 结果不能保证main在最后打出来,可以多试几次
	}

	private void invokeAll() {
	}

	public ThreadDemo() {
		ExecutorService pool = Executors.newCachedThreadPool();

		ArrayList<Callable<Integer>> callers = new ArrayList<Callable<Integer>>();

		int len = 20;
		final Random rnd = new Random(System.currentTimeMillis());
		for (int i = 0; i < len; i++) {
			callers.add(new Callable<Integer>() {
				public Integer call() throws Exception {
					String name = Thread.currentThread().getName();
					int num = rnd.nextInt(10);
					// 如果生成的随机数大于5，就抛出个异常，
					if (num > 5) {
						System.out.println("exception:----");
						throw new InterruptedException(name);
					}
					Thread.sleep(10000);
					System.out.println(name);
					return num;
				}
			});
		}

		try {
			// 这里的invokeAll不会抛出任何子线程的异常，因为它们都被收集起来了。存进Future了
			List<Future<Integer>> aa = pool.invokeAll(callers);
			for (Future<Integer> future : aa) {
				// 查看结果，有异常抛异常
				System.out.println(future.get());
				if (future.get() > 5) {
					throw new Exception(future.get().toString());
				}
			}
		} catch (Exception e) {
			System.out.println("#################" + e.getMessage());
		}

		System.out.println("done!");
		pool.shutdown();
	}

	public static void main(String[] args) {
		ThreadDemo tDemo = new ThreadDemo();
		tDemo.invokeAll();

	}
}

class Thread1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
}

class Thread2 implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("Thread2:" + Thread.currentThread().getId());
		Thread.sleep(2000);
		return "Thread2";
	}

}