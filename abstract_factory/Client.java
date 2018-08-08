package abstract_factory;

public class Client {
	private Factory factory;

	public Client(Factory factory) {
		this.factory = factory;
	}

	public void orderProduct() {
		ProductA productA;
		ProductB productB;
		productA = factory.createProductA();
		productA.addMaterial();
		productA.brew();
		productA.pouredCup();

		productB = factory.createProductB();
		productB.method1();
		productB.method2();
		productB.method3();
	}
}
