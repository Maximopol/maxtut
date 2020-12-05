package com.maximopol.maxtut.entity;

import javax.persistence.*;

@Entity
@Table(name = "News")
public class News {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Date")
    private String date;

    @Column(name = "Author")
    private Long author;

    @Column(name = "Filek")
    private Long filek;

    @Transient
    private Employment employment;

    @Transient
    private Filek myFilek;

    public News(){

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public Long getFilek() {
        return filek;
    }

    public void setFilek(Long file) {
        this.filek = file;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public Filek getMyFile() {
        return myFilek;
    }

    public void setMyFile(Filek myFilek) {
        this.myFilek = myFilek;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", author=" + author +
                ", file=" + filek +
                ", employment=" + employment +
                ", myFile=" + myFilek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;

        News news = (News) o;

        if (getId() != null ? !getId().equals(news.getId()) : news.getId() != null) return false;
        if (getTitle() != null ? !getTitle().equals(news.getTitle()) : news.getTitle() != null) return false;
        if (getDate() != null ? !getDate().equals(news.getDate()) : news.getDate() != null) return false;
        if (getAuthor() != null ? !getAuthor().equals(news.getAuthor()) : news.getAuthor() != null) return false;
        if (getFilek() != null ? !getFilek().equals(news.getFilek()) : news.getFilek() != null) return false;
        if (getEmployment() != null ? !getEmployment().equals(news.getEmployment()) : news.getEmployment() != null)
            return false;
        return getMyFile() != null ? getMyFile().equals(news.getMyFile()) : news.getMyFile() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (getFilek() != null ? getFilek().hashCode() : 0);
        result = 31 * result + (getEmployment() != null ? getEmployment().hashCode() : 0);
        result = 31 * result + (getMyFile() != null ? getMyFile().hashCode() : 0);
        return result;
    }
}
