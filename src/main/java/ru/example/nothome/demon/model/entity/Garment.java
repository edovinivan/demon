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
    private Long id;

    private String article;
    private String name;

    @Column(name = "textsite", length = 2000)
    private String textsite;
}
