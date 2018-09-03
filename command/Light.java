package command;

// Receiver
public class Light {
	private boolean	open;
	private String	location;

	public Light() {
	}

	public Light(String location) {
		this.open = false;
		this.location = location;
	}

	public void on() {
		this.open = true;
		System.out.println(location + "：燈亮");
	}

	public void off() {
		this.open = false;
		System.out.println(location + "：燈暗");
	}

	public boolean isOpen() {
		return open;
	}

}
