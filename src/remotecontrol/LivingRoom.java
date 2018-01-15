package remotecontrol;

public class LivingRoom {

	public static void main(String[] args) {
		Television TV = new Television("Panasonic 42pol");
		SurroundSoundSystem sound = new SurroundSoundSystem("SuperSound");
		
		RemoteControl rc = RemoteControl.getInstance();
		
		rc.connectToDevice(TV);
		rc.turnOnDevice();
		rc.connectToDevice(sound);
		rc.turnOnDevice();
		
		
 
	}

}
