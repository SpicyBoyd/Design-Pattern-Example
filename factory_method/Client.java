package factory_method;

public class Client {
	private Factory factory;
	
	public Client(Factory factory) {
		this.factory = factory;
	}
	
	public Product orderProduct() {
		Product product;
		product = factory.createProduct();
		product.addMaterial();
		product.brew();
		product.pouredCup();
		return product;
	}
}
