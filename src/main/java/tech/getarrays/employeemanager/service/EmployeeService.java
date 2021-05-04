package tech.getarrays.employeemanager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repository.EmployeRepository;
@Service
public class EmployeeService {

	private final EmployeRepository employeRepository ;
	
	@Autowired
	public EmployeeService (EmployeRepository employeRepository) {
		this.employeRepository=employeRepository;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeRepository.save(employee);
	}
	public List<Employee> findAllEmployee(){
		 return employeRepository.findAll();
	}
	public Employee updateEmployee(Employee employee) {
		return employeRepository.save(employee);
	}
	
	public void deleteEmployee(Long id ) {
		employeRepository.deleteById(id);
	}
	   public Employee findEmployeeById(Long id) {
	        return employeRepository.findEmployeeById(id)
	        		.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	    }
}
