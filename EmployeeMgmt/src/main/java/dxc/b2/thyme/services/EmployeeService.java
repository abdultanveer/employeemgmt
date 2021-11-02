package dxc.b2.thyme.services;
import java.util.List;

import dxc.b2.thyme.model.Employee;



public interface EmployeeService {
	
	List < Employee > getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	
}