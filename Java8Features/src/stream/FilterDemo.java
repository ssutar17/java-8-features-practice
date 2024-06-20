package stream;

import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
         List<Integer> l=new ArrayList<Integer>();
         l.add(52);
         l.add(82);
         l.add(56);
         l.add(48);
         l.add(25);
         l.add(69);
         l.add(88);
         l.add(92);
         l.add(36);
         l.add(50);

         List<Integer> l1=l.stream().filter(s->s%2==0).collect(Collectors.toList());
         
         for(Integer i : l1) {
        	 System.out.println(i);
         }
	}

}
