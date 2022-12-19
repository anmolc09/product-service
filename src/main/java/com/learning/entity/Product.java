package com.learning.entity;

import javax.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products" )
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "stock_keeping_unit",nullable = false, unique = true)
    private String sku;
    @Column(nullable = false)
    private String name;
    private String description;
    private Double price;
    @CreationTimestamp
    private LocalDateTime dateTime;
    @UpdateTimestamp
    private LocalDateTime lastUpdated;
}
