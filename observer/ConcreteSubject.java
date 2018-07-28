package observer3;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private boolean state;
	private List<Observer> observers;

	public ConcreteSubject() {
		observers = new ArrayList<>();
	}

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------");
		System.out.println("| " + getClass().getSimpleName() + " 通知給所有觀察者更新 |");
		System.out.println("-------------------------------------");
		System.out.println("                 ▼");
		System.out.println();
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
		System.out.println(getClass().getSimpleName() + " 變更狀態");
		System.out.println(state);
		System.out.println();
	}
}
