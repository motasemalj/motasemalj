
public class Library extends Location { //West/3

	public Library(Player player) {
		super();
		ConcreteSubject[] players = {player};
		//Initialise items and characters  in the Library
		items[0] = new Quill();
		items[1] = new Books();
		chars[1] = new Hermione(players);
		chars[0] = new Draco();
		locationName = "Library";
		cameFrom = "East"; //See great hall's comment
	} 

}
