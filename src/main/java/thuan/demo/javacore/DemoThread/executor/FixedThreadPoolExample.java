package thuan.demo.javacore.DemoThread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 1; i <= 3; i++) {
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker);
		}

		executor.shutdown();

		// Wait until all threads are finish
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}

}
