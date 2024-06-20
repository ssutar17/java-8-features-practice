package stream;

import java.util.*;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {
         List<String> l=new ArrayList<String>();
         l.add("john");
         l.add("severus");
         l.add("harry");
         l.add("tony");
         l.add("xender");
         l.add("rogers");
         
         List<String> l1=l.stream().sorted().collect(Collectors.toList());
         
         for(String s1 : l1) {
        	 System.out.println(s1);
         }

         System.out.println("---------------------------------------");
         
         l1.stream().forEach(System.out::println);
	}

}
