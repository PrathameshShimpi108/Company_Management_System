package com.ty.company_employee_project.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;





@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", email=" + email + ", employees=" + employees
				+ ", address=" + address + "]";
	}

	private String cname;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
	private List<Employee> employees;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
