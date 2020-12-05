package com.maximopol.maxtut.entity;

import javax.persistence.*;

@Entity
@Table(name = "Filek")
public class Filek {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Title")
    private String title;

    @Column(name = "Text")
    private String text;

    public Filek() {

    }

    public Filek(Long id, String name, String title, String text) {
        this.name = name;
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public Filek(Filek filek) {
        this(filek.id, filek.name, filek.title, filek.text);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filek)) return false;

        Filek filek = (Filek) o;

        if (getId() != null ? !getId().equals(filek.getId()) : filek.getId() != null) return false;
        if (getName() != null ? !getName().equals(filek.getName()) : filek.getName() != null) return false;
        if (getTitle() != null ? !getTitle().equals(filek.getTitle()) : filek.getTitle() != null) return false;
        return getText() != null ? getText().equals(filek.getText()) : filek.getText() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        return result;
    }
}
