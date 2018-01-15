package o_principle;

public class Nurse extends Employee{

	public Nurse(long iD, String name, String department, boolean isWorking) {
		super(iD, name, department, isWorking);
	}
	
	public void checkVitalSigns() {
		System.out.println("checking vital signs...");
	}
	
	public void drawBlood() {
		System.out.println("drawing blood...");
	}
	
	public void cleanPatientArea() {
		System.out.println("cleaning patient area...");
	}

	@Override
	public void performDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();
		
	}

}
