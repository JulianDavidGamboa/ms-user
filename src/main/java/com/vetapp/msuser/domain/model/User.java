package com.vetapp.msuser.domain.model;


public class User {
    private String name;
    private String email;
    private String password;
    private UserRole role;
    private String phone;

    public User() {
    }

    public User(String name, String email, String password, UserRole role, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getRole() {
        return role;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
                + ", phone=" + phone + "]";
    }

}
