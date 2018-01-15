package s_principle.domain.dao;

import s_principle.db.DataBaseConnectionManager;
import s_principle.domain.Employee;

public class EmployeeDAO {


	
	public void saveEmployee(Employee employee) {
		DataBaseConnectionManager connectionManager = DataBaseConnectionManager.getManagerInstance();
		connectionManager.connect();
		System.out.println("Saving " + employee);
		connectionManager.disConnect();
	}
	
	public void deleteEmployee(Employee employee) {
		DataBaseConnectionManager connectionManager = DataBaseConnectionManager.getManagerInstance();
		connectionManager.connect();
		System.out.println("Deleting " + employee);
		connectionManager.disConnect();
	}
}
