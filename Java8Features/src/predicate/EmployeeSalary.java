package predicate;

import java.util.*;
import java.util.function.Predicate;

public class EmployeeSalary {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<Integer>();
		l.add(1000);
		l.add(2000);
		l.add(3000);
		l.add(4000);
		l.add(5000);
		l.add(6000);
		l.add(7000);
		l.add(8000);
		
		Predicate<Integer> p=s1->s1>3000;
		Predicate<Integer> p1=s1->s1%2==0;
		
		for(Integer i : l) {
			
			if(p.and(p1).test(i)) {
				System.out.println(i);
			}
			
		}

	}

}
