package com.samprit.practice;

import java.util.Date;

public class Student {



	private String name;

	private Double salary;

	private Date joiningDate;


	private String gender;



	public Student() {

	}





	public Student(String name, Double salary, Date joiningDate, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.gender = gender;
	}









	public String getName() {
		return name;
	}









	public void setName(String name) {
		this.name = name;
	}









	public Double getSalary() {
		return salary;
	}









	public void setSalary(Double salary) {
		this.salary = salary;
	}









	public Date getJoiningDate() {
		return joiningDate;
	}









	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}









	public String getGender() {
		return gender;
	}









	public void setGender(String gender) {
		this.gender = gender;
	}









	@Override
	public String toString() {
		return "Student [name=" + name + ", salary=" + salary + ", joiningDate=" + joiningDate + ", gender=" + gender
				+ "]";
	}







}


package com.samprit.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Stream {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");

		Date joiningDateRam= dateformat.parse("01-01-2000");
		Date joiningDateSam= dateformat.parse("04-07-2020");
		Date joiningDateJadu= dateformat.parse("21-06-2010");
		Date joiningDateMadhu= dateformat.parse("06-11-1990");
		Date joiningDateSana= dateformat.parse("26-04-2021");
		Date joiningDateKunal= dateformat.parse("05-01-2000");
		Date joiningDateRahim= dateformat.parse("01-08-2017");

		List<Student> students = new ArrayList<>();

		students.add(new Student("Ram",40000.70,joiningDateRam,"M"));
		students.add(new Student("Sam",40000.50,joiningDateSam,"F"));
		students.add(new Student("Jadu",40350.80,joiningDateJadu,"M"));
		students.add(new Student("Madhu",40000.20,joiningDateMadhu,"F"));
		students.add(new Student("Sana",70000.75,joiningDateSana,"F"));
		students.add(new Student("Kunal",40650.24,joiningDateKunal,"M"));
		students.add(new Student("Rahim",96200.18,joiningDateRahim,"M"));



	    Student maxSalaryStudent=students.stream()
	                                              .max((a,b)-> Double.compare(a.getSalary(),b.getSalary()))
	                                              .get();

        System.out.println(maxSalaryStudent);

	}

}


