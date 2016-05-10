package com.example.student5306.evalutation5.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.student5306.evalutation5.R;
import com.example.student5306.evalutation5.adapters.NewsPagerAdapter;
import com.example.student5306.evalutation5.fragments.ListFragment;
import com.example.student5306.evalutation5.model.ModelGenerator;
import com.example.student5306.evalutation5.model.News;

import java.util.List;

public class DetailActivity extends AppCompatActivity implements ModelGenerator.NewsListener {

    public static final String NEWS_POSITION = "NEWS_POSITION";
    public static final String NEWS_TYPE = "NEWS_TYPE";

    private ViewPager viewPager;
    private NewsPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager)findViewById(R.id.detail_viewpager);

        adapter = new NewsPagerAdapter(getSupportFragmentManager());
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            switch(ListFragment.NewsType.values()[bundle.getInt(NEWS_TYPE)]) {
                case TOP:
                    ModelGenerator.retrieveTopNews(this);
                    break;
                case LIFESTYLE:
                    ModelGenerator.retrieveLifeStyleNews(this);
                    break;
            }
            viewPager.setAdapter(adapter);
            viewPager.setCurrentItem(bundle.getInt(NEWS_POSITION));
        }
    }

    @Override
    public void onReceiveNews(List<News> newsList) {
        adapter.setNews(newsList);
    }
}
