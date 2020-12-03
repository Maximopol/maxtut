package com.maximopol.maxtut.entity;

import javax.persistence.*;

@Entity
@Table(name = "File_News")
public class FileNews {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "File_Name")
    private String file_Name;

    @Column(name = "Title")
    private String title;

    @Column(name = "Text")
    private String text;

    public FileNews() {

    }

    public FileNews(Long id, String file_Name, String title, String text) {
        this.file_Name = file_Name;
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public FileNews(FileNews fileNews) {
        this(fileNews.id, fileNews.file_Name, fileNews.title, fileNews.text);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return file_Name;
    }

    public void setFileName(String fileName) {
        this.file_Name = fileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "FileNews{" +
                "id=" + id +
                ", fileName='" + file_Name + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FileNews)) return false;

        FileNews fileNews = (FileNews) o;

        if (getId() != null ? !getId().equals(fileNews.getId()) : fileNews.getId() != null) return false;
        if (getFileName() != null ? !getFileName().equals(fileNews.getFileName()) : fileNews.getFileName() != null)
            return false;
        if (getTitle() != null ? !getTitle().equals(fileNews.getTitle()) : fileNews.getTitle() != null) return false;
        return getText() != null ? getText().equals(fileNews.getText()) : fileNews.getText() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getFileName() != null ? getFileName().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        return result;
    }
}
