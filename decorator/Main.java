package decorator2;

public class Main {

	public static void main(String[] args) {
		Component component1 = new ConcreteComponentA();
		System.out.println(component1.getDescription() + "," + component1.cost());
		
		Component component2 = new ConcreteComponentB();
		component2 = new ConcreteDecoratorA(component2);
		component2 = new ConcreteDecoratorB(component2);
		System.out.println(component2.getDescription() + "," + component2.cost());
	}

}
