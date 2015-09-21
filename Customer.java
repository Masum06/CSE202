package com.company;


public class Customer {
    private String name;
    private String email;
    private char gender;

    public Customer() {
    }
   /*Customer(String name1, String email1, char gender1){
	name = name1;
	email = email1;
	gender = gender1;*/

    public Customer(String name, String email, char gender) {
       // this.name = name;
        setName(name);
        setEmail(email);
        setGender(gender);
    }

/*
    public Customer(String name1) {
        name = name1;
    }*/

    public void setName(String name1) {
        name = name1;
    }

    public void setEmail(String email1) {
        email = email1;
    }

    public void setGender(char gender1) {
        gender = gender1;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void print() {
        System.out.println(name + " (" + gender + ") at " + email);
    }
}