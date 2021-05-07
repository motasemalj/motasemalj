
public class InvisibilityPotion extends Potion {

	int count = 0;
	
	@Override
	public void addIngredients() {
		System.out.println("Adding cherries and spiders in cauldron..");
		
		count++;
	}

	public int getCount() {
		return count;
	}

	public String itemName() {
		// TODO Auto-generated method stub
		return "Invisibility Potion";
	}
}
