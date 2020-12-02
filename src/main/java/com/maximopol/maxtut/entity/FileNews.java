package com.maximopol.maxtut.entity;

import javax.persistence.*;

@Entity
@Table(name = "File_News")
public class FileNews {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "File_Name")
    private String file_Name;

    @Column(name = "Title")
    private String title;
    @Column(name = "Text")
    private String text;

    public FileNews(){

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
}
