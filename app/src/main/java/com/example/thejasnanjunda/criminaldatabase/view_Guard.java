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

public class view_Guard extends Fragment {

    private List<Guard> guardList = new ArrayList<>();
    private GuardAdapter guardAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_view__guard,container,false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.view_guard);
        guardAdapter = new GuardAdapter(guardList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(guardAdapter);
        fillGuardData();

        return view;
    }

    private void fillGuardData() {

        DBHelper dbHelper = new DBHelper(getContext());
        List<Guard> temp = dbHelper.getAllGuards();
        for(Guard g:temp)
        {
            guardList.add(g);
            Log.d("Name:",g.getGf_name());
        }
        guardAdapter.notifyDataSetChanged();
    }
}
