package strategy;

public class Main {

	public static void main(String[] args) {
		Context context = new Context1();
		context.method2();
		context.method3();
		context.setMethod2(new Strategy1_2());
		context.method2();
	}

}
