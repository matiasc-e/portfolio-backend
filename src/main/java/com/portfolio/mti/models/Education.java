package com.portfolio.mti.models;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Table(name = "education")
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_edu")
    private Long idEdu;

    @Column(nullable = false, name = "title_edu", length = 255)
    private String titleEdu;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(nullable = false, name = "start_edu", columnDefinition = "DATE")
    private LocalDate startDateEdu;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(nullable = false, name = "end_edu", columnDefinition = "DATE")
    private LocalDate endDateEdu;

    @Column(nullable = false, name = "desc_edu", length = 500)
    private String descEdu;

    @Column(nullable = false, name = "pic_edu", length = 255)
    private String picEdu;

    public Education() {

    }

    public Education(Long idEdu, String titleEdu, LocalDate startDateEdu, LocalDate endDateEdu, String descEdu, String picEdu) {
        this.idEdu = idEdu;
        this.titleEdu = titleEdu;
        this.startDateEdu = startDateEdu;
        this.endDateEdu = endDateEdu;
        this.descEdu = descEdu;
        this.picEdu = picEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public String getTitleEdu() {
        return titleEdu;
    }

    public LocalDate getStartDateEdu() {
        return startDateEdu;
    }

    public LocalDate getEndDateEdu() {
        return endDateEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public String getPicEdu() {
        return picEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public void setTitleEdu(String titleEdu) {
        this.titleEdu = titleEdu;
    }

    public void setStartDateEdu(LocalDate startDateEdu) {
        this.startDateEdu = startDateEdu;
    }

    public void setEndDateEdu(LocalDate endDateEdu) {
        this.endDateEdu = endDateEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public void setPicEdu(String picEdu) {
        this.picEdu = picEdu;
    }
}

