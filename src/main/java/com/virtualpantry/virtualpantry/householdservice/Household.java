package com.virtualpantry.virtualpantry.householdservice;

import jakarta.persistence.*;

public class Household {

    @SequenceGenerator(
            name = "household_sequence",
            sequenceName = "household_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "household_sequence"
    )
    private Long id;
    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey())
}
