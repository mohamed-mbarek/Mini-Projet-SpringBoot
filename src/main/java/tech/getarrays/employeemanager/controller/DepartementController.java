package tech.getarrays.employeemanager.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.getarrays.employeemanager.model.Departement;
import tech.getarrays.employeemanager.service.DepartementService;

@RestController
@RequestMapping("/departement")
public class DepartementController {
 private DepartementService departementService;

 

 public  DepartementController(DepartementService departementService) {
     this.departementService =  departementService; 
 }


@GetMapping("/all")
public ResponseEntity<List<Departement>> getAllEmployees () {
    List<Departement> departements = departementService.findAllDepartements();
    return new ResponseEntity<>(departements, HttpStatus.OK);
}

@GetMapping("/find/{id}")
public ResponseEntity<Departement> getEmployeeById (@PathVariable("id") Long id) {
    Departement departement = (Departement) departementService.findDepartementById(id);
    return new ResponseEntity<Departement>(departement,HttpStatus.OK);
}

@PostMapping("/add")
public ResponseEntity<Departement> addEmployee(@RequestBody Departement departement) {
    Departement newDep = departementService.addDepartement(departement);
    return new ResponseEntity<>(newDep, HttpStatus.CREATED);
}

@PutMapping("/update")
public ResponseEntity<Departement> updateEmployee(@RequestBody Departement departement){
	Departement updateDep = departementService.updateDepartement(departement);
    return new ResponseEntity<>(updateDep, HttpStatus.OK);
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
    departementService.deleteDepartement(id);
    return new ResponseEntity<>(HttpStatus.OK);
}
}
