package modelview;

public class ModelViewDemo {
	public static void main(String[] args) {
		EventNotifier en = new EventNotifier();
		
		EventListenerOne listenerOne = new EventListenerOne();
		EventListenerTwo listenerTwo = new EventListenerTwo();
		
		en.addObserver(listenerOne);
		en.addObserver(listenerTwo);
		
		en.counter(3);
	}

}
