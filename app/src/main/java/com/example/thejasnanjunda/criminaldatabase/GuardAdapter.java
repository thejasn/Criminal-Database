package com.example.thejasnanjunda.criminaldatabase;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Thejas Nanjunda on 09-11-2017.
 */

public class GuardAdapter extends RecyclerView.Adapter<GuardAdapter.MyViewHolder> {

    private List<Guard> list_guards;

    public GuardAdapter(List<Guard> list_guards) {
        this.list_guards = list_guards;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.guard_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Guard guard = list_guards.get(position);
        holder.Guid.setText(Integer.toString(guard.getUID()));
        holder.Gf_name.setText(guard.getGf_name());
        holder.Gm_name.setText(guard.getGm_name());
        holder.Gl_name.setText(guard.getGl_name());
        holder.Gfather_name.setText(guard.getGfather_name());
        holder.Glast_addr.setText(guard.getGlast_address());
        holder.Gcurr_addr.setText(guard.getGcurr_address());
        holder.Gage.setText(Integer.toString(guard.getGage()));
        holder.GCELL.setText(guard.getGcell_block());
        holder.GSALARY.setText(Double.toString(guard.getGsalary()));
        holder.Gdob.setText(guard.getGDOB());
        holder.GFrom.setText(guard.getFromTime());
        holder.GTo.setText(guard.getToTime());
    }

    @Override
    public int getItemCount() {
        return list_guards.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView Glabel0,Glabel1,Glabel2,Glabel3,Glabel4,Glabel5,Glabel6,Glabel7,Glabel8,Glabel9,Glabel,Glabel10,Glabel11;
        public TextView Gf_name,Gm_name,Gl_name,Gfather_name,Glast_addr,Gcurr_addr,Gage,Gdob,GFrom,GTo,Guid,GCELL,GSALARY;
        public MyViewHolder(View itemView) {
            super(itemView);
            Guid = (TextView) itemView.findViewById(R.id.Guid);
            Gf_name = (TextView) itemView.findViewById(R.id.Gfname);
            Gm_name = (TextView) itemView.findViewById(R.id.Gmname);
            Gl_name = (TextView) itemView.findViewById(R.id.Glname);
            Gfather_name = (TextView) itemView.findViewById(R.id.Gfather_name);
            Glast_addr = (TextView) itemView.findViewById(R.id.Glast_addr);
            Gcurr_addr = (TextView) itemView.findViewById(R.id.Gcurr_addr);
            Gage = (TextView) itemView.findViewById(R.id.GAGE);
            GCELL = (TextView) itemView.findViewById(R.id.GCELL);
            GSALARY = (TextView) itemView.findViewById(R.id.GSALARY);
            Gdob = (TextView) itemView.findViewById(R.id.GDOB);
            GFrom = (TextView) itemView.findViewById(R.id.GFrom_time);
            GTo = (TextView) itemView.findViewById(R.id.GTo_time);

            Glabel0 = (TextView) itemView.findViewById(R.id.Glabel0);
            Glabel1= (TextView) itemView.findViewById(R.id.Glabel1);
            Glabel2 = (TextView) itemView.findViewById(R.id.Glabel2);
            Glabel3  = (TextView) itemView.findViewById(R.id.Glabel3);
            Glabel4 = (TextView) itemView.findViewById(R.id.Glabel4);
            Glabel5 =(TextView) itemView.findViewById(R.id.Glabel5);
            Glabel6= (TextView) itemView.findViewById(R.id.Glabel6);
            Glabel7= (TextView) itemView.findViewById(R.id.Glabel7);
            Glabel8= (TextView) itemView.findViewById(R.id.Glabel8);
            Glabel9= (TextView) itemView.findViewById(R.id.Glabel9);
            Glabel10 = (TextView) itemView.findViewById(R.id.Glabel10);
            Glabel11 = (TextView) itemView.findViewById(R.id.Glabel11);

        }
    }
}
