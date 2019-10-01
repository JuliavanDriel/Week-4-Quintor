package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("K")
@Table(name = "Klanten")
public class Klanten extends Model{
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "Klantennummer")
    public String klantennummer;

    @Column(name = "Gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "holder")
    private List<Account> accounts;
}
