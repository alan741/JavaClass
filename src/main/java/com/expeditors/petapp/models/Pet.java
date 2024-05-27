package com.expeditors.petapp.models;

import com.expeditors.petapp.types.BreedType;
import com.expeditors.petapp.types.PetType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString(exclude="adopter")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="adopterid", nullable=false)
    @Getter(AccessLevel.NONE)
    private Adopter adopter;

    @Column(name = "adoptiondate")
    private LocalDate adoptionDate;

    @Column(name = "pettypeid")
    @Enumerated
    private PetType petTypeId;

    @Column(name = "breedtypeid")
    @Enumerated
    private BreedType breedType;

    @NotNull
    @NotEmpty
    private String name;
}
