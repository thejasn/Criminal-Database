package com.example.thejasnanjunda.criminaldatabase;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
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

import static com.example.thejasnanjunda.criminaldatabase.R.id.curr_addr;

public class insert_Dependents extends Fragment{


    public insert_Dependents() {
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.activity_insert__dependents,container,false);

        final FloatingActionButton Dadd= (FloatingActionButton) v.findViewById(R.id.DaddEntry);
        TextInputLayout input_layout_GID = (TextInputLayout) v.findViewById(R.id.input_layout_GID);
        TextInputLayout input_layout_mname = (TextInputLayout) v.findViewById(R.id.input_layout_Cell);
        TextInputLayout input_layout_lname = (TextInputLayout) v.findViewById(R.id.input_layout_Gender);
        TextInputLayout input_layout_father_name = (TextInputLayout) v.findViewById(R.id.input_layout_Drelationshp);
        TextInputLayout input_layout_dob = (TextInputLayout) v.findViewById(R.id.input_layout_dob);

        final EditText GID = (EditText)v.findViewById(R.id.G_ID);
        final EditText cellblock = (EditText)v.findViewById(R.id.Cell_block);
        final EditText gender = (EditText)v.findViewById(R.id.D_Gender);
        final EditText relationship = (EditText)v.findViewById(R.id.D_relationship);
        final EditText dob = (EditText)v.findViewById(R.id.D_dob);

        Dadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(getContext());
                String[] inputList = new String[5];

                inputList[0] = GID.getText().toString();
                inputList[1] = cellblock.getText().toString();
                inputList[2] = gender.getText().toString();
                inputList[4] = relationship.getText().toString();
                inputList[3] = dob.getText().toString();
                Dependents dependents = new Dependents(Integer.parseInt(inputList[0]),inputList[1],inputList[2],inputList[3],inputList[4]);
                dbHelper.addDependents(dependents);

                Toast.makeText(getActivity(), "Inserted ", Toast.LENGTH_LONG).show();
            }
        });


        return v;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
