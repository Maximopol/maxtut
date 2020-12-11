package com.maximopol.maxtut.comporator.news;

import com.maximopol.maxtut.entity.News;

import java.util.Comparator;

public class NewsTitleComparator implements Comparator<News> {
    @Override
    public int compare(News o1, News o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
