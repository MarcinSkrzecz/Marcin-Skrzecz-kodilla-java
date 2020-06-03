package com.kodilla.good.patterns.shop_13_2;

public class User {
    private String name;
    private String surname;
    private String email;
    private String address;
    private String phone;

    protected User(String name, String surname, String email, String address, String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
