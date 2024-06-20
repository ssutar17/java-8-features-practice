package defaultMethods;

public interface One {
    default void m1() {
    	System.out.println("Method from one interface");
    }
}
