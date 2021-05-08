package testThreadsP;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateThread extends Thread {

	private int threadnum;
	
	public void run() {
		System.out.println("my number is "+ threadnum);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now(); 
		   System.out.print("the Date now is ");
		   System.out.println(dtf.format(now)); 
	}

	public DateThread(int threadnum) {
		super();
		this.threadnum = threadnum;
	}
}
