package com.fb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name = "studenttable")
	public class student {
		
		@Id
	    private int rollno;
	    @Column (name = "name")
	    private String name;
	    @Column (name = "dept")
	    private String dept;
	    @Column (name = "phone")
	    private long phone;
	    @Column (name = "email")
	    private String email;
	    @Column (name = "password")
	    private String password;
	    @Column (name = "address")
	    private String address; 
	    
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString()
		{
			return "student{rollno="+rollno +  ", name=" + name + 
					   ", dept=" + dept + ", phone=" + phone + ", email=" + email + 
					   ", password=" + password + ", address=" + address + "]";
		}
		
		public student(int rollno, String name, String dept, long phone, String email, String password, String address) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.dept = dept;
			this.phone = phone;
			this.email = email;
			this.password = password;
			this.address = address;
		}
		
		public student() {
			super();
			// TODO Auto-generated constructor stub
		}
	    

}
