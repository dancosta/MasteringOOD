package remotecontrol;

public class Television implements RemoteControlable {
	
	private String model;
		
	public Television(String model) {

		this.model = model;
	}

	
	@Override
	public String toString() {
		return "Television [model=" + model + "]";
	}


	@Override
	public void turnOn() {
		System.out.println("Tv turn on") ;
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv turn off") ;
		
	}

}
