package com.example.filmfinder.ui.Adapter;

import android.widget.ImageView;

import com.example.filmfinder.ui.Model.Movies;

public interface MovieItemClickListener {
    void onMoveClick(Movies movies, ImageView movieImageView);
}
