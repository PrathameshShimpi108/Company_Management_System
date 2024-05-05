package com.ty.company_employee_project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.company_employee_project.dto.Company;
import com.ty.company_employee_project.dto.Employee;
import com.ty.company_employee_project.dto.Skills;

public class Company_Employee_Dao {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("developer");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public void saveCompany(Company company)
	{
			entityTransaction.begin();
			entityManager.persist(company);
			entityTransaction.commit();
	}
	public void saveEmployee(Employee employee)
	{
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	public void updateEmployee(Employee employee)
	{
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
	}
	
	
	public void saveSkills(List<Skills> skills)
	{
		entityTransaction.begin();
		entityManager.persist(skills);
		entityTransaction.commit();
	}
	
	public void removeEmployee(Company company, int empid)
	{
		Employee employee=entityManager.find(Employee.class, empid);
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
	}
	
	public void findAll() {
		Query query=entityManager.createQuery("select c from Company c");
		List<Company> list=query.getResultList();
		
		for(Company company : list) {
			System.out.println(company);
		}
	}
	
	public void findEmployee(int empid)
	{
		Employee employee= entityManager.find(Employee.class, empid);
		System.out.println(employee);
	}
	
	public void findCompany(int cid)
	{
		Company company= entityManager.find(Company.class, cid);
		System.out.println(company);
	}
	
}
