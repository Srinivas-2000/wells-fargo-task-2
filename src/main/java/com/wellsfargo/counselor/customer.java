package com.yourproject.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;

    // Default constructor
    public Customer() {}

    // Constructor
    public Customer(String name, String email, List<Order> orders) {
        this.name = name;
        this.email = email;
        this.orders = orders;
    }

    // Getters (no setter for ID)
    public Long getId() { return id; }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<Order> getOrders() { return orders; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setOrders(List<Order> orders) { this.orders = orders; }
}
