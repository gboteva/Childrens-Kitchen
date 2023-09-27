package bg.softuni.childrenkitchen.model.service;

import bg.softuni.childrenkitchen.model.entity.enums.CityEnum;
public class UserRegisterServiceModel {
    private String email;

    private String password;

    private String fullName;

    private String phoneNumber;

    private CityEnum city;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CityEnum getCity() {
        return city;
    }

    public void setCity(CityEnum city) {
        this.city = city;
    }
}