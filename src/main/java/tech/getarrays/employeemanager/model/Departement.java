package tech.getarrays.employeemanager.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Departement {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(nullable = false, updatable = false)
	    private Long id;
	    private String nameDep;
	    private String descDepartement ;
	    private String picDep ;
		@OneToMany(mappedBy = "dep")
		@JsonIgnore
		private List<Employee> employees;
}
