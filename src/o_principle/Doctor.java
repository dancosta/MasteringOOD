package o_principle;

public class Doctor extends Employee {

	public Doctor(long iD, String name, String department, boolean isWorking) {
		super(iD, name, department, isWorking);
	}
	
	public void prescribeMedicine() {
		System.out.println("precribing medicine...");
	}
	
	public void diagnosePatients() {
		System.out.println("diagnosing patients...");
	}

	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatients();
		
	}
	

}
