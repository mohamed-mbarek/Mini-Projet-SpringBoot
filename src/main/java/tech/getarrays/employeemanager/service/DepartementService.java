package tech.getarrays.employeemanager.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Departement;
import tech.getarrays.employeemanager.repository.DepartementRepository;
@Service
public class DepartementService {

private final DepartementRepository departementRepository ;
	
	@Autowired
	public DepartementService(DepartementRepository departementRepository) {
		this.departementRepository = departementRepository;
	}
	

	public Departement addDepartement(Departement departement) {
		return departementRepository.save(departement);
	}
	
	public List<Departement> findAllDepartements(){
		return departementRepository.findAll();
	}
	
	public Departement updateDepartement(Departement departement) {
		return departementRepository.save(departement);
	}
	public void deleteDepartement(Long id) {
		departementRepository.deleteById(id);
	}
	public Departement findDepartementById(Long id) {
		return  (Departement) departementRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));

	}
	 }
