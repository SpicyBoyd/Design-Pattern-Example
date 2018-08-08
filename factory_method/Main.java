package factory_method;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client(new FactoryA());
		client1.orderProduct();
		
		Client client2 = new Client(new FactoryB());
		client2.orderProduct();
	}
}
