package com.example.thejasnanjunda.criminaldatabase;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class update_criminal extends Fragment {

    public update_criminal() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_update_criminal, container, false);
        final Button update = (Button) v.findViewById(R.id.update);
        final EditText ID= (EditText) v.findViewById(R.id.ID);
        final EditText sentence=(EditText) v.findViewById(R.id.Sentence);
        return v;

    }
}
