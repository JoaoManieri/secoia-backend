package com.manieri.projetosequoia.model;

import java.util.ArrayList;

public class Costumer {

    private String fantasyName;
    private String realName;
    private String cnpj;
    private Boolean simplesNacionalAtivo;
    private String registrationYear;
    private Boolean orderRequest;
    private Boolean companyStatus;
    private String atuationField;
    private String competitiveFactor;
    private ArrayList<CostumerAdress> costumerAdresses;
    private ArrayList<CostumerContacts> costumerContacts;

    public Costumer(String fantasyName,
                    String realName,
                    String cnpj,
                    Boolean simplesNacionalAtivo,
                    String registrationYear,
                    Boolean orderRequest,
                    Boolean companyStatus,
                    String atuationField,
                    String competitiveFactor,
                    ArrayList<CostumerAdress> costumerAdresses,
                    ArrayList<CostumerContacts> costumerContacts) {

        this.fantasyName = fantasyName;
        this.realName = realName;
        this.cnpj = cnpj;
        this.simplesNacionalAtivo = simplesNacionalAtivo;
        this.registrationYear = registrationYear;
        this.orderRequest = orderRequest;
        this.companyStatus = companyStatus;
        this.atuationField = atuationField;
        this.competitiveFactor = competitiveFactor;
        this.costumerAdresses = costumerAdresses;
        this.costumerContacts = costumerContacts;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Boolean getSimplesNacionalAtivo() {
        return simplesNacionalAtivo;
    }

    public void setSimplesNacionalAtivo(Boolean simplesNacionalAtivo) {
        this.simplesNacionalAtivo = simplesNacionalAtivo;
    }

    public String getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(String registrationYear) {
        this.registrationYear = registrationYear;
    }

    public Boolean getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(Boolean orderRequest) {
        this.orderRequest = orderRequest;
    }

    public Boolean getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(Boolean companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getAtuationField() {
        return atuationField;
    }

    public void setAtuationField(String atuationField) {
        this.atuationField = atuationField;
    }

    public String getCompetitiveFactor() {
        return competitiveFactor;
    }

    public void setCompetitiveFactor(String competitiveFactor) {
        this.competitiveFactor = competitiveFactor;
    }

    public ArrayList<CostumerAdress> getCostumerAdresses() {
        return costumerAdresses;
    }

    public void setCostumerAdresses(ArrayList<CostumerAdress> costumerAdresses) {
        this.costumerAdresses = costumerAdresses;
    }

    public ArrayList<CostumerContacts> getCostumerContacts() {
        return costumerContacts;
    }

    public void setCostumerContacts(ArrayList<CostumerContacts> costumerContacts) {
        this.costumerContacts = costumerContacts;
    }
}
