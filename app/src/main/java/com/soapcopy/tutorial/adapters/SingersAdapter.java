package com.soapcopy.tutorial.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import com.soapcopy.tutorial.objects.Singer;

import java.util.ArrayList;

/**
 * Created by Dev on 2017-02-13.
 */

public class SingersAdapter extends BaseAdapter{

    ArrayList<Singer> singers;



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
