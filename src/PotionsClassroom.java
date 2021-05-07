import java.util.ArrayList;

public class PotionsClassroom extends Location {

	
	ArrayList <Potion> potions = new ArrayList<Potion>();
	public PotionsClassroom() {
		super();
		//Initialise items and characters  in the potions classroom
	items[0] = new Cauldron();
	chars[0] = new Snape();
	locationName = "Potions Classroom";
	//Used to know where you came from, not needed in this specific game as it can be hardcoded with the game's conditions, but helps in future expansion
	cameFrom = "north";
	}//South room
	
	
	//To create new potions, use after making a potion to add the potion to the potionsclassroom
	Potion addPotion(String potionName) {
		
		Cauldron potionCauldron = (Cauldron) items[0];
		Potion p = potionCauldron.createPotion(potionName);
		potions.add(p);
		
		return p;
		
	}

}
