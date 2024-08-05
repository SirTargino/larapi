package com.laratelie.larapi.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "order")
public class Order {

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 70, nullable = false)
    private String client;

    @Column(nullable = false)
    private String description;

    @Column(length = 15, nullable = false)
    private String phone;

    @Column(nullable = false)
    private LocalDateTime deadline;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Getters and Setters


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
