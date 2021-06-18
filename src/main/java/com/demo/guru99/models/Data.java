package com.demo.guru99.models;

public class Data {
    private String firstName, lastName, phone, email, address1, city, state, postalCode, userName, password, confirmPassword;


    public Data(String firstName, String lastName, String phone, String email, String address1, String city, String state, String postalCode, String userName, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address1 = address1;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }


}
