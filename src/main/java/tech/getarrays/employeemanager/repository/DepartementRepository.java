package tech.getarrays.employeemanager.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.model.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long>{

    Optional<Departement> findDepartementById(Long id);

	

}
