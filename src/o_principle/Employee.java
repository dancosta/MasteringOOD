package o_principle;

abstract public class Employee {
	private long iD;
	private String name;
	private String department;
	private boolean isWorking;
	

	public Employee(long iD, String name, String department, boolean isWorking) {
		super();
		this.iD = iD;
		this.name = name;
		this.department = department;
		this.isWorking = isWorking;
	}

	
	
	@Override
	public String toString() {
		return "Employee [iD=" + iD + ", name=" + name + ", department=" + department + ", isWorking=" + isWorking
				+ "]";
	}
	
	public abstract void performDuties();

}
