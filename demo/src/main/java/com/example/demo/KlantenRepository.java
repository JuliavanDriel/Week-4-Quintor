package com.example.demo;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlantenRepository extends CrudRepository<Klanten,Long> {
}


