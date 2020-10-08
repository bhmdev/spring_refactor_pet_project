package com.launchacademy.adoptapet.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="pet_types")
@NoArgsConstructor
@Getter
@Setter
public class PetType {
    @Id
    @SequenceGenerator(name="petTypes_generator", sequenceName = "petTypes_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="petTypes_generator")
    @Column(name="id", nullable = false, unique = true)
    private Integer id;


    @Column(name="type", nullable=false)
    private String type;

    @Column(name="description", nullable=false)
    private String description;

    @Column(name=" img_url", nullable=false)
    private String  img_url;

    @OneToMany(mappedBy = "petType")
    @JsonIgnoreProperties("petType")
    private  List<AdoptablePet> adoptablePetsList;

}


