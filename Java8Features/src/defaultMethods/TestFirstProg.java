package defaultMethods;

public class TestFirstProg implements FirstProg{
	public void m1() {
		System.out.println("Child default implementation");
	}

	public static void main(String[] args) {
		
		
       TestFirstProg t= new TestFirstProg();
       t.m1();
       
       
	}

}
