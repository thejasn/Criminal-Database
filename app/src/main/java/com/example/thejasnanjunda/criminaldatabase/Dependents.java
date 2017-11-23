package com.example.thejasnanjunda.criminaldatabase;

/**
 * Created by Thejas Nanjunda on 14-11-2017.
 */

public class Dependents  {

    private int GUID;
    private String cell_block,gender,b_date,relationship;

    public Dependents(int GUID, String cell_block, String gender, String b_date, String relationship) {

        this.GUID = GUID;
        this.cell_block = cell_block;
        this.gender = gender;
        this.b_date = b_date;
        this.relationship = relationship;
    }
    public Dependents()
    {

    }

    public int getGUID() {
        return GUID;
    }

    public void setGUID(int GUID) {
        this.GUID = GUID;
    }

    public String getCell_block() {
        return cell_block;
    }

    public void setCell_block(String cell_block) {
        this.cell_block = cell_block;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getB_date() {
        return b_date;
    }

    public void setB_date(String b_date) {
        this.b_date = b_date;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}


