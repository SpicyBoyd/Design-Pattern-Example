package simple_factory;

public class Main {

	public static void main(String[] args) {
		Client client = new Client(new SimpleFactory());
		client.orderProduct("ProductA");
		client.orderProduct("ProductB");
	}
}
