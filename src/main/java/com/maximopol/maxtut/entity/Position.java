package com.maximopol.maxtut.entity;

import javax.persistence.*;

@Entity
@Table(name = "Positions")
public class Position {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Description")
    private String description;

    public Position() {

    }

    public Position(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Position(Position position) {
        this(position.id, position.description);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;

        Position position = (Position) o;

        if (getId() != null ? !getId().equals(position.getId()) : position.getId() != null) return false;
        return getDescription() != null ? getDescription().equals(position.getDescription()) : position.getDescription() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }
}
