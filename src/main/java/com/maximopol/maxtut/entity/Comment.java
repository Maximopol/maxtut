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

    @Column(name = "User_ID")
    private Long user_Id;

    @Column(name = "Text")
    private String text;

    @Column(name = "Date")
    private String date;

    @Transient
    private User user;

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

    public Long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Long user_Id) {
        this.user_Id = user_Id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", news=" + news +
                ", user_Id=" + user_Id +
                ", text='" + text + '\'' +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment comment = (Comment) o;

        if (getId() != null ? !getId().equals(comment.getId()) : comment.getId() != null) return false;
        if (getNews() != null ? !getNews().equals(comment.getNews()) : comment.getNews() != null) return false;
        if (getUser_Id() != null ? !getUser_Id().equals(comment.getUser_Id()) : comment.getUser_Id() != null)
            return false;
        if (getText() != null ? !getText().equals(comment.getText()) : comment.getText() != null) return false;
        if (getDate() != null ? !getDate().equals(comment.getDate()) : comment.getDate() != null) return false;
        return getUser() != null ? getUser().equals(comment.getUser()) : comment.getUser() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getNews() != null ? getNews().hashCode() : 0);
        result = 31 * result + (getUser_Id() != null ? getUser_Id().hashCode() : 0);
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        return result;
    }
}
