package com.lcwd.orm.entities;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_laptophai")
public class Laptops {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int laptop_id;
    private String model;
    @OneToOne
    @JoinColumn(name="student_id")
    private Student student;
    public Laptops() {
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "laptop_id=" + laptop_id +
                ", model='" + model + '\'' +
                ", student=" + student +
                '}';
    }

    public Laptops(int laptop_id, String model, Student student) {
        this.laptop_id = laptop_id;
        this.model = model;
        this.student = student;
    }

    public int getLaptop_id() {
        return laptop_id;
    }

    public void setLaptop_id(int laptop_id) {
        this.laptop_id = laptop_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }




}