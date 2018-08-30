package com.example.asus1.learnrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BaseAdapter extends RecyclerView.Adapter<BaseHolder> {

    private static final String TAG = "BaseAdapter";

    private Context mContext;
    public BaseAdapter(Context context) {
        mContext = context;
    }


    @Override
    public BaseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item,parent,false);
        BaseHolder holder = new BaseHolder(view);
        Log.d(TAG, "onCreateViewHolder: ");
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: \r\n"+holder.toString()+"----"+position);
    }

    @Override
    public int getItemCount() {
        return 30;
    }
}
