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
import android.widget.TextView;
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

        final FloatingActionButton Gadd = (FloatingActionButton) v.findViewById(R.id.GaddEntry);
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
        final EditText Gcell_block = (EditText) v.findViewById(R.id.Gcell_block);
        final EditText Gsalary = (EditText) v.findViewById(R.id.Gsalary);
        final EditText Gdob = (EditText)v.findViewById(R.id.Gdob);
        final EditText Glast_addr = (EditText)v.findViewById(R.id.GlAddr);
        final EditText Gcurr_addr = (EditText)v.findViewById(R.id.GcurrAddr);
        final EditText GFromtime = (EditText) v.findViewById(R.id.GFromTime);
        final EditText GTotime  = (EditText) v.findViewById(R.id.GToTime);
        TextView pad = (TextView) v.findViewById(R.id.textView);
        TextView pad1 = (TextView) v.findViewById(R.id.textView2);

        Gadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] inputList = new String[13];
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
                inputList[5] = Gcell_block.getText().toString();
                inputList[6] = Gsalary.getText().toString();
                inputList[7] = Gdob.getText().toString();
                inputList[8] = Glast_addr.getText().toString();
                inputList[9] = Gcurr_addr.getText().toString();
                inputList[10] = Gfather_name.getText().toString();
                inputList[11]= GFromtime.getText().toString();
                inputList[12]= GTotime.getText().toString();

                //Criminal criminal = new Criminal(Integer.parseInt(inputList[0]),inputList[1],inputList[2],inputList[3],Integer.parseInt(inputList[4]),inputList[5],inputList[6],inputList[7],inputList[8],inputList[9],inputList[10],inputList[11],inputList[12],Integer.parseInt(inputList[13]));
                Guard guard = new Guard(Integer.parseInt(inputList[0]),inputList[1],inputList[2],inputList[3],Integer.parseInt(inputList[4]),inputList[5],Float.parseFloat(inputList[6]),inputList[7],inputList[8],inputList[9],inputList[10],inputList[11],inputList[12]);
                dbHelper.addGuards(guard);
                Toast.makeText(getActivity(), "Inserted ", Toast.LENGTH_LONG).show();
                //DBHelper dbhelper = new DBHelper(getContext());
                /*Guard Guard1 =new Guard(0,"Nathen","middle","Jacob",34,"24/06/86","California","Florida","Martin","3","9");
                dbhelper.addGuards(Guard1);
                Guard Guard2 =new Guard(1,"Christopher","middle","Sean",30,"14/12/88","Italy","Florida","Sean","3","9");
                dbhelper.addGuards(Guard2);
                Guard Guard3 =new Guard(2,"James","middle","Arthur",28,"10/10/91","Canberra","Sydney","Morrison","3","9");
                dbhelper.addGuards(Guard3);
                Guard Guard4 =new Guard(3,"David","middle","Ford",36,"06/08/84","Sydney","Bangkok","Charles","3","9");
                dbhelper.addGuards(Guard4);
                Guard Guard5 =new Guard(4,"Thomas","middle","Knox",24,"29/11/90","Washington","Miami","Kane","3","9");
                dbhelper.addGuards(Guard5);
                Guard Guard6 =new Guard(5,"Kenneth","middle","Fox",32,"08/03/80","Melbourn","Florida","Silvester","3","9");
                dbhelper.addGuards(Guard6);
                Guard Guard7 =new Guard(6,"Ross","middle","Greyjoy",39,"20/08/78","Miami","Washington","Stones","3","9");
                dbhelper.addGuards(Guard7);
                Guard Guard8 =new Guard(7,"Morgan","middle","Stark",36,"11/05/82","Bangkok","Italy","Jhon","3","9");
                dbhelper.addGuards(Guard8);
                Guard Guard9 =new Guard(8,"Jack","middle","Lane",38,"24/12/85","Brisbane","California","Rehager","3","9");
                dbhelper.addGuards(Guard9);
                Guard Guard10 =new Guard(9,"Benjamin","middle","Khole",34,"16/06/83","Canberra","Moscow","Carlos","3","9");
                dbhelper.addGuards(Guard10);
                Guard Guard11 =new Guard(10,"Sam","middle","Juno",32,"22/11/87","Miami","Sydney","Lucas","3","9");
                dbhelper.addGuards(Guard11);
                Guard Guard12 =new Guard(11,"Michael","middle","Simon",31,"18/06/88","Washington","Miami","Gavin","3","9");
                dbhelper.addGuards(Guard12);
                Guard Guard13 =new Guard(12,"Leo","middle","Eden",27,"01/09/91","Italy","Melbourn","Jude","3","9");
                dbhelper.addGuards(Guard13);
                Guard Guard14 =new Guard(13,"Oliver","middle","Williams",26,"07/10/90","California","Brisbane","Sebastian","3","9");
                dbhelper.addGuards(Guard14);
                Guard Guard15 =new Guard(14,"Ryan","middle","Bennett",30,"18/03/89","California","Bangkok","Parker","3","9");
                dbhelper.addGuards(Guard15);
                Guard Guard16 =new Guard(15,"Theon","middle","Ames",35,"12/02/86","Italy","Canberra","Clark","3","9");
                dbhelper.addGuards(Guard16);
                Guard Guard17 =new Guard(16,"Harrison","middle","Cohen",35,"28/01/83","Sydney","Washington","Zen","3","9");
                dbhelper.addGuards(Guard17);
                Guard Guard18 =new Guard(17,"Freddie","middle","Cohen",38,"15/01/79","Bangkok","Florida","Maxim","3","9");
                dbhelper.addGuards(Guard18);
                Guard Guard19 =new Guard(18,"Stanley","middle","Cortez",37,"24/04/78","Washington","Sydney","Oliver","3","9");
                dbhelper.addGuards(Guard19);
                Guard Guard20 =new Guard(19,"Toby","middle","Torreto",32,"30/06/80","Brisbane","California","Kennedy","3","9");
                dbhelper.addGuards(Guard20);*/
            }
        });
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    

}
