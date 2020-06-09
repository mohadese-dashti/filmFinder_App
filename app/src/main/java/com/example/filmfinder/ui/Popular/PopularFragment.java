package com.example.filmfinder.ui.Popular;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmfinder.R;
import com.example.filmfinder.ui.Adapter.ListAdapter;

public class PopularFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_new, container, false);

        RecyclerView mRecyclerView = root.findViewById(R.id.recyclerview);

        GridLayoutManager mGridLayoutManager = new GridLayoutManager(getActivity(), 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);


      //  int[] mPlaceList = new int[]{R.drawable.image4,R.drawable.image3,R.drawable.image2,R.drawable.image1};

      //  ListAdapter newAdapter = new ListAdapter(getActivity(), mPlaceList);
      //  mRecyclerView.setAdapter(newAdapter);
        return root;
    }
    }

