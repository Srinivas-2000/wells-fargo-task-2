package com.yourproject.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer_order") // 'order' is a reserved keyword
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    // Default constructor
    public Order() {}

    // Constructor
    public Order(Date orderDate, Customer customer, Product product) {
        this.orderDate = orderDate;
        this.customer = customer;
        this.product = product;
    }

    // Getters
    public Long getId() { return id; }
    public Date getOrderDate() { return orderDate; }
    public Customer getCustomer() { return customer; }
    public Product getProduct() { return product; }

    // Setters
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public void setProduct(Product product) { this.product = product; }
}
