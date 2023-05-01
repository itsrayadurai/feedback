package com.fb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.fb.dao.*;
import com.fb.daoimp.*;
import com.fb.entity.*;

@Controller
public class feedbackcontroller {
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		System.out.println("User login attempted");
		try {
			if(request.getParameter("user").equals("admin"))
				{
				if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("admin")) 
				{
	            mv.setViewName("admin");
				}
				else
				{
				mv.addObject("message", "Some problem occured during login, Please try after some time.");
				mv.setViewName("dbdemo");
				}
				}
			else if(request.getParameter("user").equals("student"))
			{
			feedbackdao ebd=new feedbackdaoimp();
	        int rollno=Integer.parseInt(request.getParameter("username"));
	        student status = ebd.getcreatestudent(rollno);
			if (request.getParameter("password").equals(status.getPassword()))
			{
	        mv.setViewName("givefeedback");
			}
			else 
			{
			mv.addObject("message", "Some problem occured during login, Please try after some time.");
			mv.setViewName("dbdemo");
			}
			}
			else if(request.getParameter("user").equals("staff"))
			{
			feedbackdao ebd=new feedbackdaoimp();
	        int id=Integer.parseInt(request.getParameter("username"));
	        staff status = ebd.getstaffentity(id);
			if (request.getParameter("password").equals(status.getPass()))
			{
	        mv.setViewName("givefeedback");
			}
			else
			{
			mv.addObject("message", "Some problem occured during login, Please try after some time.");
			mv.setViewName("dbdemo");
			}
			}
			
			}
		    
				catch (Exception ex) {
				mv.addObject("message", "Some problem occured during login, Please try after some time.");
				
	}
			return mv;	
	}
	@RequestMapping("/viewfeedback")
	public ModelAndView viewfeedback(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("viewfeedback");
		return mv;
	}
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("webapp/../../index");
		return mv;
	}
	@RequestMapping("/analysizer")
	public ModelAndView analysizer(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("analysizer");
		return mv;
	}
	@RequestMapping("/giveffedback")
	public ModelAndView giveffedback(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("textfeedbackstd");
		return mv;
	}
	@RequestMapping("/createstudent")
	public ModelAndView createstudent(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("createstudent");
		return mv;
	}
		@RequestMapping("/createstaff")
		public ModelAndView createstaff(HttpServletRequest request, HttpServletResponse response) {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("createstaff");
			return mv;
	}
	@RequestMapping("/giveffedbackstd")
	public ModelAndView giveffedbackstd(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		feedbackdao sfd=new feedbackdaoimp();
		studentfeedbackentity sdf=new studentfeedbackentity();
		String s=request.getParameter("feedback");
		sdf.setFeedback(s);
		String status=sfd.savefeedback(sdf);
		mv.addObject("status",status);
		mv.setViewName("textfeedbackstd");
		return mv;
	}
	@RequestMapping("/seefeedback")
	public ModelAndView seefeedback(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		feedbackdao sfd=new feedbackdaoimp();
		int id=Integer.parseInt(request.getParameter("id"));
		studentfeedbackentity status=sfd.getfeedback(id);
		mv.addObject("feedback",status.getFeedback());
		mv.setViewName("seefeedback");
		return mv;
	}	
	@RequestMapping("/savestudent")
	public ModelAndView savecreatestudent(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		feedbackdao call=new feedbackdaoimp();
		student se= new student();
		int rollno= Integer.parseInt(request.getParameter("rollno"));
		se.setRollno(rollno);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		se.setName(fname+""+lname);
		se.setDept(request.getParameter("dept"));
		long phone= Long.parseLong(request.getParameter("phone"));
		se.setPhone(phone);
		se.setEmail(request.getParameter("email"));
	    se.setPassword(request.getParameter("password"));
	    String dno=request.getParameter("dno");
	    String street=request.getParameter("street");
	    String city=request.getParameter("city");
	    String pincode=request.getParameter("pincode");
	    se.setAddress(dno+" "+street+" "+city+" "+pincode);
	    String status = call.savecreatestudent(se);
	    mv.addObject("status", status);
	    mv.setViewName("createstudent");
		return mv;
		
	}
	@RequestMapping("/savestaff")
	public ModelAndView savestaff(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
        feedbackdao ebd=new feedbackdaoimp();
        staff se=new staff();
		int id=Integer.parseInt(request.getParameter("id"));
		se.setId(id);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		se.setName(fname +" "+lname);
		se.setDept(request.getParameter("dept"));
	    long phone=Long.parseLong(request.getParameter("phone"));
	    se.setPhone(phone);
	    se.setEmail(request.getParameter("email"));
	    se.setPass(request.getParameter("pass"));
	    String dno=request.getParameter("dno");
	    String street=request.getParameter("street");
	    String city=request.getParameter("city");
	    String pincode=request.getParameter("pincode");
	    se.setAddress(dno+" "+street+" "+city+" "+pincode);
	    String status = ebd.savestaff(se);
		mv.addObject("status", status);
		mv.setViewName("createstaff");
		return mv;	
	}
	
	}


