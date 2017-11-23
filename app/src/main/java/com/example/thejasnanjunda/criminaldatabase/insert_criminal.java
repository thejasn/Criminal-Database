package com.example.thejasnanjunda.criminaldatabase;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thejasnanjunda.criminaldatabase.R;

public class insert_criminal extends Fragment {


    public insert_criminal() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=  inflater.inflate(R.layout.activity_insert_criminal,container,false);
        FloatingActionButton add = (FloatingActionButton) v.findViewById(R.id.addEntry);
        TextInputLayout input_layout_fname = (TextInputLayout) v.findViewById(R.id.input_layout_fname);
        TextInputLayout input_layout_mname = (TextInputLayout) v.findViewById(R.id.input_layout_mname);
        TextInputLayout input_layout_lname = (TextInputLayout) v.findViewById(R.id.input_layout_lname);
        TextInputLayout input_layout_father_name = (TextInputLayout) v.findViewById(R.id.input_layout_father_name);
        TextInputLayout input_layout_mother_name = (TextInputLayout) v.findViewById(R.id.input_layout_mother_name);
        TextInputLayout input_layout_dob = (TextInputLayout) v.findViewById(R.id.input_layout_dob);
        TextInputLayout input_layout_age = (TextInputLayout) v.findViewById(R.id.input_layout_age);
        TextInputLayout input_layout_lasTadd = (TextInputLayout) v.findViewById(R.id.input_layout_last_addr);
        TextInputLayout input_layout_curradd = (TextInputLayout) v.findViewById(R.id.input_layout_curr_addr);
        TextInputLayout input_layout_curPrison = (TextInputLayout) v.findViewById(R.id.input_layout_curr_prison);
        TextInputLayout input_layout_crimes = (TextInputLayout) v.findViewById(R.id.input_layout_Crimes);
        TextInputLayout input_layout_relatives = (TextInputLayout) v.findViewById(R.id.input_layout_relatives);


        final EditText f_name = (EditText)v.findViewById(R.id.fName);
        final EditText m_name = (EditText)v.findViewById(R.id.mName);
        final EditText l_name = (EditText)v.findViewById(R.id.lName);
        final EditText father_name = (EditText)v.findViewById(R.id.FatherName);
        final EditText mother_name = (EditText)v.findViewById(R.id.MotherName);
        final EditText age = (EditText)v.findViewById(R.id.age);
        final EditText dob = (EditText)v.findViewById(R.id.dob);
        final EditText cell_block = (EditText)v.findViewById(R.id.lAddr);
        final EditText curr_addr = (EditText)v.findViewById(R.id.currAddr);
        final EditText crimes = (EditText)v.findViewById(R.id.crimes);
        final EditText prison = (EditText)v.findViewById(R.id.Prison);
        final EditText relatives = (EditText) v.findViewById(R.id.relatives);
        final  TextView padd = (TextView) v.findViewById(R.id.padd);
        final  TextView padd1 = (TextView) v.findViewById(R.id.padd1);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(getContext());
                String[] inputList = new String[12];
                SharedPreferences sp = getActivity().getSharedPreferences("SAVED_UID", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                int newUID = sp.getInt("PRISONER_UID",0);
                editor.putInt("PRISONER_UID",newUID+1);
                editor.commit();

                inputList[0] = Integer.toString(newUID+1);
                inputList[1] = f_name.getText().toString();
                inputList[2] = m_name.getText().toString();
                inputList[3] = l_name.getText().toString();
                inputList[4] = age.getText().toString();
                inputList[5] = dob.getText().toString();
                inputList[6] = cell_block.getText().toString();
                inputList[7] = curr_addr.getText().toString();
                inputList[8] = father_name.getText().toString();
                inputList[9] = mother_name.getText().toString();
                inputList[10] = crimes.getText().toString();
                inputList[11] = prison.getText().toString();
                Criminal criminal = new Criminal(Integer.parseInt(inputList[0]),inputList[1],inputList[2],inputList[3],Integer.parseInt(inputList[4]),inputList[5],inputList[6],inputList[7],inputList[8],inputList[9],inputList[10],Integer.parseInt(inputList[11]));
                dbHelper.addPrisoner(criminal);
                Toast.makeText(getActivity(), "Inserted ", Toast.LENGTH_LONG).show();
            }
        });

        return v;
    }
}

