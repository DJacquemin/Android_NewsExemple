package com.example.student5306.evalutation5.recyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.student5306.evalutation5.fragments.ListFragment;
import com.example.student5306.evalutation5.model.News;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student5306 on 1/04/16.
 */
public class ListRecycleViewHolderAdapter<T, VH extends ClickableViewHolder> extends RecyclerView.Adapter implements ClickableViewHolder.OnCLickListener {

    private List<T> m_tList;
    private LayoutInflater m_inflater;
    private int m_viewHolderLayout;
    private Class<VH> m_vhClass;

    //ADDED CONTENT--

    public interface ClickedCellListener {
        void onClick(int position);
    }

    private ClickedCellListener listener;
    //----------------

    public ListRecycleViewHolderAdapter(Context context, Class<VH> genericClass) {
        m_tList = new ArrayList<>();
        m_inflater = LayoutInflater.from(context);
        m_vhClass = genericClass;
    }

    public ListRecycleViewHolderAdapter(Context context, Class<VH> genericClass, int rowLayoutId) {
        m_tList = new ArrayList<>();
        m_inflater = LayoutInflater.from(context);
        m_vhClass = genericClass;
        m_viewHolderLayout = rowLayoutId;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = m_inflater.inflate(m_viewHolderLayout, parent, false);

        VH viewHolder = null;

        try {
            viewHolder = m_vhClass.getDeclaredConstructor(View.class).newInstance(v);
            viewHolder.setListener(this);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((VH)holder).setObject(m_tList.get(position));
    }

    @Override
    public int getItemCount() {
        return m_tList.size();
    }

    //---------------- CELL LISTENER --------------

    @Override
    public void onClick(int position) {
        if(listener != null)
            listener.onClick(position);
    }

    //--------------------SETTER--------------------

    public void setViewHolderLayout(int resource) {
        m_viewHolderLayout = resource;
    }

    public void setTList(List<T> objects) {
        m_tList = objects;
        notifyDataSetChanged();
    }

    public void setListener(ClickedCellListener listener) {
        this.listener = listener;
    }
}
