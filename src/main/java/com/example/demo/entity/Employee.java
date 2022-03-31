package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "employee")
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id ;
    @Column(name = "first_name" , nullable = false)
    private String firstName;
    @Column (name = "last_name" , nullable = false)
    private String lastName;
    @Column(name = "email", nullable = true)
    private String email;

}
