package ru.podol.tr_database.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idemployee;
    private String jobtitle;
    private String personaldata;
    private double experience;
    private String education;
    private int salary;
}
