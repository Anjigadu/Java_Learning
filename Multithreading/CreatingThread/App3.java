package demo3;

public class App3 {

	int count = 0;
	
	public synchronized void increment(){
		count++;
	}
	
	public static void main(String[] args) {
		
		App app = new App();
		app.dowork();
	}
	
	
	public void dowork(){
		
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				for (int i = 0; i <= 10000; i++){
			//		System.out.println("Hello  " + i);
					//count++;
					increment();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				for (int i = 0; i <= 10000; i++){
					//System.out.println("Hello  " + i);
					//count++;
					increment();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count = " + count);
	}

}
