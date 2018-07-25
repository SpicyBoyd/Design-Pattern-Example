package strategy;

public class Context1 extends Context {

	public Context1() {
		strategy1 = new Strategy1_1();
		strategy2 = new Strategy2_1();
	}

	@Override
	public void method1() {
		System.out.println("Context1");

	}

}
