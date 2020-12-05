package com.maximopol.maxtut.entity;

import javax.persistence.*;

@Entity
@Table(name = "Comments")
public class Comment {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "News")
    private Long news;

    @Column(name = "Person")
    private Long person;

    @Column(name = "Text")
    private String text;

    @Column(name = "Date")
    private String date;

    @Transient
    private User me;

    public Comment(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNews() {
        return news;
    }

    public void setNews(Long news) {
        this.news = news;
    }

    public Long getPerson() {
        return person;
    }

    public void setPerson(Long person) {
        this.person = person;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getMe() {
        return me;
    }

    public void setMe(User me) {
        this.me = me;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", news=" + news +
                ", person=" + person +
                ", text='" + text + '\'' +
                ", date='" + date + '\'' +
                ", me=" + me +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment comment = (Comment) o;

        if (getId() != null ? !getId().equals(comment.getId()) : comment.getId() != null) return false;
        if (getNews() != null ? !getNews().equals(comment.getNews()) : comment.getNews() != null) return false;
        if (getPerson() != null ? !getPerson().equals(comment.getPerson()) : comment.getPerson() != null) return false;
        if (getText() != null ? !getText().equals(comment.getText()) : comment.getText() != null) return false;
        if (getDate() != null ? !getDate().equals(comment.getDate()) : comment.getDate() != null) return false;
        return getMe() != null ? getMe().equals(comment.getMe()) : comment.getMe() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getNews() != null ? getNews().hashCode() : 0);
        result = 31 * result + (getPerson() != null ? getPerson().hashCode() : 0);
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getMe() != null ? getMe().hashCode() : 0);
        return result;
    }
}
