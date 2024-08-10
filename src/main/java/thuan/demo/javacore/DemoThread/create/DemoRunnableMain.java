package thuan.demo.javacore.DemoThread.create;

public class DemoRunnableMain {

	public static void main(String[] args) {
		DemoRunnable runnable1 = new DemoRunnable("Runnable 1");
		DemoRunnable runnable2 = new DemoRunnable("Runnable 2");
		DemoRunnable runnable3 = new DemoRunnable("Runnable 3");
		DemoRunnable runnable4 = new DemoRunnable("Runnable 4");
		DemoRunnable runnable5 = new DemoRunnable("Runnable 5");

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		Thread thread3 = new Thread(runnable3);
		Thread thread4 = new Thread(runnable4);
		Thread thread5 = new Thread(runnable5);

		runnable1.run();
		runnable2.run();
		runnable3.run();
		runnable4.run();
		runnable5.run();

//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
//		thread5.start();
	}
}
