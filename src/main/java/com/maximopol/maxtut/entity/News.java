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

    @Transient
    private Employment employment;

    @Transient
    private FileNews fileNews;

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

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public FileNews getFileNews() {
        return fileNews;
    }

    public void setFileNews(FileNews fileNews) {
        this.fileNews = fileNews;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", id_Author=" + id_Author +
                ", id_File=" + id_File +
                ", employment=" + employment +
                ", fileNews=" + fileNews +
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
        if (getId_Author() != null ? !getId_Author().equals(news.getId_Author()) : news.getId_Author() != null)
            return false;
        if (getId_File() != null ? !getId_File().equals(news.getId_File()) : news.getId_File() != null) return false;
        if (getEmployment() != null ? !getEmployment().equals(news.getEmployment()) : news.getEmployment() != null)
            return false;
        return getFileNews() != null ? getFileNews().equals(news.getFileNews()) : news.getFileNews() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getId_Author() != null ? getId_Author().hashCode() : 0);
        result = 31 * result + (getId_File() != null ? getId_File().hashCode() : 0);
        result = 31 * result + (getEmployment() != null ? getEmployment().hashCode() : 0);
        result = 31 * result + (getFileNews() != null ? getFileNews().hashCode() : 0);
        return result;
    }
}
