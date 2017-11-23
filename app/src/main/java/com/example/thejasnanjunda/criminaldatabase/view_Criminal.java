package com.example.thejasnanjunda.criminaldatabase;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class view_Criminal extends Fragment {

    private List<Criminal> criminalList = new ArrayList<>();
    private CriminalAdapter criminalAdapter;
    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable  Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.activity_view__criminal, container,false);


        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        criminalAdapter = new CriminalAdapter(criminalList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(criminalAdapter);
        fillCriminalData();
        return v;
    }

    private void fillCriminalData() {
        DBHelper dbHelper = new DBHelper(getContext());
        List<Criminal> temp = dbHelper.getAllPrisoners();
        for(Criminal c:temp)
        {
            criminalList.add(c);
            Log.d("Name:",c.getF_name());
        }
        criminalAdapter.notifyDataSetChanged();
    }
}
