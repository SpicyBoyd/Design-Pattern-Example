package command;

public class LightOffCommand implements Command {
	private Light	light;
	private boolean	open;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.open = light.isOpen();
		light.off();
	}

	@Override
	public void undo() {
		// light.on();
		if (open == true) {
			light.on();
		}
		else if (open == false) {
			light.off();
		}
	}

}
