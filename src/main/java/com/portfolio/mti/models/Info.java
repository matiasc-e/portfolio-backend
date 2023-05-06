package com.portfolio.mti.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
@Table(name= "info_user")
@Entity
public class Info implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, name= "id_info")
    private Long idInfo;

    @Column(name = "name_info", length = 100, nullable = false)
    private String nameInfo;

    @Column(name = "surname_info", length = 100, nullable = false)
    private String surnameInfo;

    @Column(name = "ubication_info", length = 100, nullable = false)
    private String ubicationInfo;

    @Column(name = "position_info", length = 100, nullable = false)
    private String positionInfo;

    @Column(name = "about_me", length = 1000, nullable = false)
    private String aboutMe;

    @Column(name = "info_pic", length = 1000, nullable = false)
    private String infoPic;

    @Column(name = "info_banner", length = 1000, nullable = false)
    private String infoBanner;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Education> educationList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private  List<Experience> experienceList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSk")
    private List<Skills> skillsList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Proyects> proyectsList;

    public Info() {

    }

    public Info(Long idInfo, String nameInfo, String surnameInfo, String ubicationInfo, String positionInfo, String aboutMe, String infoPic, String infoBanner) {
        this.idInfo = idInfo;
        this.nameInfo = nameInfo;
        this.surnameInfo = surnameInfo;
        this.ubicationInfo = ubicationInfo;
        this.positionInfo = positionInfo;
        this.aboutMe = aboutMe;
        this.infoPic = infoPic;
        this.infoBanner = infoBanner;
    }

    public Long getIdInfo() {
        return idInfo;
    }

    public String getNameInfo() {
        return nameInfo;
    }

    public String getSurnameInfo() {
        return surnameInfo;
    }

    public String getUbicationInfo() {
        return ubicationInfo;
    }

    public String getPositionInfo() {
        return positionInfo;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public String getInfoPic() {
        return infoPic;
    }

    public String getInfoBanner() {
        return infoBanner;
    }

    public void setIdInfo(Long idInfo) {
        this.idInfo = idInfo;
    }

    public void setNameInfo(String nameInfo) {
        this.nameInfo = nameInfo;
    }

    public void setSurnameInfo(String surnameInfo) {
        this.surnameInfo = surnameInfo;
    }

    public void setUbicationInfo(String ubicationInfo) {
        this.ubicationInfo = ubicationInfo;
    }

    public void setPositionInfo(String positionInfo) {
        this.positionInfo = positionInfo;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public void setInfoPic(String infoPic) {
        this.infoPic = infoPic;
    }

    public void setInfoBanner(String infoBanner) {
        this.infoBanner = infoBanner;
    }
}
