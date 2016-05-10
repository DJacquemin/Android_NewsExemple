package com.example.student5306.evalutation5.fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.student5306.evalutation5.R;
import com.example.student5306.evalutation5.activities.DetailActivity;
import com.example.student5306.evalutation5.model.News;
import com.example.student5306.evalutation5.recyclerView.ListRecycleViewHolderAdapter;
import com.example.student5306.evalutation5.recyclerView.NewsViewHolder;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements ListRecycleViewHolderAdapter.ClickedCellListener {

    public enum NewsType {
        TOP,
        LIFESTYLE
    }

    private RecyclerView recyclerView;
    private ListRecycleViewHolderAdapter<News, NewsViewHolder> adapter;
    private NewsType type;

    public ListFragment() {
        // Required empty public constructor
    }

    public static ListFragment newInstance(Context context) {
        ListFragment fragment = new ListFragment();
        fragment.adapter = new ListRecycleViewHolderAdapter(context, NewsViewHolder.class, R.layout.row_category);
        fragment.adapter.setListener(fragment);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycleview_list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onClick(int position) {
        Intent detail = new Intent(getActivity(), DetailActivity.class);
        detail.putExtra(DetailActivity.NEWS_POSITION, position);
        detail.putExtra(DetailActivity.NEWS_TYPE, type.ordinal());
        startActivity(detail);
    }

    public void setNews(List<News> news) {
        adapter.setTList(news);
    }

    public void setType(NewsType type) {
        this.type = type;
    }
}
