package modelview;

import java.util.Observer;
import java.util.Observable;

public class EventListenerTwo implements Observer {
	public void update(Observable o, Object arg) {
		System.out.println("EventListenerTwo.update() is called");
		
	}


}
