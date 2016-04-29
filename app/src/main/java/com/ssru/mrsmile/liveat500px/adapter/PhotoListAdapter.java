package com.ssru.mrsmile.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.ssru.mrsmile.liveat500px.dao.PhotoItemDao;
import com.ssru.mrsmile.liveat500px.manager.PhotoListManager;
import com.ssru.mrsmile.liveat500px.views.PhotoListItem;

/**
 * Created by Suttichai on 4/29/2016.
 */
public class PhotoListAdapter extends BaseAdapter {


    @Override
    public int getCount() {
        try {
            return PhotoListManager.getInstance().getDao().getData().size();
        } catch (NullPointerException ex) {
            return 0;
        }
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
        PhotoListItem photoListItem;

        if (convertView != null) {
            photoListItem = (PhotoListItem) convertView;
        } else {
            photoListItem = new PhotoListItem(parent.getContext());
        }

        PhotoItemDao dao = (PhotoItemDao) getItem(position);

        photoListItem.setTextName(dao.getCaption());
        photoListItem.setTextDescription(dao.getUsername() + "\n" + dao.getCamera());
        photoListItem.setImageUrl(dao.getImageUrl());

        return photoListItem;
    }


/**    @Override public int getViewTypeCount() {
//return super.getViewTypeCount();
// Max item type in listView
return 2;
}

 @Override public int getItemViewType(int position) {
 //return super.getItemViewType(position);
 // return position type view
 return position % 2 == 0 ? 0 : 1;
 }

 @Override public View getView(int position, View convertView, ViewGroup parent) {

 if (getItemViewType(position) == 0) {
 PhotoListItem photoListItem;

 if (convertView != null) {
 photoListItem = (PhotoListItem) convertView;
 } else {
 photoListItem = new PhotoListItem(parent.getContext());
 }

 return photoListItem;
 } else {
 TextView textView;

 if (convertView != null) {
 textView = (TextView) convertView;
 } else {
 textView = new TextView(parent.getContext());
 }
 textView.setText(""+position);
 return textView;
 }

 }*/
}
