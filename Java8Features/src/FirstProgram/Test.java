package FirstProgram;

public class Test {

	public static void main(String[] args) {
     //FunInterface f= ()-> System.out.println("Hello from...Java 8");
     //f.show();
     
    // FunInterface f1=(a,b)-> System.out.println(a+b);
    // f1.show(10, 20);
     
		FunInterface f1=n-> System.out.println(n*n);
		f1.show(10);
     
	}

}
