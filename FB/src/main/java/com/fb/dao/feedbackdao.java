package com.fb.dao;

import com.fb.entity.staff;
import com.fb.entity.student;
import com.fb.entity.studentfeedbackentity;

public interface feedbackdao {
public String savefeedback(studentfeedbackentity studentfeedbackentity);
public studentfeedbackentity getfeedback(int id);
public String savecreatestudent(student createstudentEntity);
public student getcreatestudent(int rollno);
public String savestaff(staff staffentity);
public staff getstaffentity(int id);
}
