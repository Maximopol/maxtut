package com.maximopol.maxtut.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employments")
public class Employment {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Person")
    private Long person;

    @Column(name = "Position")
    private Integer position;

    @Column(name = "Contract")
    private Long contract;

    @Column(name = "Phone")
    private String phone;

    @Transient
    private User user;

    @Transient
    private Position myPosition;

    public Employment() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPerson() {
        return person;
    }

    public void setPerson(Long person) {
        this.person = person;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Long getContract() {
        return contract;
    }

    public void setContract(Long contract) {
        this.contract = contract;
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

    public Position getMyPosition() {
        return myPosition;
    }

    public void setMyPosition(Position myPosition) {
        this.myPosition = myPosition;
    }

    @Override
    public String toString() {
        return "Employment{" +
                "id=" + id +
                ", person=" + person +
                ", position=" + position +
                ", contract=" + contract +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                ", myPosition=" + myPosition +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employment)) return false;

        Employment that = (Employment) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getPerson() != null ? !getPerson().equals(that.getPerson()) : that.getPerson() != null) return false;
        if (getPosition() != null ? !getPosition().equals(that.getPosition()) : that.getPosition() != null)
            return false;
        if (getContract() != null ? !getContract().equals(that.getContract()) : that.getContract() != null)
            return false;
        if (getPhone() != null ? !getPhone().equals(that.getPhone()) : that.getPhone() != null) return false;
        if (getUser() != null ? !getUser().equals(that.getUser()) : that.getUser() != null) return false;
        return getMyPosition() != null ? getMyPosition().equals(that.getMyPosition()) : that.getMyPosition() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getPerson() != null ? getPerson().hashCode() : 0);
        result = 31 * result + (getPosition() != null ? getPosition().hashCode() : 0);
        result = 31 * result + (getContract() != null ? getContract().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getMyPosition() != null ? getMyPosition().hashCode() : 0);
        return result;
    }
}
