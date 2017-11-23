package com.example.thejasnanjunda.criminaldatabase;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class view_Visitor extends Fragment {

    private List<Visitor> visitorList = new ArrayList<>();
    private VisitorAdapter VisitorAdapter;


    @Override
    public void onPause() {
        super.onPause();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.activity_view__visitor, container,false);


        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.view_visitor);
        VisitorAdapter = new VisitorAdapter(visitorList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(VisitorAdapter);
        fillVisitorData();
        return v;

    }

    private void fillVisitorData() {
        DBHelper dbHelper = new DBHelper(getContext());
        List<Visitor> temp = dbHelper.getAllVisitors();
        for(Visitor v:temp)
        {
            visitorList.add(v);
            Log.d("Name:",v.getVf_name());
        }
        VisitorAdapter.notifyDataSetChanged();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
