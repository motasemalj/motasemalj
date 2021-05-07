
public class Polyjuice extends Potion{
	
	int count = 0;

	@Override
	public void addIngredients() {
		System.out.println("Adding fluxweed and lacewings in cauldron..");
		count++;
	}

	public int getCount() {
		return count;
	}

	public String itemName() {
		// TODO Auto-generated method stub
		return "Polyjuice";
	}
}
