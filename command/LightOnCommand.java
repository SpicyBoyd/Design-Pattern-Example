package command;

public class LightOnCommand implements Command {
	private Light	light;
	private boolean	open;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.open = light.isOpen();
		light.on();
	}

	@Override
	public void undo() {
//		light.off();
		if (open == true) {
			light.on();
		}
		else if (open == false) {
			light.off();
		}
	}

}
