package com.usa.retog35.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Gamas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idGama;
    @Column(length = 45)
    private String name;
    @Column(length = 250)
    private String description;

    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "gama")
    @JsonIgnoreProperties({"gama"})
    private List<CarModel> cars;

}
