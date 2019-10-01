package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MedewerkersTests {

    @Autowired
    private MedewerkersRepository medewerkersRepository;

    @Test
    public void setMedewerkersRepository(){
        Medewerkers medewerkers = new Medewerkers();
        medewerkers.setCreationDate(Date.valueOf(LocalDate.now()));
        Medewerkers m = medewerkersRepository.save(medewerkers);

        Long ID = m.getID();
        Optional<Medewerkers> d = medewerkersRepository.findById(ID);
        assertThat(d.isPresent(), is(true));
    }
}


