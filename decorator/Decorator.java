package decorator2;

public abstract class Decorator implements Component {
	Component component;

	public Decorator(Component component) {
		this.component = component;
	}
}
