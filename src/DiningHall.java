
public class DiningHall extends Location {

	
	public DiningHall() {
		super();
			//Initialize items and characters  in the great hall
		items[0] = new SortingHat();
		items[1] = new Food();
		chars[0] = new Bellatrix();
		locationName = "Dining Hall";
		//Used to know where you came from, not needed in this specific game as it can be hardcoded with the game's conditions, but helps in future expansion
		cameFrom = "south";
	} //North



}
