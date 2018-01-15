package d_principle.processes;

public class SmartphoneManufactoringProcess extends GeneralManufactoringProcess{

	public SmartphoneManufactoringProcess(String name) {
		super(name);
		
	}

	@Override
	protected void assambleDevice() {
		System.out.println("assembled smartphone");
		
	}

	@Override
	protected void testDevice() {
		System.out.println("tested smartphone");
		
	}

	@Override
	protected void pakageDevice() {
		System.out.println("pakaged smartphone");
		
	}

	@Override
	protected void storeDevice() {
		System.out.println("stored smartphone");
		
	}
	
	

}
