package simple_factory;

public class ProductA implements Product{

	@Override
	public void addMaterial() {
		System.out.println("ProductA：addMaterial");
		
	}

	@Override
	public void brew() {
		System.out.println("ProductA：brew");
		
	}

	@Override
	public void pouredCup() {
		System.out.println("ProductA：pouredCup");
		
	}

}
