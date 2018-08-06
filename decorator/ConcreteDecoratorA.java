package decorator2;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return component.getDescription() + ", DecoratorA";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return component.cost() + 5;
	}

}
