package com.example.filmfinder.ui;


import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.filmfinder.R;

public class DetailActivity extends AppCompatActivity {
    private TextView tvMovieName;
    private TextView tvDirectorName;
    private TextView tvMovieSummary;
    private ImageView ivMoviePoster;
    private ImageView ivMovieImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iniViews();

    }

    void iniViews() {

        String MovieName = getIntent().getExtras().getString("MovieName");
        int MovieImage = getIntent().getExtras().getInt("MovieImage");
        int MoviePoster = getIntent().getExtras().getInt("MoviePoster");
        String DirectorName = getIntent().getExtras().getString("DirectorName");
        String MovieSummary=getIntent().getExtras().getString("MovieSummary");

        ivMoviePoster = findViewById(R.id.MoviePoster);
        Glide.with(this).load(MoviePoster).into(ivMoviePoster);

        tvMovieName = findViewById(R.id.MovieName);
        tvMovieName.setText(MovieName);
        getSupportActionBar().setTitle(MovieName);

        tvDirectorName = findViewById(R.id.DirectorName);
        tvDirectorName.setText(DirectorName);


        tvMovieSummary = findViewById(R.id.MovieSummary);
        tvMovieSummary.setText(MovieSummary);


        ivMovieImage = findViewById(R.id.MovieImage);
        Glide.with(this).load(MovieImage).into(ivMovieImage);
        ivMovieImage.setImageResource(MovieImage);

        ivMoviePoster.setAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_animation));

    }
}

