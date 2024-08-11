package thuan.demo.javacore.DemoThread.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecutorExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();

		Future<Integer> future = executor.submit(new MyCallable());
		try {
			Integer result = future.get();
			System.out.println("KQ = " + result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		executor.shutdown();

		// Wait until all threads are finish
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}

}
