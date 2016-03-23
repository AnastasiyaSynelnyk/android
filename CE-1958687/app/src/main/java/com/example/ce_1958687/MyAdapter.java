package com.example.ce_1958687;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    Context context;


    String[] myDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageFashion;

        public ViewHolder(View imageView) {
            super(imageView);
            this.imageFashion = (ImageView) imageView.findViewById(R.id.image_view_fashion);

        }
    }

    public MyAdapter(Context context, String[] myDataSet) {
        this.myDataSet = myDataSet;
        this.context = context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_view, parent, false);

        // Here you pass WHOLE view, not just the imageview
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        // Here adapter sets data on each visible image holder
        Picasso.with(context)
                // String from dataset
                .load(myDataSet[position])
                        // use holder directly
                .into(holder.imageFashion);

    }

    @Override
    public int getItemCount() {
        return myDataSet.length;
    }
}