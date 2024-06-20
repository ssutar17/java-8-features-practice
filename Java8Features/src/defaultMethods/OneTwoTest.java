package defaultMethods;

public class OneTwoTest implements One,Two {
	
	public void m1() {
		System.out.println("method from class");
		One.super.m1();
		Two.super.m1();
	}

	public static void main(String[] args) {
         OneTwoTest t=new OneTwoTest();
         t.m1();
	}

}
