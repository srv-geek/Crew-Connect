package com.tka.crewconnect.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Employee {

	@Id
	int id;
	private String name;
	private String phoneno;
	private String department;
	private long salary;
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createddtm;

	private String createdby;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateddtm;

	private String updatedby;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "adminid")
	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ccode")
	private Country country;

	public Employee() {

	}

	public Employee(int id, String name, String phoneno, String department, long salary, String status, Date createddtm,
			String createdby, Date updateddtm, String updatedby, User user, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.department = department;
		this.salary = salary;
		this.status = status;
		this.createddtm = createddtm;
		this.createdby = createdby;
		this.updateddtm = updateddtm;
		this.updatedby = updatedby;
		this.user = user;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateddtm() {
		return createddtm;
	}

	public void setCreateddtm(Date createddtm) {
		this.createddtm = createddtm;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getUpdateddtm() {
		return updateddtm;
	}

	public void setUpdateddtm(Date updateddtm) {
		this.updateddtm = updateddtm;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", department=" + department
				+ ", salary=" + salary + ", status=" + status + ", createddtm=" + createddtm + ", createdby="
				+ createdby + ", updateddtm=" + updateddtm + ", updatedby=" + updatedby + ", user=" + user
				+ ", country=" + country + "]";
	}

}
