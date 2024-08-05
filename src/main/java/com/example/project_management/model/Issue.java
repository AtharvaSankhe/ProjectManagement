package com.example.project_management.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User assignee;

}
