package com.example.thejasnanjunda.criminaldatabase;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.thejasnanjunda.criminaldatabase.R;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thejas Nanjunda on 20-10-2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final int DB_version =4;

    private static final String DATABASE_NAME = "criminalDatabase";

    // prisoner table column names
    private static final String TABLE_CRIMINAL = "PRISONERS";
    private static final String P_UID = "uid";
    private static final String PF_NAME ="f_name";
    private static final String PL_NAME = "m_name";
    private static final String PM_NAME = "l_name";
    private static final String P_AGE = "age";
    private static final  String P_DOB = "DOB";
    private static final String P_LAddr = "last_address";
    private static final String P_CADDR = "curr_address";
    private static final String P_FATHER = "father_name", P_MOTHER = "mother_name";
    private static final String P_RELATIVE = "relatives";
    private static final String P_CRIMES = "crimes";
    private static final String P_ASSOC = "assoiciates";
    private static final String P_SENTENCE = "sentence";


    // guards table column names

    private static final String TABLE_GUARDS = "GUARDS";
    private static final String G_UID = "uid";
    private static final String GF_NAME ="f_name";
    private static final String GL_NAME = "m_name";
    private static final String GM_NAME = "l_name";
    private static final String G_AGE = "age";
    private static final  String G_DOB = "DOB";
    private static final String G_LAddr = "last_address";
    private static final String G_CADDR = "curr_address";
    private static final String G_FATHER = "father_name";
    //        P_MOTHER = "mother_name";
    private static final String G_FROMTIME = "from_time";
    private static final String G_TOTIME = " to_time";


    //colums for visitors

    private static final String TABLE_VISITORS="VISITOR";
    private static final String V_UID = "uid";
    private static final String VF_NAME ="f_name";
    private static final String VL_NAME = "m_name";
    private static final String VM_NAME = "l_name";
    private static final String V_CADDR = "curr_address";
    private static final String V_AGE="age";
    private static final String V_RELATION = "relation";
    private static final String V_DURATION = "duration";



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DB_version);
    }

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_PRISONER_TABLE = "CREATE TABLE " + TABLE_CRIMINAL + "("
                + P_UID + " INTEGER PRIMARY KEY,"
                + PF_NAME + " TEXT," + PM_NAME + " TEXT," + PL_NAME + " TEXT,"
                + P_AGE + " INTEGER," + P_DOB + " TEXT,"
                + P_LAddr + " TEXT," + P_CADDR + " TEXT,"
                + P_FATHER + " TEXT," + P_MOTHER + " TEXT,"
                + P_RELATIVE + " TEXT," + P_CRIMES + " TEXT,"
                + P_ASSOC + " TEXT," + P_SENTENCE + " INTEGER)";
        db.execSQL(CREATE_PRISONER_TABLE);

        String CREATE_GUARDS_TABLE = "CREATE TABLE " + TABLE_GUARDS + "("
                + G_UID + " INTEGER PRIMARY KEY,"
                + GF_NAME + " TEXT," + GM_NAME + " TEXT," + GL_NAME + " TEXT,"
                + G_AGE + " INTEGER," + G_DOB + " TEXT,"
                + G_LAddr + " TEXT," + G_CADDR + " TEXT,"
                + G_FATHER + " TEXT,"
                + G_FROMTIME + " TEXT," + G_TOTIME + " TEXT)";
        db.execSQL(CREATE_GUARDS_TABLE);

        String CREATE_VISITORS_TABLE = "CREATE TABLE " + TABLE_VISITORS + "("
                + V_UID + " INTEGER ,"
                + VF_NAME + " TEXT," + VM_NAME + " TEXT," + VL_NAME + " TEXT,"
                + V_AGE + " INTEGER,"+ V_CADDR + " TEXT,"+ V_RELATION + " TEXT,"
                + V_DURATION + " INTEGER)";

        db.execSQL(CREATE_VISITORS_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CRIMINAL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_VISITORS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_GUARDS);
        onCreate(db);
    }
    public void addGuards(Guard guard)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(G_UID,guard.getUID());
        values.put(GF_NAME,guard.getGf_name());
        values.put(GM_NAME,guard.getGm_name());
        values.put(GL_NAME,guard.getGl_name());
        values.put(G_AGE,guard.getGage());
        values.put(G_DOB,guard.getGDOB());
        values.put(G_LAddr,guard.getGlast_address());
        values.put(G_CADDR,guard.getGcurr_address());
        values.put(G_FATHER,guard.getGfather_name());
        values.put(G_FROMTIME,guard.getFromTime());
        values.put(G_TOTIME,guard.getToTime());
        //values.put(P_RELATIVE,gu);
        //values.put(P_CRIMES,criminal.getCrimes());
        //values.put(P_ASSOC,criminal.getAssociated());
        //values.put(P_SENTENCE,criminal.getCurrent_prison_sentence());
        db.insert(TABLE_GUARDS,null,values);
        //Toast.makeText(g, "inserted guard", Toast.LENGTH_SHORT).show();
    }
    public void addPrisoner(Criminal criminal)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(P_UID,criminal.getUID());
        values.put(PF_NAME,criminal.getF_name());
        values.put(PM_NAME,criminal.getM_name());
        values.put(PL_NAME,criminal.getL_name());
        values.put(P_AGE,criminal.getAge());
        values.put(P_DOB,criminal.getDOB());
        values.put(P_LAddr,criminal.getLast_address());
        values.put(P_CADDR,criminal.getCurr_address());
        values.put(P_FATHER,criminal.getFather_name());
        values.put(P_MOTHER,criminal.getMother_name());
        values.put(P_RELATIVE,criminal.getRelatives());
        values.put(P_CRIMES,criminal.getCrimes());
        values.put(P_ASSOC,criminal.getAssociated());
        values.put(P_SENTENCE,criminal.getCurrent_prison_sentence());
        db.insert(TABLE_CRIMINAL,null,values);
    }

    public List<Guard> getAllGuards()
    {
        List<Guard> guardList = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_GUARDS;
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        if(cursor.moveToFirst())
        {

            do{

                Guard guard = new Guard();
                //ContentVal;ues values = new ContentValues()
                guard.setUID(Integer.parseInt(cursor.getString(0)));
                guard.setGf_name(cursor.getString(1));
                guard.setGm_name(cursor.getString(2));
                guard.setGl_name(cursor.getString(3));
                guard.setGage(Integer.parseInt(cursor.getString(4)));
                guard.setGage(Integer.parseInt(cursor.getString(5)));
                guard.setGlast_address(cursor.getString(6));
                guard.setGcurr_address(cursor.getString(7));
                guard.setGfather_name(cursor.getString(8));
                guard.setFromTime(cursor.getString(9));
                guard.setToTime(cursor.getString(10));
                guardList.add(guard);
            }while(cursor.moveToNext());

        }

        return guardList;
    }
    public void addVisitor(Visitor visitor) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(V_UID,visitor.getVisitor_id());
        values.put(VF_NAME,visitor.getVf_name());
        values.put(VM_NAME,visitor.getVm_name());
        values.put(VL_NAME,visitor.getVl_name());
        values.put(V_AGE,visitor.getV_age());
        values.put(V_CADDR,visitor.getV_address());
        values.put(V_RELATION,visitor.getRelation_with_criminal());
        values.put(V_DURATION,visitor.getDuration());
        db.insert(TABLE_VISITORS,null,values);
    }
    public List<Criminal> getAllPrisoners()
    {
        List<Criminal> prisonerList = new ArrayList<>();
        String selectQuery  = "SELECT * FROM " + TABLE_CRIMINAL;
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);

        if(cursor.moveToFirst())
        {
            do{
                Criminal criminal = new Criminal();
                criminal.setUID(Integer.parseInt(cursor.getString(0)));
                criminal.setF_name(cursor.getString(1));
                criminal.setM_name(cursor.getString(2));
                criminal.setL_name(cursor.getString(3));
                criminal.setAge(Integer.parseInt(cursor.getString(4)));
                criminal.setDOB(cursor.getString(5));
                criminal.setLast_address(cursor.getString(6));
                criminal.setCurr_address(cursor.getString(7));
                criminal.setFather_name(cursor.getString(8));
                criminal.setMother_name(cursor.getString(9));
                criminal.setRelatives(cursor.getString(10));
                criminal.setCrimes(cursor.getString(11));
                criminal.setAssociated(cursor.getString(12));
                criminal.setCurrent_prison_sentence(Integer.parseInt(cursor.getString(13)));
                prisonerList.add(criminal);
            }while(cursor.moveToNext());
        }

        return prisonerList;
    }
    public List<Visitor> getAllVisitors()
    {
        List<Visitor> visitorList = new ArrayList<>();
        String selectQuery  = "SELECT * FROM " + TABLE_VISITORS;
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);

        if(cursor.moveToFirst())
        {
            do{
                Visitor visitor = new Visitor();
                visitor.setVisitor_id(Integer.parseInt(cursor.getString(0)));
                visitor.setVf_name(cursor.getString(1));
                visitor.setVm_name(cursor.getString(2));
                visitor.setVl_name(cursor.getString(3));
                visitor.setV_age(Integer.parseInt(cursor.getString(4)));
                //     visitor.setLast_address(cursor.getString(6));
                visitor.setV_address(cursor.getString(5));
                // visitor.setFather_name(cursor.getString(8));
                //visitor.setMother_name(cursor.getString(9));
                visitor.setRelation_with_criminal(cursor.getString(6));
                visitor.setDuration(cursor.getString(7));
                visitorList.add(visitor);
            }while(cursor.moveToNext());
        }

        return visitorList;

    }
}
