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

public class insert_guards extends Fragment {

    public insert_guards() {
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.activity_insert_guards,container,false);
        /*
            id int
            name, 3 parts
            designation
            cell block
            duty timmings
            address
            dependent
            dob
            age


         */
        final Button Gadd = (Button) v.findViewById(R.id.GaddEntry);
        TextInputLayout input_layout_fname = (TextInputLayout) v.findViewById(R.id.input_layout_Gfname);
        TextInputLayout input_layout_mname = (TextInputLayout) v.findViewById(R.id.input_layout_Gmname);
        TextInputLayout input_layout_lname = (TextInputLayout) v.findViewById(R.id.input_layout_Glname);
        TextInputLayout input_layout_father_name = (TextInputLayout) v.findViewById(R.id.input_layout_Gfather_name);
        TextInputLayout input_layout_dob = (TextInputLayout) v.findViewById(R.id.input_layout_Gdob);
        TextInputLayout input_layout_age = (TextInputLayout) v.findViewById(R.id.input_layout_Gage);
        TextInputLayout input_layout_lasTadd = (TextInputLayout) v.findViewById(R.id.input_layout_last_Gaddr);
        TextInputLayout input_layout_curradd = (TextInputLayout) v.findViewById(R.id.input_layout_Gcurr_addr);
        TextInputLayout input_layout_FromTime = (TextInputLayout) v.findViewById(R.id.input_layout_FromTime);
        TextInputLayout input_layout_ToTime = (TextInputLayout) v.findViewById(R.id.input_layout_ToTime);

        final EditText Gf_name = (EditText)v.findViewById(R.id.GfName);
        final EditText Gm_name = (EditText)v.findViewById(R.id.GmName);
        final EditText Gl_name = (EditText)v.findViewById(R.id.GlName);
        final EditText Gfather_name = (EditText)v.findViewById(R.id.GFatherName);
        final EditText Gage = (EditText)v.findViewById(R.id.Gage);
        final EditText Gdob = (EditText)v.findViewById(R.id.Gdob);
        final EditText Glast_addr = (EditText)v.findViewById(R.id.GlAddr);
        final EditText Gcurr_addr = (EditText)v.findViewById(R.id.GcurrAddr);
        final EditText GFromtime = (EditText) v.findViewById(R.id.GFromTime);
        final EditText GTotime  = (EditText) v.findViewById(R.id.GToTime);
        //final EditText Gcrimes = (EditText)v.findViewById(R.id.crimes);
        //final EditText Gprison = (EditText)v.findViewById(R.id.Prison);
        //final EditText relatives = (EditText) v.findViewById(R.id.relatives);
        //final EditText associates = (EditText) v.findViewById(R.id.associates);

        Gadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] inputList = new String[11];
                DBHelper dbHelper = new DBHelper(getContext());
                SharedPreferences sp = getActivity().getSharedPreferences("SAVED_UID", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                int newUID = sp.getInt("GUARD_UID",0);
                editor.putInt("GUARD_UID",newUID+1);
                editor.commit();

                inputList[0] = Integer.toString(newUID+1);
                inputList[1] = Gf_name.getText().toString();
                inputList[2] = Gm_name.getText().toString();
                inputList[3] = Gl_name.getText().toString();
                inputList[4] = Gage.getText().toString();
                inputList[5] = Gdob.getText().toString();
                inputList[6] = Glast_addr.getText().toString();
                inputList[7] = Gcurr_addr.getText().toString();
                inputList[8] = Gfather_name.getText().toString();
                inputList[9]= GFromtime.getText().toString();
                inputList[10]= GTotime.getText().toString();

                //Criminal criminal = new Criminal(Integer.parseInt(inputList[0]),inputList[1],inputList[2],inputList[3],Integer.parseInt(inputList[4]),inputList[5],inputList[6],inputList[7],inputList[8],inputList[9],inputList[10],inputList[11],inputList[12],Integer.parseInt(inputList[13]));
                Guard guard = new Guard(Integer.parseInt(inputList[0]),inputList[1],inputList[2],inputList[3],Integer.parseInt(inputList[4]),inputList[5],inputList[6],inputList[7],inputList[8],inputList[9],inputList[10]);
                dbHelper.addGuards(guard);
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
