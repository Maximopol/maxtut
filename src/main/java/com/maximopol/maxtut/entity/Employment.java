package com.maximopol.maxtut.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employmens")
public class Employment {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ID_User")
    private Long id_User;

    @Column(name = "ID_Position")
    private Long id_Position;

    @Column(name = "ID_Contract")
    private Long id_Contract;

    @Column(name = "phone")
    private String phone;

    @Transient
    private User user;

    @Transient
    private Position position;

    public Employment() {

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employment{" +
                "id=" + id +
                ", id_User=" + id_User +
                ", id_Position=" + id_Position +
                ", id_Contract=" + id_Contract +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employment)) return false;

        Employment that = (Employment) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getId_User() != null ? !getId_User().equals(that.getId_User()) : that.getId_User() != null) return false;
        if (getId_Position() != null ? !getId_Position().equals(that.getId_Position()) : that.getId_Position() != null)
            return false;
        if (getId_Contract() != null ? !getId_Contract().equals(that.getId_Contract()) : that.getId_Contract() != null)
            return false;
        if (getPhone() != null ? !getPhone().equals(that.getPhone()) : that.getPhone() != null) return false;
        if (getUser() != null ? !getUser().equals(that.getUser()) : that.getUser() != null) return false;
        return getPosition() != null ? getPosition().equals(that.getPosition()) : that.getPosition() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getId_User() != null ? getId_User().hashCode() : 0);
        result = 31 * result + (getId_Position() != null ? getId_Position().hashCode() : 0);
        result = 31 * result + (getId_Contract() != null ? getId_Contract().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getPosition() != null ? getPosition().hashCode() : 0);
        return result;
    }
}
