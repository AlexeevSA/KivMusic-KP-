package com.alexeev.kivmusic.models;

import org.apache.juli.logging.Log;

import javax.persistence.*;

@Entity
@Table(name = "vacation_type")
public class VacationTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vacationtype", nullable = false)
    private Long id;

    @Column(name = "typename", nullable = false, length = 100)
    private String typename;

    public VacationTypeEntity() {
    }

    public VacationTypeEntity(Long id, String typename) {
        this.id = id;
        this.typename = typename;
    }


    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
