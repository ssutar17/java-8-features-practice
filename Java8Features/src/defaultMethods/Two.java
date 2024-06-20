package defaultMethods;

public interface Two {
	
	  default void m1() {
		  System.out.println("Method from Two interface");
	  }
}
