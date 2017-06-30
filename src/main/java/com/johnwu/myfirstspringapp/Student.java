package com.johnwu.myfirstspringapp;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student{
	
	
	//for all the annotations error messages, developers could
	//1.create a file under WEB-INF, in this case, studentmessages.properties
	//2.write statement based on the annotation, for example, for @Size annotation
	//developers should write Size.student1.studentHobby = size of {0} should be between {2} and {1}
	//3. register the file created in the servlet-context file by creating a bean
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	@Size(min=2, max=30) @IsValidHobby(listOfValidHobbies="Music|Football|Hockey")
	private String studentHobby;
	@Max(648000000)
	private Long studentMobile;
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private Address studentAddress;
	
	
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
	
}
