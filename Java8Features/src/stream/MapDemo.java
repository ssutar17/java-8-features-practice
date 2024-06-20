package stream;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
      List<Integer> l=new ArrayList<Integer>();
      
      for(int i=1; i<11; i++) {
    	  l.add(i);
      }
      
      List<Integer> l1=l.stream().map(s->s=s*s).collect(Collectors.toList());
      
      for(Integer i : l1) {
    	  System.out.println(i);
      }
	}

}
