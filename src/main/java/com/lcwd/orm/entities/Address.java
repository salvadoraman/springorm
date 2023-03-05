package com.lcwd.orm.entities;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_address")
public class Address {
    @Id
    private int addressid;
    private String city;
    private String country;
    private String state;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //each many address has one student
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    public Address(int address_id, String city, String country, String state) {
        this.addressid = addressid;
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public int getAddress_id() {
        return addressid;
    }

    public void setAddress_id(int address_id) {
        this.addressid = address_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + addressid +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
