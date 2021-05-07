
public class PlayerHealth implements Runnable {
	
	public PlayerHealth() {
		Thread t = new Thread(this);
		t.start();
	}

	
	
	@Override
	public void run() {
		int health = 100;
		System.out.println("Your health is 100%");
		while(true) {
		try {
			Thread.sleep(150);

			if (health>0) {
				health--;
				if(health%30==0)
				System.out.println("\nYou've been hit!\nYour health is " + (health+5) +"%\nCast a spell!!");
			
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	

}