package com.yash.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="employees")
@EntityListeners(AuditingEntityListener.class)
//@SequenceGenerator(name="seq", initialValue=0, allocationSize=100)

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String designation;
	
	@NotEmpty
	private String expertise;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date createdAt;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "salary_id", referencedColumnName = "salary_id")
	private Salary salary;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id",referencedColumnName = "department_id")
	private Department department;

	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id",referencedColumnName = "employee_id")
    private List<Technology> technologies;	

	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
//	//@JoinColumn(name = "technology_id",referencedColumnName = "employee_id")
//    private List<Technology> technologies;	
	
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public List<Technology> getTechnologies() {
		return technologies;
	}


	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}


	
	public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}


	public Employee() {
	}
	
	
	  public Employee(Long id, @NotEmpty String name, @NotEmpty String
	  designation, @NotEmpty String expertise, Date createdAt) { 
	  super(); 
	  this.id =id;
	  this.name = name;
	  this.designation = designation; 
	  this.expertise = expertise; 
	  this.createdAt = createdAt; 
	  }

	public Long getId() {
		return id;
	}

	public Employee(Long id, @NotEmpty String name, @NotEmpty String designation, @NotEmpty String expertise) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.expertise = expertise;
	}

	
	public Employee(@NotEmpty String name, @NotEmpty String designation, @NotEmpty String expertise) {
		super();
		this.name = name;
		this.designation = designation;
		this.expertise = expertise;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((expertise == null) ? 0 : expertise.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((technologies == null) ? 0 : technologies.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (expertise == null) {
			if (other.expertise != null)
				return false;
		} else if (!expertise.equals(other.expertise))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (technologies == null) {
			if (other.technologies != null)
				return false;
		} else if (!technologies.equals(other.technologies))
			return false;
		return true;
	}

    
	



}
