package com.ty.company_employee_project.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int a_id;
		private int pincode;
		private long phno;
		private String place;
		public int getA_id() {
			return a_id;
		}
		public void setA_id(int a_id) {
			this.a_id = a_id;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		@Override
		public String toString() {
			return "Address [a_id=" + a_id + ", pincode=" + pincode + ", phno=" + phno + ", place=" + place + "]";
		}
		
		
}
