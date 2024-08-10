package thuan.demo.javacore.DemoThread.lock;

/**
 * Hello world!
 *
 */
public class AppLock {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		long startTime = System.currentTimeMillis();
		MyThreadLock thread1 = new MyThreadLock("thread1");
		MyThreadLock thread2 = new MyThreadLock("thread2");
		MyThreadLock thread3 = new MyThreadLock("thread3");
		MyThreadLock thread4 = new MyThreadLock("thread4");
		MyThreadLock thread5 = new MyThreadLock("thread5");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final " + ProductLock.quantity);
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time = " + (endTime - startTime));
	}
}
