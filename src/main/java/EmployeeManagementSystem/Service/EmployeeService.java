package EmployeeManagementSystem.Service;


import java.util.List;

import EmployeeManagementSystem.Model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);

}
