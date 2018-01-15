package remotecontrol;

public class Projector implements RemoteControlable {
	
	private String model;
		
	public Projector(String model) {

		this.model = model;
	}

	
	@Override
	public String toString() {
		return "Projector [model=" + model + "]";
	}


	@Override
	public void turnOn() {
		System.out.println("Projector turn on") ;
		
	}

	@Override
	public void turnOff() {
		System.out.println("Projector turn off") ;
		
	}

}
