package com.puppu.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.puppu.liveat500px.dao.PhotoItemDao;
import com.puppu.liveat500px.manager.PhotoListManager;
import com.puppu.liveat500px.view.PhotoListItem;

/**
 * Created by puppu on 14-Mar-16.
 */
public class PhotoListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        if (PhotoListManager.getInstance().getDao() == null)
            return 0;
        if (PhotoListManager.getInstance().getDao().getData() == null)
            return 0;
        return PhotoListManager.getInstance().getDao().getData().size();
    }

    @Override
    public Object getItem(int position) {
        return PhotoListManager.getInstance().getDao().getData().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PhotoListItem item;
        if (convertView != null)
            item = (PhotoListItem) convertView;
        else
            item = new PhotoListItem(parent.getContext());

        PhotoItemDao dao = (PhotoItemDao) getItem(position);
        item.setNameText(dao.getCaption());
        item.setDescriptionText(dao.getUsername() + "\n" + dao.getCamera());
        item.setImageUrl(dao.getImageUrl());

        return item;
    }
}