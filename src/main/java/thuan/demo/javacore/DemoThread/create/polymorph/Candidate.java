package thuan.demo.javacore.DemoThread.create.polymorph;

public abstract class Candidate implements Runnable {

	protected String name;

	public Candidate(String name) {
		super();
		this.name = name;
	}

	public abstract void showInfor();
}
