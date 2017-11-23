package com.example.thejasnanjunda.criminaldatabase;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class update_guard extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public update_guard() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_update_guard,container,false);
        final Button update_guard  = (Button) v.findViewById(R.id.update_guard);
        final TextView ID = (TextView) v.findViewById(R.id.guardID);
        final EditText cellbock =(EditText) v.findViewById(R.id.Cellblock);

        update_guard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = ID.getText().toString();
                DBHelper dbHelper = new DBHelper(getContext());
                dbHelper.updateGuard(id,cellbock.getText().toString());
            }
        });
        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
