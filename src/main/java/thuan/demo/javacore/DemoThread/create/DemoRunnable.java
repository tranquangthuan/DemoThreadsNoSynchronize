package thuan.demo.javacore.DemoThread.create;

public class DemoRunnable implements Runnable {

	private String name;

	public DemoRunnable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("DemoRunnable Thread  " + name + " is running");
	}

}
