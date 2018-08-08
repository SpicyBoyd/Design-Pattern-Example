package simple_factory;

public class Client {
	private SimpleFactory factory;
	
	public Client(SimpleFactory factory) {
		this.factory = factory;
	}
	
	public Product orderProduct(String name) {
		Product product;
		product = factory.createProduct(name);
		product.addMaterial();
		product.brew();
		product.pouredCup();
		return product;
	}
}
