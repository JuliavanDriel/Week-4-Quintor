package com.example.demo;

import org.hibernate.Session;

import javax.persistence.TypedQuery;
import java.util.List;

public class Query {
    private Session  em;

    public List<Medewerkers> OneOrMore()

    {
        TypedQuery<Medewerkers> q = em.createQuery("SELECT manager FROM Account a  WHERE a.holder HAVING COUNT(Klanten.accounts) >= 3", Medewerkers.class);

        List<Medewerkers> t = q.getResultList();
        return t;
    }
}
