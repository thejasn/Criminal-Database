package com.example.thejasnanjunda.criminaldatabase;

/**
 * Created by Thejas Nanjunda on 08-11-2017.
 */

public class Guard {
    private int UID;
    private String Gf_name,Gm_name,Gl_name;
    private int Gage;
    private String GDOB,Glast_address,Gcurr_address,Gfather_name,FromTime,ToTime;
    //private String relatives,crimes,associated;
    //private int current_prison_sentence;


    public Guard() {
        
    }

    public Guard(int UID, String gf_name, String gm_name, String gl_name, int gage, String GDOB, String glast_address, String gcurr_address, String gfather_name, String fromTime, String toTime) {
        this.UID = UID;
        Gf_name = gf_name;
        Gm_name = gm_name;
        Gl_name = gl_name;
        Gage = gage;
        this.GDOB = GDOB;
        Glast_address = glast_address;
        Gcurr_address = gcurr_address;
        Gfather_name = gfather_name;
        FromTime = fromTime;
        ToTime = toTime;
    }

    public int getUID() {
        return UID;
    }

    public String getGf_name() {
        return Gf_name;
    }

    public String getGm_name() {
        return Gm_name;
    }

    public String getGl_name() {
        return Gl_name;
    }

    public int getGage() {
        return Gage;
    }

    public String getGDOB() {
        return GDOB;
    }

    public String getGlast_address() {
        return Glast_address;
    }

    public String getGcurr_address() {
        return Gcurr_address;
    }

    public String getGfather_name() {
        return Gfather_name;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public void setGf_name(String gf_name) {
        Gf_name = gf_name;
    }

    public void setGm_name(String gm_name) {
        Gm_name = gm_name;
    }

    public void setGl_name(String gl_name) {
        Gl_name = gl_name;
    }

    public void setGage(int gage) {
        Gage = gage;
    }

    public void setGDOB(String GDOB) {
        this.GDOB = GDOB;
    }

    public void setGlast_address(String glast_address) {
        Glast_address = glast_address;
    }

    public void setGcurr_address(String gcurr_address) {
        Gcurr_address = gcurr_address;
    }

    public void setGfather_name(String gfather_name) {
        Gfather_name = gfather_name;
    }

    public String getFromTime() {
        return FromTime;
    }

    public void setFromTime(String fromTime) {
        FromTime = fromTime;
    }

    public String getToTime() {
        return ToTime;
    }

    public void setToTime(String toTime) {
        ToTime = toTime;
    }
}
