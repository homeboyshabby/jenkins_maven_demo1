package com.example.demo.pojos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Date;

public class Details {

    private int id;
    private String name;
    private String address;
    private String pan;
    private String dob;

    public Details() {
        System.out.println("com.app.pojos.Details.<init>()");
    }

    public Details(int id, String name, String address, String pan, String dob) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.pan = pan;
        this.dob = dob;
    }

    public Details(String name, String address, String pan, String dob) {
        this.name = name;
        this.address = address;
        this.pan = pan;
        this.dob = dob;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public String getPan() {
        return pan;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Details{" + "id=" + id + ", name=" + name + ", address=" + address + ", pan=" + pan + ", dob=" + dob + '}';
    }

    

}
