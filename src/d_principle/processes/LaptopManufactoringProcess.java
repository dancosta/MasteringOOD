package d_principle.processes;

public class LaptopManufactoringProcess extends GeneralManufactoringProcess {

	public LaptopManufactoringProcess(String name) {
		super(name);
		
	}

	@Override
	protected void assambleDevice() {
		System.out.println("assembled laptop");
		
	}

	@Override
	protected void testDevice() {
		System.out.println("tested laptop");
		
	}

	@Override
	protected void pakageDevice() {
		System.out.println("pakaged laptop");
		
	}

	@Override
	protected void storeDevice() {
		System.out.println("stored laptop");
		
	}

}
