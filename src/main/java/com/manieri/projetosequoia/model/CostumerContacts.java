package com.manieri.projetosequoia.model;

import javafx.scene.control.TextField;

public class CostumerContacts {

    private String name;
    private String role;
    private Boolean active;
    private String phone;
    private String cellPhone;
    private String email;
    private String whatsapp;

    public CostumerContacts(String name, String role, Boolean active, String phone, String cellPhone, String email, String whatsapp) {
        this.name = name;
        this.role = role;
        this.active = active;
        this.phone = phone;
        this.cellPhone = cellPhone;
        this.email = email;
        this.whatsapp = whatsapp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}
