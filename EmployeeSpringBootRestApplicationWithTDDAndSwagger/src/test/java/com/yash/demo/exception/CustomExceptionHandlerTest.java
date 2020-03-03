package com.yash.demo.exception;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yash.demo.controller.EmployeeController;
import com.yash.demo.model.Employee;
import com.yash.demo.service.EmployeeService;
import static org.mockito.Matchers.anyLong;


//@RunWith(SpringRunner.class)
//public class CustomExceptionHandlerTest {
//
//	
//	private MockMvc mockMvc;
//
//	@Mock
//	EmployeeController empControllerMock;
//	
//    @Mock
//    EmployeeService empServiceMock;
//
//    @Before 
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        mockMvc = MockMvcBuilders.standaloneSetup(empServiceMock).setControllerAdvice(new CustomExceptionHandler())
//            .build();
//    }
// 
//    //@Test//(groups = { "services" })
//    public void testGlobalExceptionHandlerError() throws Exception {
// 
//    	System.out.println("================CustomExceptionHandlerTest.testGlobalExceptionHandlerError()");
//    	//Employee emp = empServiceMock.findOne(1000L);
//    	when(empServiceMock.findOne(1000L)).thenThrow(RecordNotFoundException.class);
//    	//System.out.println("=========emp=="+emp+"CustomExceptionHandlerTest.testGlobalExceptionHandlerError()");
//		mockMvc.perform(delete("/company/employees/1000")).andExpect(MockMvcResultMatchers.status().isOk()).andDo(print());
//   
//    }
//
//}
