package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;
    @Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
	private Date dateEmbauche;
    @ManyToOne
	private Departement dep;

   
}