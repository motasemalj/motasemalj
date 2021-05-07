
public abstract class Potion implements AddIngredients{
	Potion() {
		
	}

	final void preparePotion() {
		addIngredients();
		Stir();
		Heat();
		Wave();
		
	}
	
	
	protected void Stir() {
		System.out.println("Stirring 4 times clockwise..");
	}
	protected void Heat() {
		System.out.println("Heating at a high temperature..");
	}
	
	protected void Wave() {
		System.out.println("Waving hand to complete brewing..\nPotion is ready!");
	}

}
