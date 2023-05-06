package com.portfolio.mti.models;

import jakarta.persistence.*;

@Table(name = "proyects")
@Entity
public class Proyects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,name = "id_proyect")
    private Long idPro;
    @Column(length = 255,nullable = false,name = "title_proyect")
    private String titlePro;
    @Column(length = 500,nullable = false,name = "desc_proyect")
    private String descPro;

    @Column(length = 500,nullable = true,name = "demo_proyect")
    private String linkDemoPro;

    @Column(length = 500,nullable = false,name = "repo_proyect")
    private String linkRepoPro;
    public Proyects() {

    }

    public Proyects(Long idPro, String titlePro, String descPro, String linkDemoPro, String linkRepoPro) {
        this.idPro = idPro;
        this.titlePro = titlePro;
        this.descPro = descPro;
        this.linkDemoPro = linkDemoPro;
        this.linkRepoPro = linkRepoPro;
    }

    public Long getIdPro() {
        return idPro;
    }

    public String getTitlePro() {
        return titlePro;
    }

    public String getDescPro() {
        return descPro;
    }

    public String getLinkDemoPro() {
        return linkDemoPro;
    }

    public String getLinkRepoPro() {
        return linkRepoPro;
    }

    public void setIdPro(Long idPro) {
        this.idPro = idPro;
    }

    public void setTitlePro(String titlePro) {
        this.titlePro = titlePro;
    }

    public void setDescPro(String descPro) {
        this.descPro = descPro;
    }

    public void setLinkDemoPro(String linkDemoPro) {
        this.linkDemoPro = linkDemoPro;
    }

    public void setLinkRepoPro(String linkRepoPro) {
        this.linkRepoPro = linkRepoPro;
    }
}
