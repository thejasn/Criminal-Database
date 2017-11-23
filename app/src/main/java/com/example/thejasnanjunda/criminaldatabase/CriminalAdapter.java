package com.example.thejasnanjunda.criminaldatabase;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Thejas Nanjunda on 22-10-2017.
 */

public class CriminalAdapter extends RecyclerView.Adapter<CriminalAdapter.MyViewHolder> {


    private List<Criminal> criminalList;

    public CriminalAdapter(List<Criminal> criminalList) {
        this.criminalList = criminalList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.criminal_view,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Criminal criminal = criminalList.get(position);
        Log.d("pos", "onBindViewHolder: "+criminal.getF_name());
        holder.id.setText(Integer.toString(criminal.getUID()));
        holder.f_name.setText(criminal.getF_name());
        Log.d("value", "onBindViewHolder: "+holder.f_name.getText());
        holder.m_name.setText(criminal.getM_name());
        holder.l_name.setText(criminal.getL_name());
        holder.father_name.setText(criminal.getFather_name());
        holder.mother_name.setText(criminal.getMother_name());
        holder.cell_block.setText(criminal.getCell_block());
        holder.curr_addr.setText(criminal.getCurr_address());
        holder.age.setText(Integer.toString(criminal.getAge()));
        holder.dob.setText(criminal.getDOB());
        holder.crime.setText(criminal.getCrimes());
        holder.sentence.setText(Integer.toString(criminal.getCurrent_prison_sentence()));


    }

    @Override
    public int getItemCount() {
        return criminalList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView label0,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
        public TextView f_name,m_name,l_name,father_name,mother_name, cell_block,curr_addr,age,dob,id,sentence,crime;
        public MyViewHolder(View itemView) {
            super(itemView);
            id = (TextView) itemView.findViewById(R.id.uid);
            f_name = (TextView) itemView.findViewById(R.id.fname);
            m_name = (TextView) itemView.findViewById(R.id.mname);
            l_name = (TextView) itemView.findViewById(R.id.lname);
            father_name = (TextView) itemView.findViewById(R.id.father_name);
            mother_name = (TextView) itemView.findViewById(R.id.mother_name);
            cell_block = (TextView) itemView.findViewById(R.id.last_addr);
            curr_addr = (TextView) itemView.findViewById(R.id.curr_addr);
            age = (TextView) itemView.findViewById(R.id.AGE);
            dob = (TextView) itemView.findViewById(R.id.DOB);
            sentence = (TextView) itemView.findViewById(R.id.sentence);
            crime = (TextView) itemView.findViewById(R.id.crime);

            label0 = (TextView) itemView.findViewById(R.id.label0);
            label1= (TextView) itemView.findViewById(R.id.label1);
            label2 = (TextView) itemView.findViewById(R.id.label2);
            label3  = (TextView) itemView.findViewById(R.id.label3);
            label4 = (TextView) itemView.findViewById(R.id.label4);
            label5 =(TextView) itemView.findViewById(R.id.label5);
            label6= (TextView) itemView.findViewById(R.id.label6);
            label7= (TextView) itemView.findViewById(R.id.label7);
            label8= (TextView) itemView.findViewById(R.id.label8);
            label9 = (TextView) itemView.findViewById(R.id.label9);
            label10 = (TextView) itemView.findViewById(R.id.label10);



        }
    }

}
