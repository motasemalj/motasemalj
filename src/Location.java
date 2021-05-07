
abstract public class Location {//Superclass

	String locationName;
	NonPlayerCharacter[] chars = new NonPlayerCharacter[2]; //Only one character needed, but in case there is a need for more than 1 character, this still works by changing the size. Ideally would use a data structure such as a Vector or a List
	Item[] items = new Item[2]; //Same as before but 2, give items in subclass, vector will be better
	String cameFrom; //To track where they came from

	//Item and character listings
	void getItems()
	{
		for (int i = 0;i < items.length; i++)
			 if (items[i] != null)
				 System.out.println("" + items[i].itemName());
		 System.out.println(" ");
	}
	 void getChars()
	{
		 for (int i = 0;i < chars.length; i++)
			 if (chars[i] != null)
				 System.out.println(chars[i].characterName());
		 System.out.println(" ");
	}
	 
	 
	 //Not sure if it'll be used
	 boolean getChars(String specificCharacterName)
	 {
		 for (int i = 0; chars[i]!= null ; i++)
		 {
			 if (chars[i].characterName() == specificCharacterName )
				 return true;
		 }
		 return false;
	 }
	
	
	//void itemList() {System.out.println(items);} //Lists items in the location, redundant and used toString instead of itemName()
	
	void useitem(String item)
	{
		for (int i = 0; items[i] != null; i++)
		{
			if (items[i].itemName() == item)
			{
				items[i].use();
		
			}
		}
		System.out.println("Item not found");
	}
	


	
	
}
