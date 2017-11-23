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
import android.widget.Toast;

public class delete_guard extends Fragment {

    public delete_guard() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_delete_guard,container,false);
        final Button delete = (Button) v.findViewById(R.id.deleteG);
        final EditText gid = (EditText) v.findViewById(R.id.DGID);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String visitor_uid = gid.getText().toString();
                DBHelper dbHelper = new DBHelper(getContext());
                dbHelper.deleteGuard(visitor_uid);
                Toast.makeText(getContext(), "Delete Success", Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
