package thuan.demo.javacore.DemoThread.create;

public class DemoThread extends Thread {

	private String name;

	public DemoThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Thread " + name + " is running");
	}
}
