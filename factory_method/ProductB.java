package factory_method;

public class ProductB implements Product{

	@Override
	public void addMaterial() {
		System.out.println("ProductB：addMaterial");
		
	}

	@Override
	public void brew() {
		System.out.println("ProductB：brew");
		
	}

	@Override
	public void pouredCup() {
		System.out.println("ProductB：pouredCup");
		
	}

}
