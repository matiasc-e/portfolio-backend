package com.portfolio.mti.models;
import jakarta.persistence.*;

@Table(name = "skill")
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_sk",nullable = false)
    private Long idSk;

    @Column(name = "name_sk",nullable = false)
    private String nameSk;

    @Column(name = "percent",nullable = false)
    private int percent;

    public Skills() {

    }

    public Skills(Long idSk, String nameSk, int percent) {
        this.idSk = idSk;
        this.nameSk = nameSk;
        this.percent = percent;
    }

    public Long getIdSk() {
        return idSk;
    }

    public void setIdSk(Long idSk) {
        this.idSk = idSk;
    }

    public String getNameSk() {
        return nameSk;
    }

    public void setNameSk(String nameSk) {
        this.nameSk = nameSk;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}