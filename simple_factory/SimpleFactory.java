package simple_factory;

public class SimpleFactory {
	public Product product;
	
	//public static Product createProduct(String name) {
	public Product createProduct(String name) {	
		if(name.equals("ProductA")) {
			product = new ProductA();
		}else if (name.equals("ProductB")) {
			product = new ProductB();
		}
		return product;		
	}
}
