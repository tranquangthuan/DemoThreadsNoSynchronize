package thuan.demo.javacore.DemoThread;

public class MyThread extends Thread {

	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " START");
		for (int i = 1; i <= 1000; i++) {
			Product.increment();
		}
		System.out.println(name + " END");
	}

}
