package command;

public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();

		Light livingRoomLight = new Light("客廳");
		Light kitchenLight = new Light("廚房");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		invoker.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		invoker.setCommand(1, kitchenLightOn, kitchenLightOff);
		
		invoker.onButtonWasPushed(0);
		invoker.offButtonWasPushed(0);
		invoker.undoButtonWasPushed();
		invoker.offButtonWasPushed(0);
		invoker.onButtonWasPushed(1);
		invoker.undoButtonWasPushed();
	}

}
