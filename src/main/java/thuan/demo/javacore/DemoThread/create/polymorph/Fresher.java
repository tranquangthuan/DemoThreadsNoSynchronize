package thuan.demo.javacore.DemoThread.create.polymorph;

public class Fresher extends Candidate implements Runnable {

	public Fresher(String name) {
		super(name);
	}

	@Override
	public void showInfor() {
		System.out.println("Fresher information");
	}

	@Override
	public synchronized void run() {
		System.out.println("Fresher name = " + super.name);
	}

}
