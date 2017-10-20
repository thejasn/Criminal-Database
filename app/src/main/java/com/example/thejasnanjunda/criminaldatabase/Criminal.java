package com.example.thejasnanjunda.criminaldatabase;

/**
 * Created by Thejas Nanjunda on 20-10-2017.
 */

public class Criminal {
    private int UID;
    private String f_name,m_name,l_name;
    private int age;
    private String DOB,last_address,curr_address,father_name,mother_name;
    private String relatives,crimes,associated;
    private int current_prison_sentence;

    public Criminal(int UID, String f_name, String m_name, String l_name, int age, String DOB, String last_address, String curr_address, String father_name, String mother_name, String relatives, String crimes, String associated, int current_prison_sentence) {
        this.UID = UID;
        this.f_name = f_name;
        this.m_name = m_name;
        this.l_name = l_name;
        this.age = age;
        this.DOB = DOB;
        this.last_address = last_address;
        this.curr_address = curr_address;
        this.father_name = father_name;
        this.mother_name = mother_name;
        this.relatives = relatives;
        this.crimes = crimes;
        this.associated = associated;
        this.current_prison_sentence = current_prison_sentence;
    }

    public Criminal() {

    }

    public String getF_name() {
        return f_name;
    }

    public String getM_name() {
        return m_name;
    }

    public String getL_name() {
        return l_name;
    }

    public int getAge() {
        return age;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public String getLast_address() {
        return last_address;
    }

    public String getCurr_address() {
        return curr_address;
    }

    public int getCurrent_prison_sentence() {
        return current_prison_sentence;
    }

    public String getRelatives() {
        return relatives;
    }

    public String getCrimes() {
        return crimes;
    }

    public String getAssociated() {
        return associated;
    }

    public String getDOB() {
        return DOB;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public void setLast_address(String last_address) {
        this.last_address = last_address;
    }

    public void setCurr_address(String curr_address) {
        this.curr_address = curr_address;
    }

    public void setCurrent_prison_sentence(int current_prison_sentence) {
        this.current_prison_sentence = current_prison_sentence;
    }

    public void setRelatives(String relatives) {
        this.relatives = relatives;
    }

    public void setCrimes(String crimes) {
        this.crimes = crimes;
    }

    public void setAssociated(String associated) {
        this.associated = associated;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getUID() {
        return UID;
    }
}
