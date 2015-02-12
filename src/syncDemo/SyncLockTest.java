package syncDemo;

public class SyncLockTest {
	public static void main(String[] args) {
		SyncLock syncLock = new SyncLock();
		syncLock.test2();
	}
}

class SyncLock {
	// 生成零长度的byte[]对象只需3条操作码,而实例化object需要7条
	public byte[] lock = new byte[0];

	public void set(byte[] lock) {
		this.lock = lock;
	}

	public byte[] get() {
		return this.lock;
	}

	public void syncA() {
		synchronized (lock) {
			System.out.println('A');
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void syncB() {
		synchronized (lock) {
			System.out.println('B');
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 同实例，同一个锁是不是能互斥？互斥
	 * */
	public void test1() {
		SyncLock1 syncLock1 = new SyncLock1(this);
		SyncLock2 syncLock2 = new SyncLock2(this);
		Thread thread1 = new Thread(syncLock1);
		Thread thread2 = new Thread(syncLock2);
		thread1.start();
		thread2.start();
	}

	/**
	 * 不同实例，同一个锁是不是能互斥？互斥
	 * */
	public void test2() {
		SyncLock syLock1 = new SyncLock();
		syLock1.set(lock);
		SyncLock syLock2 = new SyncLock();
		syLock2.set(lock);
		SyncLock1 syncLock1 = new SyncLock1(syLock1);
		SyncLock2 syncLock2 = new SyncLock2(syLock2);
		Thread thread1 = new Thread(syncLock1);
		Thread thread2 = new Thread(syncLock2);
		thread1.start();
		thread2.start();
	}
}

class SyncLock1 implements Runnable {
	// 不同实例
	SyncLock sync = null;

	public SyncLock1(SyncLock sync) {
		this.sync = sync;
	}

	public void run() {
		sync.syncA();
	}
}

class SyncLock2 implements Runnable {
	SyncLock sync = null;

	public SyncLock2(SyncLock sync) {
		this.sync = sync;
	}

	public void run() {
		sync.syncB();
	}
}