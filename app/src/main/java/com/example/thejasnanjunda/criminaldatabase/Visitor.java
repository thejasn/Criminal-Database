package com.example.thejasnanjunda.criminaldatabase;

/**
 * Created by Thejas Nanjunda on 09-11-2017.
 */

public class Visitor {

    private int visitor_id,criminal_id;
    private String Vf_name,Vm_name,Vl_name;
    private int V_age;
    private String V_address,relation_with_criminal,duration;


    public Visitor(int visitor_id, int criminal_id, String vf_name, String vm_name, String vl_name, int v_age, String v_address, String relation_with_criminal, String duration) {
        this.visitor_id = visitor_id;
        this.criminal_id = criminal_id;
        Vf_name = vf_name;
        Vm_name = vm_name;
        Vl_name = vl_name;
        V_age = v_age;
        V_address = v_address;
        this.relation_with_criminal = relation_with_criminal;
        this.duration = duration;
    }

    public Visitor() {
    }

    public int getV_age() {
        return V_age;
    }

    public void setV_age(int v_age) {
        V_age = v_age;
    }

    public int getVisitor_id() {
        return visitor_id;
    }

    public void setVisitor_id(int visitor_id) {
        this.visitor_id = visitor_id;
    }

    public int getCriminal_id() {
        return criminal_id;
    }

    public void setCriminal_id(int criminal_id) {
        this.criminal_id = criminal_id;
    }

    public String getVf_name() {
        return Vf_name;
    }

    public void setVf_name(String vf_name) {
        Vf_name = vf_name;
    }

    public String getVm_name() {
        return Vm_name;
    }

    public void setVm_name(String vm_name) {
        Vm_name = vm_name;
    }

    public String getVl_name() {
        return Vl_name;
    }

    public void setVl_name(String vl_name) {
        Vl_name = vl_name;
    }

    public String getV_address() {
        return V_address;
    }

    public void setV_address(String v_address) {
        V_address = v_address;
    }

    public String getRelation_with_criminal() {
        return relation_with_criminal;
    }

    public void setRelation_with_criminal(String relation_with_criminal) {
        this.relation_with_criminal = relation_with_criminal;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
