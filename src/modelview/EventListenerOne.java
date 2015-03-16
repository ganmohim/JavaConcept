package modelview;

import java.util.Observable;
import java.util.Observer;

public class EventListenerOne implements Observer {
	public void update(Observable o, Object arg ) {
		System.out.println("EVentListenerOne.update() was called with value: " + 
				((Integer) arg).intValue());
	}
}
