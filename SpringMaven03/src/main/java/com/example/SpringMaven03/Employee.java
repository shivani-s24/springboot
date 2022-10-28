package com.example.SpringMaven03;


public class Employee {
    private int Eid;
    private String Fname;
    private String Lname;

    public Employee(int Eid,String Fname,String Lname){
        this.Eid = Eid;
        this.Fname = Fname;
        this.Lname= Lname;

    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        this.Eid = eid;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
       this.Lname = Lname;
    }
}
