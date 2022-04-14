package EmployeeManagementSystem.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EmployeeManagementSystem.Model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
