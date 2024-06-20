package FirstProgram;

public class AnonymousInClass {

	public static void main(String[] args) {
		
		Runnable r=new Runnable() {
			public void run() {
				for(int i=1; i<10; i++) {
					System.out.println("child thread");		
					}
			}
			
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=1; i<10; i++) {
			System.out.println("main thread");		
			}

	}

}
