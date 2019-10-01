package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("M")
@Table(name = "Medewerkers")
public class Medewerkers extends Model{
    @Column(name = "Functie")
    public String Functie;

    @OneToMany(mappedBy = "manager")
    private List<Account> accounts;

}
