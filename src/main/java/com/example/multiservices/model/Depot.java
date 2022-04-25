package com.example.multiservices.model;

import javax.persistence.*;

public class Depot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Account account;
    @Column(nullable = true, length = 255)
    private TypeDepot typeDepot;
    @Column(nullable = true, length = 255)
    private Wallet wallet;
    private int amount;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;



}
