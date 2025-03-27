package com.yourproject.entities;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private Double price;

    // Default constructor
    public Product() {}

    // Constructor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public Double getPrice() { return price; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setPrice(Double price) { this.price = price; }
}
