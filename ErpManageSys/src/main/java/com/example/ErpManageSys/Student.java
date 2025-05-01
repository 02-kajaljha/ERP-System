package com.example.ErpManageSys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Student {

	@Id
	int id;
	
	String name;
	String fathersname;
	String mothersname;
	String dob;
	String college;
	String course;
	String year;
	String branch;
	String section;
	String rollno;
	String highschool;
	String intermediate;
	
	public Student(int id, String name, String fathersname, String mothersname, String dob, String college,
			String course, String year, String branch, String section, String rollno, String highschool,
			String intermediate) {
		super();
		this.id = id;
		this.name = name;
		this.fathersname = fathersname;
		this.mothersname = mothersname;
		this.dob = dob;
		this.college = college;
		this.course = course;
		this.year = year;
		this.branch = branch;
		this.section = section;
		this.rollno = rollno;
		this.highschool = highschool;
		this.intermediate = intermediate;
	}
	
	public Student() {
	    
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

	public String getFathersname() {
		return fathersname;
	}

	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}

	public String getMothersname() {
		return mothersname;
	}

	public void setMothersname(String mothersname) {
		this.mothersname = mothersname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getHighschool() {
		return highschool;
	}

	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}

	public String getIntermediate() {
		return intermediate;
	}

	public void setIntermediate(String intermediate) {
		this.intermediate = intermediate;
	}
	
}
