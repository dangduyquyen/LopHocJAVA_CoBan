/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapKeThua;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Person implements  Serializable, Cloneable, Comparable<Student> {
    String name;
    char gender;
    int birth_year;

    public Person() {
        super();
    }

    public Person(String name, char gender, int birth_year) {
        super();
        this.name = name;
        this.gender = gender;
        this.birth_year = birth_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", birth_year=" + birth_year + '}';
    }
    
    

    @Override
    public int compareTo(Student o) {
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
