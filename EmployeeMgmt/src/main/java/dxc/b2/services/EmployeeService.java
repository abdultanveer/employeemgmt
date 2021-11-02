package dxc.b2.services;
import java.util.List;

import dxc.b2.model.Employee;



public interface EmployeeService {
	
	List < Employee > getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	
}