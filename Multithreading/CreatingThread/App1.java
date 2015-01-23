package demo1;

class Runner extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello  " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App1 {
	public static void main(String[] args) {
		Runner thread1 = new Runner();
		thread1.start();

		Runner thread2 = new Runner();
		thread2.start();
	}
}
