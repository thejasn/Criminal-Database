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


public class insert_visitor extends Fragment {

    public insert_visitor()
    {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.activity_insert_visitor,container,false);
        Button V_add= (Button) v.findViewById(R.id.VaddEntry);
        TextInputLayout inputLayout_Vfname= (TextInputLayout) v.findViewById(R.id.input_layout_Vfname);
        TextInputLayout inputLayout_Vmname= (TextInputLayout) v.findViewById(R.id.input_layout_Vmname);
        TextInputLayout inputLayout_Vlname= (TextInputLayout) v.findViewById(R.id.input_layout_Vlname);
        TextInputLayout inputLayout_Vage= (TextInputLayout) v.findViewById(R.id.input_layout_Vage);
        TextInputLayout inputLayout_Vaddress= (TextInputLayout) v.findViewById(R.id.input_layout_Vcurr_addr);
        TextInputLayout inputLayout_Relation_with_Criminal= (TextInputLayout) v.findViewById(R.id.input_layout_Relation_with_Criminal);
        TextInputLayout inputLayout_Vduration= (TextInputLayout) v.findViewById(R.id.input_layout_Vduration);
        TextInputLayout inputLayout_V_CID = (TextInputLayout) v.findViewById(R.id.input_layout_V_CID);
        // TextInputLayout inputLayout_C_ID= (TextInputLayout) v.findViewById(R.id.input_layout_last_Criminal_ID);

        final EditText Vf_name = (EditText)v.findViewById(R.id.VfName);
        final EditText Vm_name = (EditText)v.findViewById(R.id.VmName);
        final EditText Vl_name = (EditText)v.findViewById(R.id.VlName);
       // final EditText Vfather_name = (EditText)v.findViewById(R.id.GFatherName);
        //final EditText Gmother_name = (EditText)v.findViewById(R.id.GMotherName);
        final EditText Vage = (EditText)v.findViewById(R.id.Vage);
        //final EditText Gdob = (EditText)v.findViewById(R.id.Gdob);
        //final EditText Glast_addr = (EditText)v.findViewById(R.id.GlAddr);
        final EditText Vcurr_addr = (EditText)v.findViewById(R.id.VcurrAddr);
        final EditText Vduration = (EditText)v.findViewById(R.id.Vduration);
        final EditText VRelation = (EditText)v.findViewById(R.id.Vrelatives);
        final EditText V_CID = (EditText) v.findViewById(R.id.V_CID);

        V_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(getContext());
                SharedPreferences sp = getActivity().getSharedPreferences("SAVED_UID", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                int newUID = sp.getInt("VISITOR_UID",0);
                editor.putInt("VISITOR_UID",newUID+1);
                editor.commit();
                String[] inputList = new String[9];
                inputList[0] = Integer.toString(newUID);
                inputList[1] = V_CID.getText().toString();
                inputList[2] = Vf_name.getText().toString();
                inputList[3] = Vm_name.getText().toString();
                inputList[4] = Vl_name.getText().toString();
                inputList[5] = Vage.getText().toString();
                inputList[6] = Vcurr_addr.getText().toString();
                inputList[8] = Vduration.getText().toString();
                inputList[7] = VRelation.getText().toString();
                Visitor visitor = new Visitor(Integer.parseInt(inputList[0]),Integer.parseInt(inputList[1]),inputList[2],inputList[3],inputList[4],Integer.parseInt(inputList[5]),inputList[6],inputList[7],inputList[8]);
                dbHelper.addVisitor(visitor);
                Toast.makeText(getActivity(), "Inserted Visitor", Toast.LENGTH_SHORT).show();


            }
        });



        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_insert_visitor);

    }
}
