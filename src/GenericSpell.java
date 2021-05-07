

public abstract class GenericSpell {

	Message m;
	
	void castSpell()
	{
		UI.getInstance().printMessage(m);
	}
	
}
