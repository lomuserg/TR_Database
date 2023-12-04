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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idorder;
    private Long idproduct;
    private Long idcostomer ;
    private String orderstate;
    @Temporal(TemporalType.DATE)
    private Date deliverydate;
    private double price;

}
