package abstract_factory;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client(new Factory1());
		client1.orderProduct();
		
		Client client2 = new Client(new Factory2());
		client2.orderProduct();
	}
}
