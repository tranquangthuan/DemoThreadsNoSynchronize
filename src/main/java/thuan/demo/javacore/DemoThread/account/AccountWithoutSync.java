package thuan.demo.javacore.DemoThread.account;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {
	private static Account account = new Account();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();

		// Create and launch 100 threads
		for (int i = 0; i < 100; i++) {
			executor.execute(new AddAPennyTask());
		}
		executor.shutdown();
		// Wait until all tasks are finished
		while (!executor.isTerminated()) {
		}
		System.out.println("What is the balance? " + account.getBalance());

	}

	public static class Account {
		private int balance = 0;

		public int getBalance() {
			return balance;
		}

		public void deposit(int amount) {
			int newBalance = balance + amount;
			// Simulate some processing time
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance = newBalance;
		}
	}

	static class AddAPennyTask implements Runnable {
		@Override
		public void run() {
			account.deposit(1);
		}
	}
}
