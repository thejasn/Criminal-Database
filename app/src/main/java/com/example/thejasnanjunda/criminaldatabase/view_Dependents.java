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

public class view_Dependents extends Fragment {

    private List<Dependents> dependentsList = new ArrayList<>();
    private DependentAdapter dependentAdapter;
    public view_Dependents() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.activity_view__dependents, container,false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.view_dependents);
        dependentAdapter= new DependentAdapter(dependentsList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dependentAdapter);
        fillDependentData();
        return v;
    }
    private void fillDependentData() {
        DBHelper dbHelper = new DBHelper(getContext());
        List<Dependents> temp = dbHelper.getAllDependents();
        for(Dependents d:temp)
        {
            dependentsList.add(d);
             Log.d("NameD:",d.getCell_block());
        }
        dependentAdapter.notifyDataSetChanged();
    }
}
