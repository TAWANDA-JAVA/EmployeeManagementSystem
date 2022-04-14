package EmployeeManagementSystem.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private long id;
	
	@Column(name = "full_name")
	private String fullname;
	
	private String department;
	
	private String position;
	
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee(long id, String fullname, String department, String position, String email) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.department = department;
		this.position = position;
		this.email = email;
	}

	public Employee() {
		super();
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", department=" + department + ", position=" + position
				+  ", email=" + email + "]";
	}

}
