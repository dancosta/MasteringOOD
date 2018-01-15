package remotecontrol;

public class SurroundSoundSystem implements RemoteControlable {
	
	private String model;
		
	public SurroundSoundSystem(String model) {

		this.model = model;
	}

	
	@Override
	public String toString() {
		return "SurroundSoundSystem [model=" + model + "]";
	}


	@Override
	public void turnOn() {
		System.out.println("SurroundSoundSystem turn on") ;
		
	}

	@Override
	public void turnOff() {
		System.out.println("SurroundSoundSystem turn off") ;
		
	}

}
