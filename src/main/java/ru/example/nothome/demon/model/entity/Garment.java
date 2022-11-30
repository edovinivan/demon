package ru.example.nothome.demon.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "garment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Garment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Article;
    private String name;
    private String textsite;
}
