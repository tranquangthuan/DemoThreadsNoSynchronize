package thuan.demo.javacore.DemoThread.lock;

public class MyThreadLock extends Thread {

	private String name;

	public MyThreadLock(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " START");
		for (int i = 1; i <= 1000; i++) {
			ProductLock.increment();
		}
		System.out.println(name + " END");
	}

}
