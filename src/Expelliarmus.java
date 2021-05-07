

public class Expelliarmus extends GenericSpell{

	public Expelliarmus() {
		// TODO Auto-generated constructor stub
		m = new Message(this,"EXPELLIARMUS", ""
				+ "\nthe target is now disarmed (The arm is still there though)\n--You defeated your enemy--\\n");
		castSpell();
	}
}
