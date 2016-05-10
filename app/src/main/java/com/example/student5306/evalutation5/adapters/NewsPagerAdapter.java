package com.example.student5306.evalutation5.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.student5306.evalutation5.fragments.NewsFragment;
import com.example.student5306.evalutation5.model.News;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student5306 on 1/04/16.
 */
public class NewsPagerAdapter extends FragmentStatePagerAdapter {

    private List<News> news;

    public NewsPagerAdapter(FragmentManager fm) {
        super(fm);
        news = new ArrayList<>();
    }

    public void setNews(List<News> news) {
        this.news = news;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return NewsFragment.newInstance(news.get(position));
    }

    @Override
    public int getCount() {
        return news.size();
    }

}
