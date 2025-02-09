package com.tka.crewconnect.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Country {

	@Id
	String ccode;
	String cname;

	@OneToMany(mappedBy = "country")
	private List<Employee> emp;

	public Country() {

	}

	public Country(String ccode, String cname, List<Employee> emp) {
		super();
		this.ccode = ccode;
		this.cname = cname;
		this.emp = emp;
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Country [ccode=" + ccode + ", cname=" + cname + ", emp=" + emp + "]";
	}

}
