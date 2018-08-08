package abstract_factory;

public class ProductA_2 implements ProductA{

	@Override
	public void addMaterial() {
		System.out.println("ProductA_2：addMaterial");
		
	}

	@Override
	public void brew() {
		System.out.println("ProductA_2：brew");
		
	}

	@Override
	public void pouredCup() {
		System.out.println("ProductA_2：pouredCup");
		
	}

}
