package tech.getarrays.employeemanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.model.Employee;

public interface EmployeRepository  extends JpaRepository<Employee, Long>{

    Optional<Employee> findEmployeeById(Long id);

}
