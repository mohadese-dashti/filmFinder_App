package com.example.filmfinder.ui.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.filmfinder.R;
import com.example.filmfinder.ui.DetailActivity;
import com.example.filmfinder.ui.Model.Movies;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.PlaceViewHolder> {


    Context mContext;
    List<Movies> mPlaceList;
    MovieItemClickListener movieItemClickListener;


    public ListAdapter(Context mContext, List<Movies> mPlaceList,MovieItemClickListener listener) {
        this.mContext = mContext;
        this.mPlaceList = mPlaceList;
        movieItemClickListener=listener;
    }



    @Override
    public ListAdapter.PlaceViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.image_item,
                parent, false);
        return new PlaceViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final PlaceViewHolder holder, int position) {
        Glide.with(mContext).load(mPlaceList.get(position).getMovieImage())
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .into(holder.mPlace);

    }

    @Override
    public int getItemCount() {
        return mPlaceList.size();
    }


    class PlaceViewHolder extends RecyclerView.ViewHolder {
        ImageView mPlace;

        public PlaceViewHolder(View itemView) {
            super(itemView);
            mPlace = itemView.findViewById(R.id.ivPlace);

            mPlace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    movieItemClickListener.onMoveClick(mPlaceList.get(getAdapterPosition()),mPlace);

                }
            });
        }
    }
}