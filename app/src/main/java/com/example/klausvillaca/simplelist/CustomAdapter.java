package com.example.klausvillaca.simplelist;

/**
 * Created by klausvillaca on 21/07/2014.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Class Custom Adapter
 */
public class CustomAdapter extends BaseAdapter {

    private List<MyBean> objects;
    private Context context;
    private LayoutInflater inflater;
    private String dateToStr;

    public CustomAdapter(Context context, List<MyBean> objects) {
        this.context = context;
        this.objects = objects;
        inflater = LayoutInflater.from(this.context);
    }


    @Override
    public int getCount() {
        return objects.size();
    }


    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewItem holder = null;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item, null);
            holder = new ViewItem();
            convertView.setTag(holder);
        } else {
            holder = new ViewItem();
        }

        holder.titleTv = (TextView) convertView.findViewById(R.id.title);
        holder.dateTv = (TextView) convertView.findViewById(R.id.date);
        holder.dataTv = (TextView) convertView.findViewById(R.id.data);

        MyBean bean = (MyBean) getItem(position);
        holder.titleTv.setText(bean.getTitle());
        holder.dateTv.setText(bean.getDate());
        holder.dataTv.setText(bean.getSomeData());

        return convertView;
    }


    class ViewItem {
        TextView titleTv = null;
        TextView dateTv = null;
        TextView dataTv = null;
    }

}




