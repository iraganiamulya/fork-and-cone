package com.example.entities;

import javax.persistence.*;

@Entity
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "financial_advisor_id", nullable = false)
    private FinancialAdvisor financialAdvisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;

    public Client() {}

    public Client(String name, String email, String phoneNumber, FinancialAdvisor financialAdvisor) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.financialAdvisor = financialAdvisor;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public FinancialAdvisor getFinancialAdvisor() { return financialAdvisor; }
}
