package thuan.demo.javacore.DemoThread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ProductLock {

	private static ReentrantLock lock = new ReentrantLock();

	public static int quantity;

	public static void increment() {
		lock.lock();
		try {
			quantity++;
		} finally {
			lock.unlock();
		}
	}
}
