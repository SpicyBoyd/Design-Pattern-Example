package strategy;

public class Context2 extends Context {

	public Context2() {
		strategy1 = new Strategy1_2();
		strategy2 = new Strategy2_2();
	}

	@Override
	public void method1() {
		System.out.println("Context2");

	}

}
