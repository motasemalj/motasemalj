import java.util.Scanner;

public class UI extends ConcreteSubject implements Runnable{

	private static UI inst = null;
	
	 private UI(){
		Thread t = new Thread(this);
		t.start();
	}
	
	 public static UI getInstance()
	    {
			if (inst == null)
	        	inst = new UI();
	  
	        return inst;
	    }
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  
       
		
		while(true) {
		
		System.out.println("                                         _ __\n"
				+ "        ___                             | '  \\\n"
				+ "   ___  \\ /  ___         ,'\\_           | .-. \\        /|\n"
				+ "   \\ /  | |,'__ \\  ,'\\_  |   \\          | | | |      ,' |_   /|\n"
				+ " _ | |  | |\\/  \\ \\ |   \\ | |\\_|    _    | |_| |   _ '-. .-',' |_   _\n"
				+ "// | |  | |____| | | |\\_|| |__    //    |     | ,'_`. | | '-. .-',' `. ,'\\_\n"
				+ "\\\\_| |_,' .-, _  | | |   | |\\ \\  //    .| |\\_/ | / \\ || |   | | / |\\  \\|   \\\n"
				+ " `-. .-'| |/ / | | | |   | | \\ \\//     |  |    | | | || |   | | | |_\\ || |\\_|\n"
				+ "   | |  | || \\_| | | |   /_\\  \\ /      | |`    | | | || |   | | | .---'| |\n"
				+ "   | |  | |\\___,_\\ /_\\ _      //       | |     | \\_/ || |   | | | |  /\\| |\n"
				+ "   /_\\  | |           //_____//       .||`      `._,' | |   | | \\ `-' /| |\n"
				+ "        /_\\           `------'        \\ |           `.\\  | |  `._,' /_\\\n"
				+ "                                       \\|                 `.\\"
				+ ""
				+ "\n\n \t\t--A game created by Motasem and Ali--"
				+ "\n\n\n"
				+ "Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to\n"
				+ "magical Mischief-Makers are proud to present THE MARAUDER'S MAP\n"
				+ "Say the magic phrase to reveal the map.\n\n"
				+ "To exit the game, type 'mischief managed'\n\n");
	
	
		Player player = new Player(); //It would be of a class main character which extends movement. but also can interact with things
		//here
		boolean pwd = false;
		
		Message actionMessage, dest;
		Message password = new Message(this, "password", in.nextLine());				
		String Password = password.payload;
	
		while(!pwd)
		{
			switch (Password.toLowerCase()) //To lower to keep it case insensitive 
			{
			
			 case "i solemnly swear that i am up for no good": case "up up down down left right left right b a": case "test": //Small easter egg
				pwd = true;
				Clock c = Clock.getInstance();
				break;
			case "mischief managed": 
				System.out.println("Thank you for playing our extremely accurate game of Harry Potter, made by two people who definitely watched all the movies and read\n"
				+ "Hiding the map, \nTHE END"); 
			System.exit(0); //No need for break as it terminates. Only one userinput as there is no need to distinguish between the first and second words
			default:
			System.out.println("Wrong Password");
			password = new Message(this, "password", in.nextLine());
			Password = password.payload;
	
			
			}
		};
		
		

		System.out.println(""
				+ ""
				+ "\n"
				+ "     \n The Marauder's Map: \n"
				+ "                           ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▀▀▄▄▄▄▄▄▀▀▀▄\n"
				+ "             �            ▀                                 ▀▄\n"
				+ "                     ▄▄▄▀▀               North                 ▀▄\n"
				+ "                 ▄▀                 The Dining Hall                ▀▄▄\n"
				+ "            ▄▄▀                         ▄▄▄▄▄▄▄                        ▀▄\n"
				+ "            █     �                    ▓       ▌                         ▄▀\n"
				+ "           ▌                           ▓       ▌                         ▌\n"
				+ "           ▐                           ▓       ▌                         ▌\n"
				+ "           ▓              West         ▓▄▄▄▄▄▄▓            East         ▌\n"
				+ "           █            Library                    Headmasters Office    ▀\n"
				+ "           ▓            ▄▄▄▄▄▄                            ▄▄▄▄▄▄          ▐▀\n"
				+ "           ▌           ▓      █                          ▓      █         ▐\n"
				+ "           ▓           ▓      ▓                          ▓      ▓          ▀▄\n"
				+ "           ▄           ▓      ▓     <you are here>       ▓      ▓            ▌\n"
				+ "           █           ▓      ▓      The Entrance        ▓      ▓             ▓\n"
				+ "           ▓           ▓▄▄▄▄▄▄▓                          ▀▀▀▀▀▀▀▀            ▌\n"
				+ "           ▐                                                                ▌\n"
				+ "          ▄                             South                               ▓\n"
				+ "           ▀▀                   ▄- Poitions Classroom -▄                  ▓\n"
				+ "              ▀▀▄   ▄▄▄▄▄▄▄▄                      ▄▄▄▄▄▄▄▄▄▄▄▄▄    ▄▀▀▀▀▀\n"
				+ "                 ▀▀▀        ▀▄     ▄▀▐▄▄▀▀▀▀▀▀▀▀▀▀              ▀▀▀\n"
				+ "                               ▀▀\n"
				+ "     \n"
				+ "     \n"
				+ "    "
				+ ""
				+ ""
				+ ""
				+ ""
				+ "The Entrance\n"
				+ "You arrive at the doors of Hogwarts. The door on the north wall leads to\n"
				+ "the dining hall, the door to the east leads to the Headmaster’s office\n"
				+ "and the door to the west leads to the Library and the "
				+ "door on the south leads to the Potions Classroom.\n");
		boolean spellCast = false;
		while(true)
		{
		
		System.out.println("What will you do?\n"
				+ "To move, type 'walk [direction]',\n"
				+ "to use an item, type 'use [item]',\n"
				+ "to talk to someone, type 'talk [character]'\n"
				+ "to look around, type 'look' or 'lookaround' to find the exact spelling of interactable objects"
				+ "\n"
				+ "to cast a spell, type 'cast [spell name]'\n");
		actionMessage = new Message(this, "action", in.next());				
		
		
		//All of them but the exit calls upon the player class, which has all the logic
		switch(actionMessage.payload)
		{
		//Simple cases of 
		case "move": case "walk": case "go":
			spellCast = false; //Reset spellcast for the next room
			dest = new Message(this, "dest", in.next());		
			player.Move(dest.payload);
			break;
		case "use":
			dest = new Message(this, "dest", in.next());		
			player.useItem(dest.payload);
			break;
		case "talk":
			dest = new Message(this, "dest", in.next());		
			player.talkTo(dest.payload);
			break;
		case "look": case "lookaround":
			player.lookaround(spellCast); 
			break;
		case "cast": 
			spellCast = true;
			dest = new Message(this, "dest", in.next());
			player.cast(dest);
			
			break;
			
		case "make":
			dest = new Message(this, "Potion make", in.next());
			player.makePotion(dest);
			
		case "mischief": 
			dest = new Message(this, "dest", in.next());		
			if (dest.payload.equals("managed")){System.out.println("Thank you for playing!\n"
				+ "Hiding the map, \nTHE END");  System.exit(0);}
		default:
			System.out.println("Wrong Input!"); //
				}
		
			}
		}      
		
		
		
	}
	
	void printMessage(Message m)
	{
		System.out.println("\n" + m.topic + "\n" + m.payload);
	}
	

}
