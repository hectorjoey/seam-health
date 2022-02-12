package com.example.publisher.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "topic")
@Data
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String msg;
}
