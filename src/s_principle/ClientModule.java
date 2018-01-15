package s_principle;

import s_principle.db.DataBaseConnectionManager;
import s_principle.domain.Employee;
import s_principle.domain.dao.EmployeeDAO;

public class ClientModule {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(01);
		emp1.setName("AAA");
		emp1.setDepartment("Nursery");
		emp1.setWorking(true);
		
		hireNewEmployee(emp1);
	}
	
	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO eDao = new EmployeeDAO();
		eDao.saveEmployee(employee);
	}
}
