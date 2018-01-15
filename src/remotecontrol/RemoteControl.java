package remotecontrol;

public class RemoteControl {
	
	private static RemoteControl instance = null;
	private RemoteControlable device;
	
	private RemoteControl() {}
	
	public static synchronized RemoteControl getInstance() {
		if (instance==null) {
			instance = new RemoteControl();
		}
		
		return instance;
	}
	
	public void connectToDevice(RemoteControlable device) {
		this.device = device;
 	}
	
	public void turnOnDevice() {
		System.out.println("Device: " +this.device);
		this.device.turnOn();
	}
	
	public void tunrOffDevice() {
		System.out.println("Device: " +this.device);
		this.device.turnOff();
	}
	

}
