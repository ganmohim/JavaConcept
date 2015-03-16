package modelview;

import java.util.Observable;

public class EventNotifier extends Observable {
	
	public void counter(int period) {
		for (; period >= 0; period--) {
			setChanged();
			notifyObservers((Integer) period);
		}
		
		try {
			Thread.sleep(100);
			
		} catch(InterruptedException e) {
			System.out.println("Seep interrupted.");
		}
	} // end of counter()
	

}
