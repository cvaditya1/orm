package com.test.orm.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
public class Employee {
    @Id
    @Setter
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    @Setter
    @Getter
    private String name;
}
