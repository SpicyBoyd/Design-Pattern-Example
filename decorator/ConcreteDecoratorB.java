package decorator2;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return component.getDescription() + ", DecoratorB";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return component.cost() + 10;
	}

}
