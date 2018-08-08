package abstract_factory;

public class ProductA_1 implements ProductA{

	@Override
	public void addMaterial() {
		System.out.println("ProductA_1：addMaterial");
		
	}

	@Override
	public void brew() {
		System.out.println("ProductA_1：brew");
		
	}

	@Override
	public void pouredCup() {
		System.out.println("ProductA_1：pouredCup");
		
	}

}
