package com.example.thejasnanjunda.criminaldatabase;

/**
 * Created by Thejas Nanjunda on 14-11-2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class DependentAdapter extends RecyclerView.Adapter<DependentAdapter.MyViewHolder> {

    private List<Dependents> dependentsList;

    public DependentAdapter(List<Dependents> dependentsList) {
        this.dependentsList = dependentsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.dependent_view,parent,false);

        return new DependentAdapter.MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        Dependents dependents = dependentsList.get(position);
        //Log.d("pos", "onBindViewHolder: "+criminal.getF_name());
        holder.DGUID.setText(Integer.toString(dependents.getGUID()));
        //nBindViewHolder: "+holder.f_name.getText());
        holder.Dcell_block.setText(dependents.getCell_block());
        holder.D_Gender.setText(dependents.getGender());

        holder.D_dob.setText(dependents.getB_date());
        holder.D_relationship.setText(dependents.getRelationship());
    }

    @Override
    public int getItemCount() {
        return dependentsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView Dlabel0,Dlabel1,Dlabel2,Dlabel3,Dlabel4;
        public TextView DGUID,Dcell_block,D_Gender,D_dob,D_relationship;
        public MyViewHolder(View itemView) {
            super(itemView);


            DGUID = (TextView) itemView.findViewById(R.id.GID);
            Dcell_block= (TextView) itemView.findViewById(R.id.Cellblock);
            D_Gender = (TextView) itemView.findViewById(R.id.DGender);
            D_dob=(TextView) itemView.findViewById(R.id.DDOB);
            D_relationship=(TextView) itemView.findViewById(R.id.D_relationship);

            Dlabel0 = (TextView) itemView.findViewById(R.id.Dlabel0);
            Dlabel1= (TextView) itemView.findViewById(R.id.Dlabel1);
            Dlabel2 = (TextView) itemView.findViewById(R.id.Dlabel2);
            Dlabel3  = (TextView) itemView.findViewById(R.id.Dlabel3);
            Dlabel4 = (TextView) itemView.findViewById(R.id.Dlabel4);

        }
    }
}