package com.launchacademy.adoptapet.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="petTypes")
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

}


