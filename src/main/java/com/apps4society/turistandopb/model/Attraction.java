package com.apps4society.turistandopb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// PRIMARY KEY
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String city;

    @Column(length = 2, nullable = false)
    private String state;

    @Column(nullable = true)
    private String imagemURL;

    @Column(nullable = true)
    private String latitude;

    @Column(nullable = true)
    private String longitude;

    @Column(nullable = true)
    private String time; 

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Contact contact;

    @Column(nullable = false)
    private String category;


}
