package com.fb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class studentfeedbackentity {
     @Id
     @GeneratedValue(strategy =GenerationType.IDENTITY)  
     private int id;
     @Column
     private String feedback;
     @OneToOne
     private student rollno;
     
     public student getRollno() {
		return rollno;
	}

	public void setRollno(student rollno) {
		this.rollno = rollno;
	}

	public int getId() {
		return id;
     }
 
		public void setId(int id) {
		this.id = id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
     @Override
     public String toString() {
    	 return "studentfeedbackentity [id ="+id+"feedback"+feedback+"student"+rollno+"]";    	 
     }
	public studentfeedbackentity(int id, String feedback, student rollno, staff ids) {
		super();
		this.id = id;
		this.feedback = feedback;
	}
	public studentfeedbackentity(int id, String feedback, student rollno) {
		super();
		this.id = id;
		this.feedback = feedback;
		this.rollno = rollno;
	}

	public studentfeedbackentity() {
		super();
	}
}
