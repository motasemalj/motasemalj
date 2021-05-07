

public class Hermione extends ConcreteObserver implements NonPlayerCharacter, Runnable{
	
	boolean interactedWith = false;
	
	public Hermione(ConcreteSubject[] playerSubject) {
		super(playerSubject);
	
		Thread hermThread = new Thread(this);
		hermThread.start();
		
		
	}
	public String characterName() {
		return "Hermione";
	}
	public String talk() {
		interactedWith = true;
		return "\nHermione: thank you for the potions!\n";
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	while(true);
	}
	}
