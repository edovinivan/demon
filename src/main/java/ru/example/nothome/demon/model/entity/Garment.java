package ru.example.nothome.demon.model.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import ru.example.nothome.demon.listeners.GarmentListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
//@EntityListeners(GarmentListener.class)
@Table(name = "garment")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Garment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String article;

    private String name;

    @Column(name = "textsite", length = 2000)
    private String textsite;

    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JoinColumn(name="garment_id", nullable=false)
    private List<Material> material;

    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JoinColumn(name="operation_id", nullable=false)
    private List<Operation> operation;

}
