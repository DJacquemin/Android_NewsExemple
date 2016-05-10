package com.example.student5306.evalutation5.fragments;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.student5306.evalutation5.R;
import com.example.student5306.evalutation5.model.News;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    private static String NEWS_KEY = "NEWS_KEY";

    private TextView title;
    private TextView detail;
    private ImageView imageView;

    private News news;

    public NewsFragment() {
        // Required empty public constructor
    }

    public static NewsFragment newInstance(News news) {
        NewsFragment fragment = new NewsFragment();

        Bundle argument = new Bundle();
        argument.putParcelable(NEWS_KEY, news);
        fragment.setArguments(argument);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        title = (TextView)view.findViewById(R.id.news_title);
        detail = (TextView)view.findViewById(R.id.news_detail);
        imageView = (ImageView)view.findViewById(R.id.news_image);

        Bundle bundle = getArguments();
        if(bundle != null)
            this.news = (News) bundle.get(NEWS_KEY);

        title.setText(news.getTitle());
        detail.setText(news.getText());

        new DownloadImageTask(imageView).execute(news.getUrlImage());

        return view;
    }

    class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            super.onPostExecute(result);
            bmImage.setImageBitmap(result);
        }
    }

}
