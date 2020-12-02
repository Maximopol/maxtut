package com.maximopol.maxtut.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employmens")
public class Employmen {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ID_User")
    private Long id_User;
    @Column(name = "ID_Position")
    private Long id_Position;
    @Column(name = "ID_Contract")
    private Long id_Contract;
    @Column(name = "phone")
    private String phone;

    public Employmen(){

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getId_User() {
        return id_User;
    }

    public void setId_User(Long id_User) {
        this.id_User = id_User;
    }

    public Long getId_Position() {
        return id_Position;
    }

    public void setId_Position(Long id_Position) {
        this.id_Position = id_Position;
    }

    public Long getId_Contract() {
        return id_Contract;
    }

    public void setId_Contract(Long id_Contract) {
        this.id_Contract = id_Contract;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employmen{" +
                "id=" + id +
                ", id_User=" + id_User +
                ", id_Position=" + id_Position +
                ", id_Contract=" + id_Contract +
                ", phone='" + phone + '\'' +
                '}';
    }
}
