package com.lcwd.orm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jpa-studenthai")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentid;
    private String name;
    private String about;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptops laptop;


    //here we will do each student has many addrss
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address> addressList=new ArrayList<>();

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", laptop=" + laptop +
                '}';
    }

    public Student() {
    }

    public Student(int studentid, String name, String about, Laptops laptop) {
        this.studentid = studentid;
        this.name = name;
        this.about = about;
        this.laptop = laptop;
    }




    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptops getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptops laptop) {
        this.laptop = laptop;
    }
}