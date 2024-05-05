package com.ty.company_employee_project.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Computer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int computer_id;
	private String model;
	private String brand;
	
	
	
	public int getComputer_id() {
		return computer_id;
	}
	public void setComputer_id(int computer_id) {
		this.computer_id = computer_id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Computer [computer_id=" + computer_id + ", model=" + model + ", brand=" + brand + "]";
	}
	
	
	
	
}
