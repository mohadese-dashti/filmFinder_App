package com.example.filmfinder.ui.New;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmfinder.R;
import com.example.filmfinder.ui.Adapter.ListAdapter;
import com.example.filmfinder.ui.Adapter.MovieItemClickListener;
import com.example.filmfinder.ui.DetailActivity;
import com.example.filmfinder.ui.Model.Movies;
import java.util.ArrayList;
import java.util.List;

public class NewFragment extends Fragment implements MovieItemClickListener {
    private RecyclerView mRecyclerView;
    List<Movies> listNew;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_new, container, false);

        mRecyclerView = root.findViewById(R.id.recyclerview);

        GridLayoutManager mGridLayoutManager = new GridLayoutManager(getActivity(), 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);


        listNew = new ArrayList<>();
        listNew.add(new Movies("movie 1","director 1","Summary 1",R.drawable.image1,R.drawable.image1));
        listNew.add(new Movies("movie 2","director 2","Summary 2",R.drawable.image2,R.drawable.image2));
        listNew.add(new Movies("movie 3","director 3","Summary 3",R.drawable.image3,R.drawable.image3));
        listNew.add(new Movies("movie 4","director 4","Summary 4",R.drawable.image4,R.drawable.image4));
        showRecyclerView();
        return root;
    }

    private void showRecyclerView() {
        ListAdapter newAdapter = new ListAdapter(getActivity(),listNew,this);
        mRecyclerView.setAdapter(newAdapter);
    }
    @Override
    public void onMoveClick(Movies movies, ImageView movieImageView) {
        Intent intent = new Intent(getActivity(),DetailActivity.class);
        intent.putExtra("MovieName", movies.getMovieName());
        intent.putExtra("MovieImage", movies.getMovieImage());
        intent.putExtra("MoviePoster", movies.getMoviePoster());
        intent.putExtra("DirectorName", movies.getDirectorName());
        intent.putExtra("MovieSummary", movies.getMovieSummary());
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(getActivity(), movieImageView, "sharedName");
        startActivity(intent);
    }
}