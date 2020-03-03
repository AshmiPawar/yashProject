package com.yash.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.demo.exception.RecordNotFoundException;
import com.yash.demo.model.*;
import com.yash.demo.service.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(value = "EmployeeController", description = "REST APIs related to Employee Entity!!!!")
@RestController
@RequestMapping("/company")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
 
	/* to save an employee */
	 @ApiOperation(value = "Post specific Employee in the System ", response = Employee.class, tags = "postEmployee")

	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		return employeeService.save(emp);
	}

	/* get all employees */
	@ApiOperation(value = "Get list of Employee in the System ", response = Iterable.class, tags = "getEmployee")

	@ApiResponses(value = {
			@ApiResponse(code = 200 ,message = "Success|Ok"),
			@ApiResponse(code = 401, message = "not authorized!"),
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!")
		
	})
	
	@GetMapping(path = "/employees", produces = { "application/xml", "application/json" })
	public List<Employee> getAllEmployees() {

		return employeeService.findAll();
	}
 
	/* get employee by empid */
	 @ApiOperation(value = "Get specific Employee in the System ", response = Employee.class, tags = "getEmployee")
	
	@GetMapping(path ="/employees/{id}",produces = { "application/xml", "application/json" })
	public Resource<Employee> getEmployeeById(@PathVariable(value = "id") Long empid) throws RecordNotFoundException {

		Resource<Employee> resource = new Resource<Employee>(employeeService.findOne(empid));

		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllEmployees());
		ControllerLinkBuilder linkToo = linkTo(methodOn(this.getClass()).deleteEmployee(empid));

		resource.add(linkTo.withRel("all Emp"));
		resource.add(linkToo.withRel("delete emp"));

		if (resource.hasLinks()) {
			return resource;

		}
		else
			return null;

	}

	/* update an employee by empid */
	
	 @ApiOperation(value = "Put specific Employee in the System ", response = Employee.class, tags = "putEmployee")
		
	 @PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long empid,
			@Valid @RequestBody Employee empDetails) {

		Employee emp = employeeService.findOne(empid);
		if (emp == null) {
			return ResponseEntity.notFound().build();
		}

		emp.setName(empDetails.getName());
		emp.setDesignation(empDetails.getDesignation());
		emp.setExpertise(empDetails.getExpertise());

		Employee updateEmployee = employeeService.save(emp);

		return ResponseEntity.ok().body(updateEmployee);

	}

	/* Delete an employee */
	
	 @ApiOperation(value = "Delete specific Employee in the System ", response = Employee.class, tags = "deleteEmployee")
		
	 @DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value = "id") Long empid) {
 
		Employee emp = employeeService.findOne(empid);
		if (emp == null) {
            //throw new RecordNotFoundException("No Record Found");
			return ResponseEntity.notFound().build();
		}

		employeeService.delete(emp); 

		return ResponseEntity.ok().build();

	}

}
