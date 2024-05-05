package com.ty.company_employee_project.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.company_employee_project.dao.Company_Employee_Dao;
import com.ty.company_employee_project.dto.Address;
import com.ty.company_employee_project.dto.Company;
import com.ty.company_employee_project.dto.Computer;
import com.ty.company_employee_project.dto.Department;
import com.ty.company_employee_project.dto.Employee;
import com.ty.company_employee_project.dto.Skills;

public class Company_Employee_Controller {

		public static void main(String[] args) {
			
			Company company= new Company();
			company.setCname("TCS");
			company.setEmail("tcs@gmail.com");
			
			Employee employee= new Employee();
			employee.setEmpid(1006);
			employee.setEmpname("Mayur");
			employee.setSal(1200000);
			employee.setAge(24);
			employee.setPhno(18348913481213l);
			
			Computer computer= new Computer();
			computer.setModel("C1200");
			computer.setBrand("Asus");
			
			Address address= new Address();
			address.setPincode(421301);
			address.setPlace("Thane");
			address.setPhno(815648789478l);
			
			Department department= new Department();
			department.setDept_name("IT");
			department.setPhno(9654654564l);
			
			Department department2= new Department();
			department2.setDept_name("DataScience");
			department2.setPhno(9654654564l);

			
			Skills skills= new Skills();
			skills.setName("JAVA");
			
			Skills skills1= new Skills();
			skills1.setName("J2EE");
			
			Skills skills2= new Skills();
			skills2.setName("SQL");
			
			
			List<Employee> employees= new ArrayList<Employee>();
			employees.add(employee);
//			employees.add(employee1);
			
			List<Department> depts= new ArrayList<Department>();
			depts.add(department);
			depts.add(department2);
			
			List<Skills> listofskills= new ArrayList<Skills>();
			listofskills.add(skills);
			listofskills.add(skills1);
			listofskills.add(skills2);
			
			
			employee.setDepartment(depts);
			employee.setSkills(listofskills);
			employee.setCompany(company);
			employee.setComputer(computer);
			
//			employee1.setDepartment(depts);
//			employee1.setSkills(listofskills);
//			employee1.setComputer(computer);
			
			
			company.setAddress(address);
			company.setEmployees(employees);
			
			Company_Employee_Dao dao= new Company_Employee_Dao();
//			dao.saveCompany(company);
//			dao.saveEmployee(employee);
			dao.updateEmployee(employee);
//			dao.removeEmployee(101);
//			dao.removeEmployee(company, 102);
//			dao.findAll();
//			dao.findEmployee(102);
//			dao.findCompany(101);
			
			
			
			
			
		}
}
