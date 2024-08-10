package thuan.demo.javacore.DemoThread.create.polymorph;

public class CandidateMng {

	public static void main(String[] args) {
		Candidate can1 = new Fresher("Nguyen Van A");
		Candidate can2 = new Fresher("Nguyen Van B");
		Candidate can3 = new Experience("Nguyen Van C", 1);
		Candidate can4 = new Experience("Nguyen Van D", 2);
		Candidate can5 = new Experience("Nguyen Van E", 3);

		Thread thread1 = new Thread(can1);
		Thread thread2 = new Thread(can2);
		Thread thread3 = new Thread(can3);
		Thread thread4 = new Thread(can4);
		Thread thread5 = new Thread(can5);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}

}
