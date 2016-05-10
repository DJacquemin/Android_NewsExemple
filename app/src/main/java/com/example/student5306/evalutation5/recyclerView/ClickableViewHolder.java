package com.example.student5306.evalutation5.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by student5306 on 1/04/16.
 */
public abstract class ClickableViewHolder<T> extends RecyclerView.ViewHolder implements View.OnClickListener {

    public interface OnCLickListener {
        void onClick(int position);
    }

    protected T m_object;
    protected OnCLickListener m_listener;

    public ClickableViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    public void setObject(T object) {
        m_object = object;
        setObjectInViews();
    }

    public T getM_object() {
        return m_object;
    }

    public void setListener(OnCLickListener listener) {
        m_listener = listener;
    }

    public abstract void bindViews();
    public abstract void setObjectInViews();

    @Override
    public void onClick(View v) {
        if(m_listener!=null) {
            m_listener.onClick(getAdapterPosition());
        }
    }

}
