package com.example.thejasnanjunda.criminaldatabase;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thejas Nanjunda on 20-10-2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final int DB_version =25;

    private static final String DATABASE_NAME = "criminalDatabase";
    private void default_dependents(SQLiteDatabase db)
    {

        Dependents dependent1  =new Dependents(0, "A", "Male",  "24/06/1986","Father");
        this.addDependents(dependent1,db);
        Dependents dependent2  =new Dependents(1, "B", "Male",  "14/12/1988","Brother");
        this.addDependents(dependent2,db);
        Dependents dependent3  =new Dependents(2, "A", "Female","10/10/1991","Sister");
        this.addDependents(dependent3,db);
        Dependents dependent4  =new Dependents(3, "C", "Male",  "06/08/1984","Brother");
        this.addDependents(dependent4,db);
        Dependents dependent5  =new Dependents(4, "D", "Female","29/11/1990","Mother");
        this.addDependents(dependent5,db);
        Dependents dependent6  =new Dependents(5, "E", "Male",  "08/03/1980","Father");
        this.addDependents(dependent6,db);
        Dependents dependent7  =new Dependents(6, "A", "Female","20/08/1978","Sister");
        this.addDependents(dependent7,db);
        Dependents dependent8  =new Dependents(7, "C", "Female","11/05/1982","Mother");
        this.addDependents(dependent8,db);
        Dependents dependent9  =new Dependents(8, "B", "Male",  "24/12/1985","Brother");
        this.addDependents(dependent9,db);
        Dependents dependent10 =new Dependents(9, "D", "Male",  "16/06/1983","Brother");
        this.addDependents(dependent10,db);
        Dependents dependent11 =new Dependents(10,"E", "Male",  "22/11/1987","Father");
        this.addDependents(dependent11,db);
        Dependents dependent12 =new Dependents(11,"C", "Female","18/06/1988","Sister");
        this.addDependents(dependent12,db);
        Dependents dependent13 =new Dependents(12,"A", "Female","01/09/1991","Mother");
        this.addDependents(dependent13,db);
        Dependents dependent14 =new Dependents(13,"B", "Male",  "07/10/1990","Brother");
        this.addDependents(dependent14,db);
        Dependents dependent15 =new Dependents(14,"E", "Male",  "18/03/1989","Father");
        this.addDependents(dependent15,db);
        Dependents dependent16 =new Dependents(15,"D", "Male",  "12/02/1986","Brother");
        this.addDependents(dependent16,db);
        Dependents dependent17 =new Dependents(16,"D", "Female","28/01/1983","Sister");
        this.addDependents(dependent17,db);
        Dependents dependent18 =new Dependents(17,"B", "Male",  "15/01/1979","Father");
        this.addDependents(dependent18,db);
        Dependents dependent19 =new Dependents(18,"B", "Female","24/04/1978","Mother");
        this.addDependents(dependent19,db);
        Dependents dependent20 =new Dependents(19,"A", "Male",  "30/06/1980","Brother");
        this.addDependents(dependent20,db);
    }
    private void default_guards(SQLiteDatabase db)
    {
        Guard guard1  =new Guard(0,  "Nathen","L","Jacob",34,"A",40000.0,"24/06/1986","California","Florida","Martin","00:00:00","01:30:00");
        this.addGuards(guard1,db);
        Guard guard2  =new Guard(1,  "Christopher","O’lean","Sean",30,"B",30000.0,"14/12/1988","Italy","Florida","Sean","01:30:00","03:00:00");
        this.addGuards(guard2,db);
        Guard guard3  =new Guard(2,  "James","Turning","Arthur",28,"C",35000.0,"10/10/1991","Canberra","Sydney","Morrison","03:00:00","04:00:00");
        this.addGuards(guard3,db);
        Guard guard4  =new Guard(3,  "David","J","Ford",36,"A",40000.0,"06/08/1984","Sydney","Bangkok","Charles","04:00:00","05:00:00");
        this.addGuards(guard4,db);
        Guard guard5  =new Guard(4,  "Thomas","Ford","Knox",24,"E",45000.0,"29/11/1990","Washington","Miami","Kane","05:00:00","06:00:00");
        this.addGuards(guard5,db);
        Guard guard6  =new Guard(5,  "Kenneth","A","Fox",32,"D",50000.0,"08/03/1980","Melbourn","Florida","Silvester","06:00:00","08:00:00");
        this.addGuards(guard6,db);
        Guard guard7  =new Guard(6,  "Ross","H","Greyjoy",39,"D",50000.0,"20/08/1978","Miami","Washington","Stones","08:00:00","12:00:00");
        this.addGuards(guard7,db);
        Guard guard8  =new Guard(7,  "Morgan","K","Stark",36,"B",30000.0,"11/05/1982","Bangkok","Italy","Jhon","08:00:00","12:00:00");
        this.addGuards(guard8,db);
        Guard guard9  =new Guard(8,  "Jack","Iris","Lane",38,"A",40000.0,"24/12/1985","Brisbane","California","Rehager","08:00:00","12:00:00");
        this.addGuards(guard9,db);
        Guard guard10 =new Guard(9,  "Benjamin","Lewis","Khole",34,"C",35000.0,"16/06/1983","Canberra","Moscow","Carlos","12:00:00","16:00:00");
        this.addGuards(guard10,db);
        Guard guard11 =new Guard(10, "Sam","Donald","Juno",32,"E",45000.0,"22/11/1987","Miami","Sydney","Lucas","12:00:00","16:00:00");
        this.addGuards(guard11,db);
        Guard guard12 =new Guard(11, "Michael","T","Simon",31,"B",30000.0,"18/06/1988","Washington","Miami","Gavin","16:00:00","18:00:00");
        this.addGuards(guard12,db);
        Guard guard13 =new Guard(12, "Leo","Patrick","Eden",27,"C",35000.0,"01/09/1991","Italy","Melbourn","Jude","16:00:00","18:00:00");
        this.addGuards(guard13,db);
        Guard guard14 =new Guard(13, "Oliver","G","Williams",26,"D",50000.0,"07/10/1990","California","Brisbane","Sebastian","18:00:00","20:00:00");
        this.addGuards(guard14,db);
        Guard guard15 =new Guard(14, "Ryan","Colman","Bennett",30,"B",30000.0,"18/03/1989","California","Bangkok","Parker","18:00:00","20:00:00");
        this.addGuards(guard15,db);
        Guard guard16 =new Guard(15, "Theon","J","Ames",35,"A",40000.0,"12/02/1986","Italy","Canberra","Clark","20:00:00","22:00:00");
        this.addGuards(guard16,db);
        Guard guard17 =new Guard(16, "Harrison","Jay","Cohen",35,"E",45000.0,"28/01/1983","Sydney","Washington","Zen","20:00:00","22:00:00");
        this.addGuards(guard17,db);
        Guard guard18 =new Guard(17, "Freddie","O","Cohen",38,"C",35000.0,"15/01/1979","Bangkok","Florida","Maxim","20:00:00","22:00:00");
        this.addGuards(guard18,db);
        Guard guard19 =new Guard(18,"Stanley","De","Cortez",37,"D",50000.0,"24/04/1978","Washington","Sydney","Oliver","22:00:00","00:00:00");
        this.addGuards(guard19,db);
        Guard guard20 =new Guard(19,"Toby","Dom","Torreto",32,"E",45000.0,"30/06/1980","Brisbane","California","Kennedy","22:00:00","00:00:00");
        this.addGuards(guard20,db);
    }
    private void default_visitors(SQLiteDatabase db)
    {
        Visitor visitor1  = new Visitor(0,  "Percy","J","Mathew",28,"Florida",3,"Brother",6);
        this.addVisitor(visitor1,db);
        Visitor visitor2  = new Visitor(1,  "Nelson","T","John",32,"California",2,"Uncle",12);
        this.addVisitor(visitor2,db);
        Visitor visitor3  = new Visitor(2,  "Cairo","Kevin","Ryan",30,"Miami",2,"Uncle",18);
        this.addVisitor(visitor3,db);
        Visitor visitor4  = new Visitor(3,  "Miller","Nike","Shaw",26,"Newyork",4,"Brother",5);
        this.addVisitor(visitor4,db);
        Visitor visitor5  = new Visitor(4,  "Darwin","Ester","Xavier",40,"Washington",2,"Father",10);
        this.addVisitor(visitor5,db);
        Visitor visitor6  = new Visitor(5,  "Farrel","J","Luis",28,"Bangkok",2,"Brother",15);
        this.addVisitor(visitor6,db);
        Visitor visitor7  = new Visitor(6,  "Stan","R","Ortiz",36,"Miami",1,"Uncle",19);
        this.addVisitor(visitor7,db);
        Visitor visitor8  = new Visitor(7,  "Niles","A","Morrison",29,"Italy",3,"Uncle",0);
        this.addVisitor(visitor8,db);
        Visitor visitor9  = new Visitor(8,  "Lawson","Moma","Arthur",33,"Florida",1,"Father",3);
        this.addVisitor(visitor9,db);
        Visitor visitor10 = new Visitor(9,  "Colton","Leo","Stella",31,"California",3,"Brother",9);
        this.addVisitor(visitor10,db);
        Visitor visitor11 = new Visitor(10, "Ajay","M","Kumar",24,"Bangkok",3,"Brother",11);
        this.addVisitor(visitor11,db);
        Visitor visitor12 = new Visitor(11, "Luna","D","Emerson",45,"Washington",2,"Mother",2);
        this.addVisitor(visitor12,db);
        Visitor visitor13 = new Visitor(12, "Nora","Lester","Williams",20,"Florida",4,"Sister",1);
        this.addVisitor(visitor13,db);
        Visitor visitor14 = new Visitor(13, "Virginia","Dolby","Isabel",30,"Miami",1,"Aunt",4);
        this.addVisitor(visitor14,db);
        Visitor visitor15 = new Visitor(14, "Delphie","Martin","Dolcie",37,"Italy",1,"Aunt",7);
        this.addVisitor(visitor15,db);
        Visitor visitor16 = new Visitor(15, "Sofiya","R","Runo",43,"Newyork",3,"Mother",13);
        this.addVisitor(visitor16,db);
        Visitor visitor17 = new Visitor(16, "Mellody","Fay","Layne",28,"Bangkok",2,"Sister",17);
        this.addVisitor(visitor17,db);
        Visitor visitor18 = new Visitor(17, "Angelique","Torreto","Simon",46,"Miami",1,"Aunt",8);
        this.addVisitor(visitor18,db);
        Visitor visitor19 = new Visitor(18, "Sofie","R","Watson",24,"California",2,"Sister",14);
        this.addVisitor(visitor19,db);
        Visitor visitor20 = new Visitor(19, "Khaleesi","Denares","Stormborn",30,"Florida",1,"Aunt",16);
        this.addVisitor(visitor20,db);
    }
    public void default_criminals(SQLiteDatabase db)
    {

        Criminal criminal1  = new Criminal(0,"Tyson","M","Renolds",34,"16/09/1967","C","Florida","Zack","Lucy","Murder",15);
        this.addPrisoner(criminal1,db);
        Criminal criminal2  = new Criminal(1,"Zester","Cage","James",56,"09/02/1969","A","Bangkok","Arthur","Tina","Murder",15);
        this.addPrisoner(criminal2,db);
        Criminal criminal3  = new Criminal(2,"Rayn","G","Williams",60,"13/12/1958","B","Italy","Martin","Ellsa","Murder",15);
        this.addPrisoner(criminal3,db);
        Criminal criminal4  = new Criminal(3,"Carl","M","Ethan",28,"24/07/1989","B","Washington","George","Linda","Murder",15);
        this.addPrisoner(criminal4,db);
        Criminal criminal5  = new Criminal(4,"Tony","Reid","Mason",33,"15/11/1985","C","Melbourn","Alen","Maria","Kidnapping",7);
        this.addPrisoner(criminal5,db);
        Criminal criminal6  = new Criminal(5,"Sean","Kim","Harper",38,"22/09/1981","D","Gambia","Lucky","Kim","Double Murder",20);
        this.addPrisoner(criminal6,db);
        Criminal criminal7  = new Criminal(6,"Harman","J","Christopher",44,"20/03/1976","D","Newyork","Mia","Lucy","Murder",15);
        this.addPrisoner(criminal7,db);
        Criminal criminal8  = new Criminal(7,"Vincent","R","Khole",51,"26/08/1969","B","Bangkok","Tony","Tara","Theft",10);
        this.addPrisoner(criminal8,db);
        Criminal criminal9  = new Criminal(8,"Carlos","D","Danial",47,"06/05/1979","A","Florida","Karl","Kristen","Shoplifting",7);
        this.addPrisoner(criminal9,db);
        Criminal criminal10 = new Criminal(9,"Justin","T","Mandis",62,"15/01/1954","E","Florida","Nolan","Lesley","Attempt to Murder",4);
        this.addPrisoner(criminal10,db);
        Criminal criminal11 = new Criminal(10,"Martin","Jay","Nolan",48,"29/03/1973","E","Gambia","Carl","Rita","Murder",15);
        this.addPrisoner(criminal11,db);
        Criminal criminal12 = new Criminal(11,"George","P","Philip",59,"04/10/1967","A","Spain","Austin","Preeti","Theft",5);
        this.addPrisoner(criminal12,db);
        Criminal criminal13 = new Criminal(12,"Kristen","Sean","Michael",65,"16/10/1964","E","Miami","Ethan","Angel","Double Murder",20);
        this.addPrisoner(criminal13,db);
        Criminal criminal14 = new Criminal(13,"Andreu","K","Nora",27,"23/09/1989","C","Bangkok","Danial","Sonali","Murder",15);
        this.addPrisoner(criminal14,db);
        Criminal criminal15 = new Criminal(14,"Patrick","J","Cooper",33,"20/04/1984","D","Madrid","Williams","Sandra","Kidnapping",15);
        this.addPrisoner(criminal15,db);
        Criminal criminal16 = new Criminal(15,"Ulman","T","Madison",49,"14/03/1972","A","Rome","Blake","Priestin","Theft",10);
        this.addPrisoner(criminal16,db);
        Criminal criminal17 = new Criminal(16,"Austin","Karl","Hudson",42,"19/06/1968","B","Paris","Patrick","Bella","Shop Lifting",7);
        this.addPrisoner(criminal17,db);
        Criminal criminal18 = new Criminal(17,"Alexander","T","Blake",56,"12/07/1961","E","Bangkok","Sean","Briean","Murder",20);
        this.addPrisoner(criminal18,db);
        Criminal criminal19 = new Criminal(18,"Pablo","Gaveria","Escobar",26,"27/11/1990","D","Newyork","Jhon","Arya","Kidnapping",10);
        this.addPrisoner(criminal19,db);
        Criminal criminal20 = new Criminal(19,"Zack","Kamlesh","Hunter",38,"10/01/1983","B","Bangkok","Jacky","Cathrin","Theft",7);
        this.addPrisoner(criminal20,db);
    }
    // prisoner table column names
    public static final String TABLE_CRIMINAL = "PRISONERS";
    public static final String P_UID = "uid";
    public static final String PF_NAME ="f_name";
    public static final String PL_NAME = "m_name";
    public static final String PM_NAME = "l_name";
    public static final String P_AGE = "age";
    public static final String P_DOB = "DOB";
    public static final String P_CELL = "cell_block";
    public static final String P_CADDR = "curr_address";
    public static final String P_FATHER = "father_name", P_MOTHER = "mother_name";
    public static final String P_CRIMES = "crimes";
    public static final String P_SENTENCE = "sentence";


    // guards table column names

    public static final String TABLE_GUARDS = "GUARDS";
    public static final String G_UID = "uid";
    public static final String GF_NAME ="f_name";
   public static final String GL_NAME = "m_name";
    public static final String GM_NAME = "l_name";
    public static final String G_AGE = "age";
    public static final String G_CELL = "cell_block";
    public static final String G_SALARY = "salary";
    public static final  String G_DOB = "DOB";
    public static final String G_LAddr = "last_address";
    public static final String G_CADDR = "curr_address";
    public static final String G_FATHER = "father_name";
    //        P_MOTHER = "mother_name";
    public static final String G_FROMTIME = "from_time";
    public static final String G_TOTIME = " to_time";


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
    private static final String V_CID = "cid";

    //columns for Dependents

    private static final String TABLE_DEPENDENTS="DEPENDENT";
    private static final String D_UID = "uid";
    private static final String D_NAME ="name";
    private static final String D_Gender= "gender";
    private static final String D_bdate = "b_date";
    private static final String D_relationship = "relationship";



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
                + P_CELL + " TEXT," + P_CADDR + " TEXT,"
                + P_FATHER + " TEXT," + P_MOTHER + " TEXT,"
                + P_CRIMES + " TEXT,"
                + P_SENTENCE + " INTEGER)";
        db.execSQL(CREATE_PRISONER_TABLE);

        String CREATE_GUARDS_TABLE = "CREATE TABLE " + TABLE_GUARDS + "("
                + G_UID + " INTEGER PRIMARY KEY,"
                + GF_NAME + " TEXT," + GM_NAME + " TEXT," + GL_NAME + " TEXT,"
                + G_AGE + " INTEGER," + G_CELL + " TEXT," + G_SALARY + " INTEGER,"+ G_DOB + " TEXT,"
                + G_LAddr + " TEXT," + G_CADDR + " TEXT,"
                + G_FATHER + " TEXT,"
                + G_FROMTIME + " TEXT," + G_TOTIME + " TEXT)";
        db.execSQL(CREATE_GUARDS_TABLE);

        String CREATE_VISITORS_TABLE = "CREATE TABLE " + TABLE_VISITORS + "("
                + V_UID + " INTEGER PRIMARY KEY,"
                + VF_NAME + " TEXT," + VM_NAME + " TEXT," + VL_NAME + " TEXT,"
                + V_AGE + " INTEGER,"+ V_CADDR + " TEXT,"+ V_DURATION + " INTEGER,"
                + V_RELATION + " TEXT," + V_CID + " INTEGER)";

        db.execSQL(CREATE_VISITORS_TABLE);

        String CREATE_DEPENDENTS_TABLE = "CREATE TABLE " + TABLE_DEPENDENTS + "("
                + D_UID + " INTEGER PRIMARY KEY,"
                + D_NAME + " TEXT," + D_Gender + " TEXT," + D_bdate + " TEXT,"
                + D_relationship + " TEXT)";

        db.execSQL(CREATE_DEPENDENTS_TABLE);
        //default_guards();
        this.default_criminals(db);
        this.default_guards(db);
        this.default_visitors(db);
        this.default_dependents(db);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CRIMINAL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_VISITORS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_GUARDS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DEPENDENTS);

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
        values.put(G_CELL,guard.getGcell_block());
        values.put(G_SALARY,guard.getGsalary());
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
        //Toast.makeText(, "inserted guard", Toast.LENGTH_SHORT).show();
    }
    public void addGuards(Guard guard,SQLiteDatabase db)
    {

        ContentValues values = new ContentValues();
        values.put(G_UID,guard.getUID());
        values.put(GF_NAME,guard.getGf_name());
        values.put(GM_NAME,guard.getGm_name());
        values.put(GL_NAME,guard.getGl_name());
        values.put(G_AGE,guard.getGage());
        values.put(G_CELL,guard.getGcell_block());
        values.put(G_SALARY,guard.getGsalary());
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
        //Toast.makeText(, "inserted guard", Toast.LENGTH_SHORT).show();
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
        values.put(P_CELL,criminal.getCell_block());
        values.put(P_CADDR,criminal.getCurr_address());
        values.put(P_FATHER,criminal.getFather_name());
        values.put(P_MOTHER,criminal.getMother_name());
        values.put(P_CRIMES,criminal.getCrimes());
        values.put(P_SENTENCE,criminal.getCurrent_prison_sentence());
        db.insert(TABLE_CRIMINAL,null,values);
    }
    public void addPrisoner(Criminal criminal,SQLiteDatabase db)
    {
        ContentValues values = new ContentValues();
        values.put(P_UID,criminal.getUID());
        values.put(PF_NAME,criminal.getF_name());
        values.put(PM_NAME,criminal.getM_name());
        values.put(PL_NAME,criminal.getL_name());
        values.put(P_AGE,criminal.getAge());
        values.put(P_DOB,criminal.getDOB());
        values.put(P_CELL,criminal.getCell_block());
        values.put(P_CADDR,criminal.getCurr_address());
        values.put(P_FATHER,criminal.getFather_name());
        values.put(P_MOTHER,criminal.getMother_name());
        values.put(P_CRIMES,criminal.getCrimes());
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
                guard.setGcell_block(cursor.getString(5));
                guard.setGsalary(Double.parseDouble(cursor.getString(6)));
                guard.setGDOB(cursor.getString(7));
                guard.setGlast_address(cursor.getString(8));
                guard.setGcurr_address(cursor.getString(9));
                guard.setGfather_name(cursor.getString(10));
                guard.setFromTime(cursor.getString(11));
                guard.setToTime(cursor.getString(12));
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
        values.put(V_DURATION,visitor.getDuration());
        values.put(V_RELATION,visitor.getRelation_with_criminal());
        values.put(V_CID,visitor.getCriminal_id());
        db.insert(TABLE_VISITORS,null,values);


    }
    public void addVisitor(Visitor visitor,SQLiteDatabase db) {

        ContentValues values = new ContentValues();
        values.put(V_UID,visitor.getVisitor_id());
        values.put(VF_NAME,visitor.getVf_name());
        values.put(VM_NAME,visitor.getVm_name());
        values.put(VL_NAME,visitor.getVl_name());
        values.put(V_AGE,visitor.getV_age());
        values.put(V_CADDR,visitor.getV_address());
        values.put(V_DURATION,visitor.getDuration());
        values.put(V_RELATION,visitor.getRelation_with_criminal());
        values.put(V_CID,visitor.getCriminal_id());
        db.insert(TABLE_VISITORS,null,values);


    }
    public void addDependents(Dependents dependents){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(D_UID,dependents.getGUID());
        values.put(D_NAME,dependents.getCell_block());
        values.put(D_Gender,dependents.getGender());
        values.put(D_bdate,dependents.getB_date());
        values.put(D_relationship,dependents.getRelationship());
        db.insert(TABLE_DEPENDENTS,null,values);

    }
    public void addDependents(Dependents dependents,SQLiteDatabase db){

        ContentValues values = new ContentValues();
        values.put(D_UID,dependents.getGUID());
        values.put(D_NAME,dependents.getCell_block());
        values.put(D_Gender,dependents.getGender());
        values.put(D_bdate,dependents.getB_date());
        values.put(D_relationship,dependents.getRelationship());
        db.insert(TABLE_DEPENDENTS,null,values);

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
                criminal.setCell_block(cursor.getString(6));
                criminal.setCurr_address(cursor.getString(7));
                criminal.setFather_name(cursor.getString(8));
                criminal.setMother_name(cursor.getString(9));
                criminal.setCrimes(cursor.getString(10));
                criminal.setCurrent_prison_sentence(Integer.parseInt(cursor.getString(11)));
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
                //     visitor.setCell_block(cursor.getString(6));
                visitor.setV_address(cursor.getString(5));
                // visitor.setFather_name(cursor.getString(8));
                //visitor.setMother_name(cursor.getString(9));
                visitor.setDuration(Integer.parseInt(cursor.getString(6)));
                visitor.setRelation_with_criminal(cursor.getString(7));

                visitor.setCriminal_id(Integer.parseInt(cursor.getString(8)));
                visitorList.add(visitor);
            }while(cursor.moveToNext());
        }

        return visitorList;

    }
    public List<Dependents> getAllDependents() {
        List<Dependents> dependentsList = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_DEPENDENTS;
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Dependents dependents = new Dependents();
                dependents.setGUID(Integer.parseInt(cursor.getString(0)));
                dependents.setCell_block(cursor.getString(1));
                dependents.setGender(cursor.getString(2));
                dependents.setB_date(cursor.getString(3));
                dependents.setRelationship(cursor.getString(4));
                // visitor.setFather_name(cursor.getString(8));
                //visitor.setMother_name(cursor.getString(9));

                dependentsList.add(dependents);
            } while (cursor.moveToNext());
        }

        return dependentsList;

    }

    Cursor viewQuery1(String check_val){
        //someGuards();
        String query1 = "SELECT rowid _id,f_name,m_name,l_name FROM " + TABLE_GUARDS + " WHERE age >" + check_val;
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(query1,null);
        if(cursor != null)
            cursor.moveToFirst();
        return cursor;

    }
    public void updateGuard(String guard_id,String cell) {
        SQLiteDatabase sp = getWritableDatabase();
        sp.execSQL("UPDATE " + TABLE_GUARDS + " SET " + G_CELL +"='"+cell+"'"+ " WHERE " + G_UID + "=" + guard_id);
        sp.close();
    }

    public void updateCriminal(String criminal_id,String sentence) {
        SQLiteDatabase sp = getWritableDatabase();
        sp.execSQL("UPDATE " + TABLE_CRIMINAL + "SET " + P_SENTENCE  + "= '" + sentence +"'" + " WHERE " + P_UID + "=" + criminal_id);
        sp.close();
    }

    public void deleteCriminal(String criminal_uid) {
        SQLiteDatabase sp = getWritableDatabase();
        sp.execSQL("DELETE FROM " + TABLE_CRIMINAL + " WHERE " + P_UID + "=" + criminal_uid);
        sp.close();
    }

    public void deleteGuard(String guard_uid) {
        SQLiteDatabase sp = getWritableDatabase();
        sp.execSQL("DELETE FROM " + TABLE_GUARDS + " WHERE " + G_UID + "=" + guard_uid);
        sp.close();
    }

    public void deleteVisitor(String visitor_uid) {
        SQLiteDatabase sp = getWritableDatabase();
        sp.execSQL("DELETE FROM " + TABLE_VISITORS + " WHERE " + V_UID + "=" + visitor_uid);
        sp.close();
    }

    public void updateDependents(Dependents dependents) {

        /*
            add new update statement with optional argument strings
         */
        //String query = " UPDATE " + TABLE_VISITORS
    }
    public Cursor viewQuery2(String check_val)
    {
        String query1 = "SELECT rowid _id,f_name,m_name,l_name FROM " + TABLE_CRIMINAL + " WHERE cell_block = '" + check_val + "'";
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(query1,null);
        if(cursor != null)
            cursor.moveToFirst();
        return cursor;
    }
    public Cursor viewQuery3(String check_val)
    {
        String query1 = "SELECT rowid _id,f_name,crimes,sentence FROM " + TABLE_CRIMINAL + " WHERE crimes = '" + check_val + "'";
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(query1,null);
        if(cursor != null)
            cursor.moveToFirst();
        return cursor;
    }


    public Cursor min_guard_sal(){
        SQLiteDatabase sal=getWritableDatabase();
        Cursor cursor = sal.rawQuery("SELECT " + " MIN (salary) FROM " + TABLE_GUARDS,null);
        if(cursor!=null)
            cursor.moveToFirst();
        return cursor;

    }
    public Cursor avg_guard_age(){
        SQLiteDatabase age=getWritableDatabase();
        Cursor cursor = age.rawQuery("SELECT " + " AVG(age) FROM " + TABLE_GUARDS,null);
        if(cursor!=null)
            cursor.moveToFirst();
        return cursor;
    }
    public Cursor guard_dependents(){
        SQLiteDatabase dep=getWritableDatabase();
        Cursor cursor = dep.rawQuery("SELECT COUNT(*) FROM "+TABLE_GUARDS+" AS G WHERE G.uid NOT IN (SELECT D.uid FROM "+TABLE_DEPENDENTS+ " AS D)",null);
        if(cursor!=null)
            cursor.moveToFirst();
        return cursor;
    }

    public Cursor visitor_duration(){
        SQLiteDatabase up=getWritableDatabase();
        Cursor cursor = up.rawQuery("SELECT MAX (" + V_DURATION + ") FROM " + TABLE_VISITORS,null);
        if(cursor!=null)
            cursor.moveToFirst();
        return cursor;
    }
}
