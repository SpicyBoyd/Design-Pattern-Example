package observer3;

public class ConcreteObserverA implements Observer{
	private boolean observerState;
	private ConcreteSubject concreteSubject;
	
	public ConcreteObserverA(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.observerState = concreteSubject.isState();
		System.out.println(getClass().getSimpleName() + " 收到通知");
        System.out.println(observerState);
        System.out.println();
	}
	
	public void unsubscribe() {
		concreteSubject.detach(this);
	}
	
}
