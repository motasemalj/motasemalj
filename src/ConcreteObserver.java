public class ConcreteObserver implements Observer {

	// add a list of subjects that I register with
	// rather than a single subject
	
	ConcreteSubject [] subject = null;

	public ConcreteObserver(ConcreteSubject [] subject) {
		
		this.subject = subject;
	
		// register myself with ALL my subject
		
		for(int i = 0; i<subject.length; i++) {
			subject[i].registerObserver(this);
		}

	}

	// update sends a Message
	
	@Override
	public void update(Message m) {
		System.out.println(m);	
	}
	
}