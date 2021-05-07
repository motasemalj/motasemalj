import java.util.ArrayList;
import java.util.Scanner;

public class Player extends ConcreteSubject implements Runnable {

	//Dining Hall up
	//HeadOffice right
	//Library left
	//A better method would be to have an id for each location, but we realised too late
	int locationid = 0; //0 = start, 1 = Dining Hall, 2 = Headoffice, 3 = library, 4 = potions Classroom
	Location[] position = new Location[5]; //uses locationid for the specific
	
	int[] headOfficePwd;
	

	Spells spellbook;
	
	Player()
	{
		//Headmaster's office's password
	
		position[1] = new DiningHall();
		position[2] = new HeadOffice();
		
		position[3] = new Library( this);
		Hermione hermione = (Hermione) position[3].chars[1];
		registerObserver(hermione);
		spellbook = new Spells();
		
		position[4] = new PotionsClassroom();
				
		Thread pThread = new Thread(this);
		pThread.start();
		
	}
	
	
		
	
	//Lookaround mechanic
	void lookaround(boolean spellCast)  
	{
		switch(locationid)
		{
		case 0: System.out.println("south is the entrance, north is the super Dining Hall, east is the Headmaster's office, west is the library  "); 
		break;
 
		default: 
			if (spellCast) {
				System.out.println("You can see ");
				position[locationid].getItems();
				System.out.println( "Scattered around. "
						+ "You can also see \n");
				position[locationid].getChars();
				System.out.println("Standing around\n"
						+ "You can also go back " + position[locationid].cameFrom + " to leave the room\n" );
				}
			else
		{
				
				System.out.println("\nYou are in the " + position[locationid].locationName
						+ "\nand can see an angry " + position[locationid].chars[0].characterName() + "..Prepare yourself to fight!!\n\n");
				PlayerHealth hp = new PlayerHealth();
		}
		
		
		}
			
	}
	
	boolean fight()
	{
		
		return false;
	}
	
	//Interactions, useitem and talk to are the same, but for different types (NPC vs Item)
	void useItem(String itemName)
	{
		boolean itemfound = false;
		for (int i = 0; i < position[locationid].items.length;i++)
		{
			if (position[locationid].items[i].itemName().toLowerCase().equals(itemName.toLowerCase()))		//Case insensitive, much less efficient than case sensitive
				{System.out.println(position[locationid].items[i].use());	itemfound = true;	}
				
		}
		if (!itemfound)
			System.out.println("\n" + itemName + " not found in " + position[locationid].locationName + "- check correct spelling - \n");
	}
	
	void talkTo(String npcName)
	{
		boolean charfound = false;
		for (int i = 0; i < position[locationid].chars.length; i++)
		{
			if (position[locationid].chars[i].characterName().toLowerCase().equals(npcName.toLowerCase())) //Extremely similar to useItem
				{System.out.println(position[locationid].chars[i].talk()); 	charfound = true;}
				
		}
		if (!charfound)
			System.out.println("\n" + npcName + " not found in " + position[locationid].locationName + " - check correct spelling - \n");
	}
	
	//Movement mechanics
	boolean Move(String direction)
	{
		switch (locationid) 
		{
		//Specific cases for each room, so leave or go a specific direction
		case 1://hall
			switch(direction) 
			{
			case "down":case "south":case "back": locationid = 0;System.out.println("\nMoved out of the Dining Hall into the intersection (The Entrance)\n"); 
				return true; //TODO change to proper names of locations
			}
		
		case 2: //head 
		{
			switch(direction) 
			{
			case "left":case "west":case "back": locationid = 0; System.out.println("\nLeft the headmaster's office, you're now at the intersection (The Entrance)\n");
				return true; 
			}
			break;//Breaks out of the location case marking an invalid direction, only happens if in the area
			}
			//Library
		case 3:
			switch(direction) 
			{
			case "right":case "east": case "back": locationid = 0; System.out.println("\nLeft the Library, you're now at the intersection (The Entrance)\n");
				return true; 
			}
			break;
		case 4:
			switch(direction)
			{
			case "up": case "north": case "back": locationid = 0; System.out.println("\nleft the Potions Classroom\n");
			return true;
			}
			//If in the starting area, and if locationid horribly breaks it'll take you back to the starting area as this is the default
		case 0: default:
				switch(direction)
				{
			//	case "down":case "south": break; //no such room
				case "up":case "north": locationid = 1;System.out.println("\nYou walked into the Dining Hall\n");
				return true;
				case "left":case "west": locationid = 3; System.out.println("\nYou walked into the Library\n");
				return true; 
				case "down": case "south": locationid = 4; System.out.println("\nYou walked into the potions classroom\n");
				return true;
				
				case "right":case "east":  
				locationid = 2;
				System.out.println("\nYou walked into the Headmaster's office\n");
				return true; 
					
			
				}
		}
		
		System.out.println("\nCan't move to " + direction + " direction\n");
		return false; //Failed move
		
	}

	
	synchronized void cast(Message spellMessage)
	{
		spellbook.cast(spellMessage.payload);
		
		
	}
	
	
	ArrayList <Potion> potions = new ArrayList<Potion>();
	int polyjuiceCount = 0;
	int invisibilityCount = 0;
	synchronized boolean makePotion(Message potionMessage)
	{
		if (locationid == 4)
		{
			PotionsClassroom cauldronRoom= (PotionsClassroom) position[locationid];
			potions.add(cauldronRoom.addPotion(potionMessage.payload));
			
			switch(potionMessage.payload.toLowerCase()) {
			case "polyjuice": polyjuiceCount++; break;
			case "invisibility": case "invisibility potion": invisibilityCount++; break;
			}
			if (invisibilityCount >=1 && polyjuiceCount >=2)
				System.out.println("Hermione: You now have all the required potions, hurry up, manage your mischief");
			return true;
		}
		else
			return false;
	}
	
	


	@Override
	public void run() {
		
	}
	
}