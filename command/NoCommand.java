package command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("沒有command");

	}

	@Override
	public void undo() {
		System.out.println("沒有command");

	}

}
