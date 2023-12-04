package ru.podol.tr_database.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "costomer")
public class Costomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcostomer;
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    private String number;
    private String adress;
    private int monthexpenses;
}
