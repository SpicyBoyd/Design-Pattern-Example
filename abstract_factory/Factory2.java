package abstract_factory;

public class Factory2 implements Factory{

	@Override
	public ProductA createProductA() {
		return new ProductA_2();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB_2();
	}

	

}
