package com.example.filmfinder.ui.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;
import com.example.filmfinder.R;
import com.example.filmfinder.ui.New.DetailActivity;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.PlaceViewHolder> {

    private Context mContext;
    private int[] mPlaceList;


    public ListAdapter(Context mContext, int[] mPlaceList) {
        this.mContext = mContext;
        this.mPlaceList = mPlaceList;
    }

    @Override
    public PlaceViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item,
                parent, false);
        return new PlaceViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final PlaceViewHolder holder, int position) {
        holder.mPlace.setImageResource(mPlaceList[position]
        );
        holder.mPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("Image", mPlaceList[holder.getAdapterPosition()]);
                mContext.startActivity(mIntent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mPlaceList.length;
    }


    class PlaceViewHolder extends RecyclerView.ViewHolder {
        ImageView mPlace;

        public PlaceViewHolder(View itemView) {
            super(itemView);
            mPlace = itemView.findViewById(R.id.ivPlace);
        }
    }
}