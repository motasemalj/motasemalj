
//Made using commands to practise using them (From Wednesday's lecture)
import java.util.Random;


//Keeping the spells in a separate package prevents unwanted access
//For a proper implementation within a combat system, some changes have to be made.
public class Spells {

	// for testing purposes
	void castRandomSpell()
	{
		switch (new Random().nextInt(4)) {
		case 0:
			new ExpectoPatronum();
			break;
		case 1:
			new Expelliarmus();
			break;
		case 2:
			new Protego();
			break;
		case 3:
			new Stupefy();
			break;

		default:
			break;
		}
	}
	
	
	void cast(String spellName)
	{
		switch (spellName.toLowerCase())
		{
		case "expectopatronum": case "expecto patronum": case "expecto": this.expectoPatronum(); break;
		case "expelliarmus": this.expelliarmus(); break;
		case "protego": this.protego(); break;
		case "stupefy": this.stupefy(); break;
		}
	}
	//Able to add a boolean to lock spells until you learn them
	//One example added for Stupefy, assumend learned anyway
	boolean knowStupefy = true;
	
	void expectoPatronum()
	{
		new ExpectoPatronum();
	}
	void expelliarmus()
	{
		new Expelliarmus();
	}
	void protego()
	{
		new Protego();
	}
	void stupefy()
	{
		if (knowStupefy)
			new Stupefy();
	}
}
