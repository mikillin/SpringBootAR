package de.fhdo.arbe.components.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Equipment   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String code;
    private String information;
    private boolean checked;


    public Equipment() {
    }

    public Equipment(Long id, String title, String code, String information, boolean checked) {
        this.id = id;
        this.title = title;
        this.code = code;
        this.information = information;
        this.checked = checked;
    }

    public Equipment(Long id, String title, String code, String information) {
        this.id = id;
        this.title = title;
        this.code = code;
        this.information = information;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}