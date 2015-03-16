package ch19.timerdemo;

import java.util.Timer;

public class MyTimer extends Timer {
	public static void main(String[] args) {
		MyTimerTask timerTask = new MyTimerTask();
		MyTimer myTimer = new MyTimer();
		
		myTimer.schedule(timerTask, 1000, 500);
	
		try {
			System.out.println("Before going to sleep");
			Thread.sleep(3000);
			System.out.println("After sleeping is done");
		} catch (InterruptedException e) {
		}
		myTimer.cancel();
	} // end of main()

} // end of MyTimer
