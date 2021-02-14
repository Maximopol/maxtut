package com.maximopol.maxtut.entitykek;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Questions {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "email")
    private String email;
    @Column(name = "text")
    private String text;

    public Questions() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
