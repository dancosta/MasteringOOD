package d_principle.processes;

public abstract class GeneralManufactoringProcess {
	
	private String name;
	
	
	public GeneralManufactoringProcess(String name) {
		this.name = name;
	}
	
	protected abstract void assambleDevice();
	protected abstract void testDevice();
	protected abstract void pakageDevice();
	protected abstract void storeDevice();
	
	public void launchProcess() {
		assambleDevice();
		testDevice();
		pakageDevice();
		storeDevice();
	}
}
