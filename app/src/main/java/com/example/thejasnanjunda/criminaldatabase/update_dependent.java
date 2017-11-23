package com.example.thejasnanjunda.criminaldatabase;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
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

public class update_dependent extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_insert__dependents,container,false);
        final Button Dadd=(Button)v.findViewById(R.id.DaddEntry);
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
                String[] inputList = new String[14];
                if( GID.getText().toString().equals("") )
                {
                    inputList[0] = "NA";
                    // error
                }
                else inputList[0] = GID.getText().toString();

                if( cellblock.getText().toString().equals("") )
                {
                    inputList[1] = "NA";
                    // error
                }
                else inputList[1] = cellblock.getText().toString();

                if( gender.getText().toString().equals("") )
                {
                    inputList[2] = "NA";
                    // error
                }
                else inputList[2] = gender.getText().toString();

                if( relationship.getText().toString().equals("") )
                {
                    inputList[3] = "NA";
                    // error
                }
                else inputList[3] = relationship.getText().toString();
                if( dob.getText().toString().equals("") )
                {
                    inputList[4] = "NA";
                    // error
                }
                else inputList[4] = dob.getText().toString();
                Dependents dependents = new Dependents(Integer.parseInt(inputList[0]),inputList[1],inputList[2],inputList[3],inputList[4]);
                dbHelper.updateDependents(dependents);

                Toast.makeText(getActivity(), "Inserted ", Toast.LENGTH_LONG).show();
            }
        });


        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
