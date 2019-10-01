package com.example.demo;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.sql.Date;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class KlantenTests {
    @Autowired
    private KlantenRepository klantenRepository;

    @Test
    public void setKlantenRepository(){
        Klanten klanten = new Klanten();
        klanten.setCreationDate(Date.valueOf(LocalDate.now()));
        Klanten s = klantenRepository.save(klanten);

        Long ID = s.getID();
        Optional<Klanten> r = klantenRepository.findById(ID);

        assertThat(r.isPresent(), is(true));



    }
}
