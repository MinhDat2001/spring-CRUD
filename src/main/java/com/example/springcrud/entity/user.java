package com.example.springcrud.entity;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Data
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String dob;
    @Column(nullable = false)
    String address;
}
