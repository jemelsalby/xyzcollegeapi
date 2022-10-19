package com.nestdigital.xyzbackendapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int rollno;
    private int adno;
    private String college;
    private String dept;
    private String blood;
    private String dob;
    private String pname;
    private String email;
    private String gname;
    private String gaddress;

    public StudentModel(int id, String name, int rollno, int adno, String college, String dept, String blood, String dob, String pname, String email, String gname, String gaddress) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.adno = adno;
        this.college = college;
        this.dept = dept;
        this.blood = blood;
        this.dob = dob;
        this.pname = pname;
        this.email = email;
        this.gname = gname;
        this.gaddress = gaddress;
    }

    public StudentModel() {
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

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAdno() {
        return adno;
    }

    public void setAdno(int adno) {
        this.adno = adno;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress;
    }
}
