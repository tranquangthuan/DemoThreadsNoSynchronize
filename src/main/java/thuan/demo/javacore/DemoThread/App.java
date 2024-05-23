package thuan.demo.javacore.DemoThread;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		MyThread thread1 = new MyThread("thread1");
		MyThread thread2 = new MyThread("thread2");
		MyThread thread3 = new MyThread("thread3");
		MyThread thread4 = new MyThread("thread4");
		MyThread thread5 = new MyThread("thread5");

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

		System.out.println("Final " + Product.quantity);
	}
}
