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
    @Column(name = "ID_Author")
    private Long id_Author;
    @Column(name = "ID_File")
    private Long id_File;

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

    public Long getId_Author() {
        return id_Author;
    }

    public void setId_Author(Long id_Author) {
        this.id_Author = id_Author;
    }

    public Long getId_File() {
        return id_File;
    }

    public void setId_File(Long id_File) {
        this.id_File = id_File;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", id_Author=" + id_Author +
                ", id_File=" + id_File +
                '}';
    }
}
