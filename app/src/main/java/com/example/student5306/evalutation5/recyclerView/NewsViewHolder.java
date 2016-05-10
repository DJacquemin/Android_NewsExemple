package com.example.student5306.evalutation5.recyclerView;

import android.view.View;
import android.widget.TextView;

import com.example.student5306.evalutation5.R;
import com.example.student5306.evalutation5.model.News;

/**
 * Created by student5306 on 1/04/16.
 */
public class NewsViewHolder extends ClickableViewHolder<News> {

    private TextView name;

    public NewsViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindViews() {
        name = (TextView)itemView.findViewById(R.id.row_category_name);
    }

    @Override
    public void setObjectInViews() {
        if(name == null)
            bindViews();

        name.setText(m_object.getTitle());
    }

}
