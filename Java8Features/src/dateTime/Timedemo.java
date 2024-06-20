package dateTime;

import java.time.LocalTime;

public class Timedemo {

	public static void main(String[] args) {


		LocalTime time=LocalTime.now();
		
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		
		System.out.println(h+":"+m+":"+s);
	}

}
