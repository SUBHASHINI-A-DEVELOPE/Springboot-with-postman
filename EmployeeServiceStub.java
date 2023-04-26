package com.example.mypkg;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class EmployeeServiceStub {
	private static Map<Long, Employee> employees = new HashMap<>();
	private static Long index = 3L;
	public static Employee getEmployeeDetailsemployeeId;
	
	static {
		Employee employee1 = new Employee(1L, "emp1", "7824988622", 30000L);
		Employee employee2 = new Employee(2L, "emp2", "9442224373", 40000L);
		Employee employee3 = new Employee(3L, "emp3", "9364438622", 50000L);
		
		employees.put(1L, employee1);
		employees.put(2L, employee2);
		employees.put(3L, employee3);
	
	}
	public static List<Employee> getAllEmployees() {
		return new ArrayList<>(employees.values());
	
	}
	public static Employee addEmployee(Employee employee) {
		index += 1;
		employee.setId(index);
		employees.put(index, employee);
        return employee;
	}
    public static Employee updateEmployee(Long employeeId, Employee employee) {
    	employee.setId(employeeId);
    	employees.put(employeeId,  employee);
    	return employee;
    }
    public static Employee deleteEmployee(Long employeeId) {
    	return employees.remove(employeeId);
    }
}
