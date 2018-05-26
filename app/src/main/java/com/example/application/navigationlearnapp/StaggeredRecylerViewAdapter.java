package com.example.application.navigationlearnapp;

import android.app.VoiceInteractor;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


import java.util.ArrayList;

public class StaggeredRecylerViewAdapter extends RecyclerView.Adapter<StaggeredRecylerViewAdapter.ViewHolder>{

    private static final String TAG = "SRVA";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private Context mContext;

    public StaggeredRecylerViewAdapter(ArrayList<String> mNames, ArrayList<String> mImageUrls, Context mContext) {
        this.mNames = mNames;
        this.mImageUrls = mImageUrls;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_grid_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.trade_brains); //dummy image placed in holder

        Glide.with(mContext)
                .load(mImageUrls.get(position))
                .apply(requestOptions)
                .into(holder.image);

        //Picasso.get().load(mImageUrls.get(position)).into(holder.image);

        holder.name.setText(mNames.get(position));
        //As clicked on Image it shows its destination
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: "+ mNames.get(position));
                Toast.makeText(mContext,mNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageUrls.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView image;


        public ViewHolder(View itemView) {
            super(itemView);
            this.image = itemView.findViewById(R.id.imageW);
            this.name = itemView.findViewById(R.id.name);
        }
    }
}
