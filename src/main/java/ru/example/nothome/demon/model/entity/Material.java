package ru.example.nothome.demon.model.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "material")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Material implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;
    private BigDecimal qty;



}
