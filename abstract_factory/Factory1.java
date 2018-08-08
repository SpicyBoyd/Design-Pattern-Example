package abstract_factory;

public class Factory1 implements Factory{

	@Override
	public ProductA createProductA() {
		return new ProductA_1();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB_1();
	}

}
