package com.yash.demo.aspect;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import com.yash.demo.exception.RecordNotFoundException;
import com.yash.demo.model.Employee;
import com.yash.demo.repository.EmployeeRepository;
import com.yash.demo.service.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeLoggingAspectTest {
	
@InjectMocks
private EmployeeService employeeService;

@Mock
private EmployeeRepository employeeRepoMock;
	
	@Test
	public void test() {
		Employee employee= new Employee(1L, "Ekta", "Dev", "JAVA");
		when(employeeRepoMock.findById(employee.getId())).thenReturn(Optional.of(employee));
		
		AspectJProxyFactory proxyFactory = new AspectJProxyFactory(employeeService);
		proxyFactory.addAspect(EmployeeLoggingAspect.class);
		EmployeeService proxy = proxyFactory.getProxy();
		proxy.findOne(employee.getId());
		
	}
	
	@Test(expected = RecordNotFoundException.class)
	public void testthrow() {
		Employee employee= new Employee(1L, "Ekta", "Dev", "JAVA");
		when(employeeRepoMock.findById(employee.getId())).thenThrow(RecordNotFoundException.class);
		
		AspectJProxyFactory proxyFactory = new AspectJProxyFactory(employeeService);
		proxyFactory.addAspect(EmployeeLoggingAspect.class);
		EmployeeService proxy = proxyFactory.getProxy();
		proxy.findOne(employee.getId());
		
	}
	
	@Test
	public void testLogMethod() {
		EmployeeLoggingAspect log = new EmployeeLoggingAspect();
		log.logMethod();
		

	}
	
	
	

}
