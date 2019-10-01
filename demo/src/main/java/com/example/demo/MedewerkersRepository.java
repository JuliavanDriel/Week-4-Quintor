package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MedewerkersRepository extends CrudRepository<Medewerkers,Long> {

}

