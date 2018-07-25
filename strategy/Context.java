package strategy;

public abstract class Context {
	Strategy1 strategy1;
	Strategy2 strategy2;

	public Context() {
		
	}

	public abstract void method1();
	
	public void method2() {
		strategy1.action1();
	}
	
	public void method3() {
		strategy2.action2();
	}
	
	//可以更換method2, method3
	public void setMethod2(Strategy1 strategy1) {
		this.strategy1 = strategy1;
	}
	
	public void setMethod3(Strategy2 strategy2) {
		this.strategy2 = strategy2;
	}
}
