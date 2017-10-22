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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thejas Nanjunda on 20-10-2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final int DB_version =3;

    private static final String DATABASE_NAME = "criminalDatabase";
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

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DB_version);
    }

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_PRISONER_TABLE = "CREATE TABLE " + TABLE_CRIMINAL + "("
                + P_UID + " INTEGER ,"
                + PF_NAME + " TEXT," + PM_NAME + " TEXT," + PL_NAME + " TEXT,"
                + P_AGE + " INTEGER," + P_DOB + " TEXT,"
                + P_LAddr + " TEXT," + P_CADDR + " TEXT,"
                + P_FATHER + " TEXT," + P_MOTHER + " TEXT,"
                + P_RELATIVE + " TEXT," + P_CRIMES + " TEXT,"
                + P_ASSOC + " TEXT," + P_SENTENCE + " INTEGER)";
        db.execSQL(CREATE_PRISONER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CRIMINAL);
        onCreate(db);
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
}
