/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapKeThua;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Student extends Person{
    private String StudentID;
    private int academic_year;
    private float gpa;
    private float soicialActivities;

    public Student() {
        super();
    }

    public Student(String StudentID, int academic_year, float gpa, float soicialActivities) {
        this.StudentID = StudentID;
        this.academic_year = academic_year;
        this.gpa = gpa;
        this.soicialActivities = soicialActivities;
    }

    public Student(String StudentID, int academic_year, float gpa, float soicialActivities, String name, char gender, int birth_year) {
        super(name, gender, birth_year);
        this.StudentID = StudentID;
        this.academic_year = academic_year;
        this.gpa = gpa;
        this.soicialActivities = soicialActivities;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getSoicialActivities() {
        return soicialActivities;
    }

    public void setSoicialActivities(float soicialActivities) {
        this.soicialActivities = soicialActivities;
    }

   @Override
    public String toString() {
	return "Student: studentID: " + StudentID + ", academicYear: " + academic_year + ", gpa: " + gpa + ", soicialActivities: " + soicialActivities + ", name: " + name + ", gender: " + gender + ", birthYear: " + birth_year;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
	if(this.getGpa() > o.getGpa()) {
            return 1;
	}
	else if(this.getGpa() == o.getGpa()) {
            if(this.getSoicialActivities() > o.getSoicialActivities()) {
		return 1;
            }
            else if(this.getSoicialActivities() == o.getSoicialActivities()) {
		return 0;
            }
            else {
                return -1;
            }
	}
		
        return -1;
    }

    public void setInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		this.setName(sc.nextLine());

		System.out.print("Nhap ma sinh vien: ");
		this.setStudentID(sc.nextLine());
		
		System.out.print("Nhap nam sinh: ");
		this.setBirth_year(sc.nextInt());
		
		System.out.print("Nhap gioi tinh: ");
		this.setGender(sc.next().charAt(0));
		
		System.out.print("Nhap nam nhap hoc: ");
		this.setAcademic_year(sc.nextInt());
		
		System.out.print("Nhap gpa: ");
		this.setGpa(sc.nextFloat());
		
		System.out.print("Nhap soicialActivities: ");
		this.setSoicialActivities(sc.nextFloat());
}

   
    
}
