package com.example.student5306.evalutation5.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yvan Moté on 31/03/2016.
 */
public class Category {

    private String name;
    private List<News> allNews;


    public Category(String name) {
        this.name = name;
        this.allNews = new ArrayList<>();
    }

    public void addNews(News news) {
        allNews.add(news);
    }
}
