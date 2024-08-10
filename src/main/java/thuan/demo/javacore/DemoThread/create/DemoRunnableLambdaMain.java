package thuan.demo.javacore.DemoThread.create;

public class DemoRunnableLambdaMain {

	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("R1 running");
		Runnable r2 = () -> System.out.println("R2 running");
		Runnable r3 = () -> System.out.println("R3 running");
		Runnable r4 = () -> System.out.println("R4 running");
		Runnable r5 = () -> System.out.println("R5 running");

		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		Thread thread3 = new Thread(r3);
		Thread thread4 = new Thread(r4);
		Thread thread5 = new Thread(r5);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
