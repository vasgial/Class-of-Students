package exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Student {
	
	private String name;
	private String surname;
	private String age;
	private String height;
	private String tuition;
	private String date;
	private String phone;
	private String conduct;
	
	public Student() {}
	
	public Student(String name, String surname, String age, String height, String tuition, String date, String phone,
			String conduct) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.height = height;
		this.tuition = tuition;
		this.date = date;
		this.phone = phone;
		this.conduct = conduct;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getTuition() {
		return tuition;
	}
	public void setTuition(String tuition) {
		this.tuition = tuition;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getConduct() {
		return conduct;
	}
	public void setConduct(String conduct) {
		this.conduct = conduct;
	}
	
	public String toString() {
		return new String("name: " + getName() + " ,surname: " + getSurname() + " ,age: " 
	+ getAge() + " ,height: " + getHeight() + " ,Tuition: " + getTuition() + " ,Date:" 
				+ getDate() + " , Phone:" + getPhone() + " ,Conduct:" + getConduct());
	}
	
	
	
	
	

}
