package thuan.demo.javacore.DemoThread.create;

public class DemoThreadMain {

	public static void main(String[] args) {
		DemoThread demoThread1 = new DemoThread("Thread1");
		DemoThread demoThread2 = new DemoThread("Thread2");
		DemoThread demoThread3 = new DemoThread("Thread3");
		DemoThread demoThread4 = new DemoThread("Thread4");
		DemoThread demoThread5 = new DemoThread("Thread5");

		demoThread1.start();
		demoThread2.start();
		demoThread3.start();
		demoThread4.start();
		demoThread5.start();

		System.out.println("MAIN THREAD");

//		demoThread1.run();
//		demoThread2.run();
//		demoThread3.run();
//		demoThread4.run();
//		demoThread5.run();
	}
}
