package com.qa.opencart.pojo;

public class RegisterUser {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String subscribe;

    public RegisterUser(String firstName, String lastName, String email, String telephone, String password, String subscribe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.subscribe = subscribe;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public String getPassword() { return password; }
    public String getSubscribe() { return subscribe; }
}