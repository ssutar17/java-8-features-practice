package FirstProgram;

import java.util.*;

public class SortUsingLambda {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<Integer>();
		l.add(23);
		l.add(65);
		l.add(34);
		l.add(12);
		l.add(67);
		l.add(76);
		l.add(26);
		
		System.out.println(l);
		
		Comparator<Integer> c=(I1, I2)-> (I1<I2?-1:I1>I2?1:0);
		Collections.sort(l, c);
		
		System.out.println(l);

	}

}
