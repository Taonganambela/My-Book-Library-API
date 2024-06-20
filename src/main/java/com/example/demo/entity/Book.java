package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "My book library")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String author;
    private String book;
    private String number;
}
