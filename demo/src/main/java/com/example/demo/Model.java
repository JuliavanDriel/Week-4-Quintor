package com.example.demo;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Model extends Common {

    @Id
    @GeneratedValue
    private Long ID;

    @Column(name = "Inlogname")
    private String inlogname;

    @Column(name = "Password")
    private Integer password;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getInlogname() {
        return inlogname;
    }

    public void setInlogname(String inlogname) {
        this.inlogname = inlogname;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }


}


