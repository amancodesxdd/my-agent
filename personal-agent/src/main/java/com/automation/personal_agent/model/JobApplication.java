package com.automation.personal_agent.model;

public class JobApplication {

    private String company;
    private String role;
    private String status;

    public JobApplication(String company, String role, String status) {
        this.company = company;
        this.role = role;
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }
}