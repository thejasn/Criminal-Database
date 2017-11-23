package com.example.thejasnanjunda.criminaldatabase;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class VisitorAdapter extends RecyclerView.Adapter<VisitorAdapter.MyViewHolder>{

    private List<Visitor> visitorList;

    public VisitorAdapter() {
    }

    public VisitorAdapter(List<Visitor> visitorList) {
        this.visitorList = visitorList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.visitor_view,parent,false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Visitor visitor = visitorList.get(position);
        //Log.d("pos", "onBindViewHolder: "+criminal.getF_name());
        holder.Vf_name.setText(visitor.getVf_name());
        //nBindViewHolder: "+holder.f_name.getText());
        holder.Vm_name.setText(visitor.getVm_name());
        holder.Vl_name.setText(visitor.getVl_name());

        holder.Vcurr_addr.setText(visitor.getV_address());
        holder.V_age.setText(Integer.toString(visitor.getV_age()));
        holder.V_relation.setText(visitor.getRelation_with_criminal());
        holder.V_duration.setText(Integer.toString(visitor.getDuration()));
        holder.V_CID.setText(Integer.toString(visitor.getCriminal_id()));

    }

    @Override
    public int getItemCount() {
        return visitorList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView Vlabel0,Vlabel1,Vlabel2,Vlabel3,Vlabel4,Vlabel5,Vlabel6,Vlabel7,Vlabel8;
        public TextView Vf_name,Vm_name,Vl_name,Vcurr_addr,V_age,V_relation,V_duration,V_VID,V_CID ;
        public MyViewHolder(View itemView) {
            super(itemView);


            Vf_name = (TextView) itemView.findViewById(R.id.Vfname);
            Vm_name = (TextView) itemView.findViewById(R.id.Vmname);
            Vl_name = (TextView) itemView.findViewById(R.id.Vlname);
            Vcurr_addr=(TextView) itemView.findViewById(R.id.Vcurr_addr);
            V_age=(TextView) itemView.findViewById(R.id.VAGE);
            V_relation=(TextView) itemView.findViewById(R.id.V_relation);
            V_duration=(TextView) itemView.findViewById(R.id.V_Duration);
            V_CID=(TextView) itemView.findViewById(R.id.VC_ID);

            Vlabel0 = (TextView) itemView.findViewById(R.id.Vlabel0);
            Vlabel1= (TextView) itemView.findViewById(R.id.Vlabel1);
            Vlabel2 = (TextView) itemView.findViewById(R.id.Vlabel2);
            Vlabel3  = (TextView) itemView.findViewById(R.id.Vlabel3);
            Vlabel4 = (TextView) itemView.findViewById(R.id.Vlabel4);
            Vlabel5 =(TextView) itemView.findViewById(R.id.Vlabel5);
            Vlabel6= (TextView) itemView.findViewById(R.id.Vlabel6);
            Vlabel7= (TextView) itemView.findViewById(R.id.Vlabel7);

        }
    }
}
