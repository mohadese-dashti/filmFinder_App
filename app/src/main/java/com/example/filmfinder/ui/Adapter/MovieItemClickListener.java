package com.example.filmfinder.ui.Adapter;
//Create an interface class to define program rules
import android.widget.ImageView;

import com.example.filmfinder.ui.Model.Movies;

public interface MovieItemClickListener {
    //Need an ImageView to share information between two fragments
    void onMoveClick(Movies movies, ImageView movieImageView);
}
