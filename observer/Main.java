package observer3;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		concreteSubject.setState(true);
		
		Observer observerA = new ConcreteObserverA(concreteSubject);
		
		concreteSubject.attach(observerA);
		concreteSubject.setState(false);
		concreteSubject.notifyObservers();
	}

}
