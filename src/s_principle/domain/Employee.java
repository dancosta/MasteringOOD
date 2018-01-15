package s_principle.domain;

public class Employee {
	private long iD;
	private String name;
	private String department;
	private boolean isWorking;
	
	public Employee(long iD) {
		this.iD = iD;
	}

	public Employee(long iD, String name, String department, boolean isWorking) {
		super();
		this.iD = iD;
		this.name = name;
		this.department = department;
		this.isWorking = isWorking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	
	
	@Override
	public String toString() {
		return "Employee [iD=" + iD + ", name=" + name + ", department=" + department + ", isWorking=" + isWorking
				+ "]";
	}
	

}
