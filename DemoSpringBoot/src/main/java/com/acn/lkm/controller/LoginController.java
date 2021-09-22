package com.acn.lkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.acn.lkm.bean.Employee;
import com.acn.lkm.dao.EmployeeDao;


@RestController
public class LoginController {
	
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping(value="employee/getAllEmpoyee", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getALLEmployee() {
		List<Employee> list=dao.getAllEmployee();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
}
