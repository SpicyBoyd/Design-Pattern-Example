package factory_method;

public class FactoryB implements Factory{

	@Override
	public Product createProduct() {
		return new ProductB();
	}

}
