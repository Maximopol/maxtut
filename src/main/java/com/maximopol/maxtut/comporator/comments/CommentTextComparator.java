package com.maximopol.maxtut.comporator.comments;

import com.maximopol.maxtut.entity.Comment;

import java.util.Comparator;

public class CommentTextComparator implements Comparator<Comment> {
    @Override
    public int compare(Comment o1, Comment o2) {
        return o1.getText().compareTo(o2.getText());
    }
}
