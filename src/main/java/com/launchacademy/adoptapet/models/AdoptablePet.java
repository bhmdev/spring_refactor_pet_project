package com.launchacademy.adoptapet.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="adoptable_pets")
@NoArgsConstructor
@Getter
@Setter
public class AdoptablePet {
    @Id
    @SequenceGenerator(name="adoptable_pets_generator", sequenceName = "adoptable_pets_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="adoptable_pets_generator")
    @Column(name="id", nullable = false, unique = true)
    private Integer id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name=" img_url", nullable=false)
    private String  img_url;

    @Column(name=" age", nullable=false)
    private Integer  age;

    @Column(name="vaccination_status", nullable=false)
    private Boolean vaccination_status;

    @Column(name="adoption_story", nullable=false)
    private String  adoption_story;

    @Column(name="  adoption_status ", nullable=false)
    private String  adoption_status ;

    @ManyToOne
    @JoinColumn(name="type_id", nullable = false)
    @JsonIgnoreProperties("adoptablePetsList")
    private PetType petType;
}

