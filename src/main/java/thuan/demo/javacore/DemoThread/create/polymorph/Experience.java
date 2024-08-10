package thuan.demo.javacore.DemoThread.create.polymorph;

public class Experience extends Candidate implements Runnable {

	private int yearsExp;

	public Experience(String name, int yearsExp) {
		super(name);
		this.yearsExp = yearsExp;
	}

	@Override
	public void showInfor() {
		System.out.println("Experience information");
	}

	@Override
	public synchronized void run() {
		System.out.println("Experience name = " + super.name + "  yearExp = " + yearsExp);
	}

}
