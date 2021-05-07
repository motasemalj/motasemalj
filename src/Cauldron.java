import java.util.PrimitiveIterator.OfDouble;

public class Cauldron implements Item {
//TODO LINK TO CREATING POTIONS
	@Override
	public String itemName() {
		// TODO Auto-generated method stub
		return "Cauldron";
	}

	@Override
	public String use() {
		// TODO Auto-generated method stub
		return "Return to use the cauldron, use 'make POTIONNAME'";
	}
	
	
	//May be discarded
	Potion createPotion(String potionName)
	{
		
		Potion p;
		switch (potionName.toLowerCase()) {
		case "poly juice": case "polyjuice": p = new Polyjuice(); break;
		case "invisibility potion": case "invisibilitypotion": case "invisibility": p = new InvisibilityPotion(); break;
		default: p = new InvisibilityPotion();
		}
			p.preparePotion();
		 return p;
	
		
		
	}

}
