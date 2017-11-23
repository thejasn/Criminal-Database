package com.example.thejasnanjunda.criminaldatabase;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button insert,search,view,delete,update;
    private void default_dependents()
    {
        DBHelper db = new DBHelper(this);
        Dependents dependent1  =new Dependents(0, "A", "Male",  "24/06/1986","Father");
        db.addDependents(dependent1);
        Dependents dependent2  =new Dependents(1, "B", "Male",  "14/12/1988","Brother");
        db.addDependents(dependent2);
        Dependents dependent3  =new Dependents(2, "A", "Female","10/10/1991","Sister");
        db.addDependents(dependent3);
        Dependents dependent4  =new Dependents(3, "C", "Male",  "06/08/1984","Brother");
        db.addDependents(dependent4);
        Dependents dependent5  =new Dependents(4, "D", "Female","29/11/1990","Mother");
        db.addDependents(dependent5);
        Dependents dependent6  =new Dependents(5, "E", "Male",  "08/03/1980","Father");
        db.addDependents(dependent6);
        Dependents dependent7  =new Dependents(6, "A", "Female","20/08/1978","Sister");
        db.addDependents(dependent7);
        Dependents dependent8  =new Dependents(7, "C", "Female","11/05/1982","Mother");
        db.addDependents(dependent8);
        Dependents dependent9  =new Dependents(8, "B", "Male",  "24/12/1985","Brother");
        db.addDependents(dependent9);
        Dependents dependent10 =new Dependents(9, "D", "Male",  "16/06/1983","Brother");
        db.addDependents(dependent10);
        Dependents dependent11 =new Dependents(10,"E", "Male",  "22/11/1987","Father");
        db.addDependents(dependent11);
        Dependents dependent12 =new Dependents(11,"C", "Female","18/06/1988","Sister");
        db.addDependents(dependent12);
        Dependents dependent13 =new Dependents(12,"A", "Female","01/09/1991","Mother");
        db.addDependents(dependent13);
        Dependents dependent14 =new Dependents(13,"B", "Male",  "07/10/1990","Brother");
        db.addDependents(dependent14);
        Dependents dependent15 =new Dependents(14,"E", "Male",  "18/03/1989","Father");
        db.addDependents(dependent15);
        Dependents dependent16 =new Dependents(15,"D", "Male",  "12/02/1986","Brother");
        db.addDependents(dependent16);
        Dependents dependent17 =new Dependents(16,"D", "Female","28/01/1983","Sister");
        db.addDependents(dependent17);
        Dependents dependent18 =new Dependents(17,"B", "Male",  "15/01/1979","Father");
        db.addDependents(dependent18);
        Dependents dependent19 =new Dependents(18,"B", "Female","24/04/1978","Mother");
        db.addDependents(dependent19);
        Dependents dependent20 =new Dependents(19,"A", "Male",  "30/06/1980","Brother");
        db.addDependents(dependent20);
    }
    private void default_guards()
    {
        DBHelper db = new DBHelper(this);
        Guard guard1  =new Guard(0,  "Nathen","L","Jacob",34,"A",40000.0,"24/06/1986","California","Florida","Martin","00:00:00","01:30:00");
        db.addGuards(guard1);
        Guard guard2  =new Guard(1,  "Christopher","O’lean","Sean",30,"B",30000.0,"14/12/1988","Italy","Florida","Sean","01:30:00","03:00:00");
        db.addGuards(guard2);
        Guard guard3  =new Guard(2,  "James","Turning","Arthur",28,"C",35000.0,"10/10/1991","Canberra","Sydney","Morrison","03:00:00","04:00:00");
        db.addGuards(guard3);
        Guard guard4  =new Guard(3,  "David","J","Ford",36,"A",40000.0,"06/08/1984","Sydney","Bangkok","Charles","04:00:00","05:00:00");
        db.addGuards(guard4);
        Guard guard5  =new Guard(4,  "Thomas","Ford","Knox",24,"E",45000.0,"29/11/1990","Washington","Miami","Kane","05:00:00","06:00:00");
        db.addGuards(guard5);
        Guard guard6  =new Guard(5,  "Kenneth","A","Fox",32,"D",50000.0,"08/03/1980","Melbourn","Florida","Silvester","06:00:00","08:00:00");
        db.addGuards(guard6);
        Guard guard7  =new Guard(6,  "Ross","H","Greyjoy",39,"D",50000.0,"20/08/1978","Miami","Washington","Stones","08:00:00","12:00:00");
        db.addGuards(guard7);
        Guard guard8  =new Guard(7,  "Morgan","K","Stark",36,"B",30000.0,"11/05/1982","Bangkok","Italy","Jhon","08:00:00","12:00:00");
        db.addGuards(guard8);
        Guard guard9  =new Guard(8,  "Jack","Iris","Lane",38,"A",40000.0,"24/12/1985","Brisbane","California","Rehager","08:00:00","12:00:00");
        db.addGuards(guard9);
        Guard guard10 =new Guard(9,  "Benjamin","Lewis","Khole",34,"C",35000.0,"16/06/1983","Canberra","Moscow","Carlos","12:00:00","16:00:00");
        db.addGuards(guard10);
        Guard guard11 =new Guard(10, "Sam","Donald","Juno",32,"E",45000.0,"22/11/1987","Miami","Sydney","Lucas","12:00:00","16:00:00");
        db.addGuards(guard11);
        Guard guard12 =new Guard(11, "Michael","T","Simon",31,"B",30000.0,"18/06/1988","Washington","Miami","Gavin","16:00:00","18:00:00");
        db.addGuards(guard12);
        Guard guard13 =new Guard(12, "Leo","Patrick","Eden",27,"C",35000.0,"01/09/1991","Italy","Melbourn","Jude","16:00:00","18:00:00");
        db.addGuards(guard13);
        Guard guard14 =new Guard(13, "Oliver","G","Williams",26,"D",50000.0,"07/10/1990","California","Brisbane","Sebastian","18:00:00","20:00:00");
        db.addGuards(guard14);
        Guard guard15 =new Guard(14, "Ryan","Colman","Bennett",30,"B",30000.0,"18/03/1989","California","Bangkok","Parker","18:00:00","20:00:00");
        db.addGuards(guard15);
        Guard guard16 =new Guard(15, "Theon","J","Ames",35,"A",40000.0,"12/02/1986","Italy","Canberra","Clark","20:00:00","22:00:00");
        db.addGuards(guard16);
        Guard guard17 =new Guard(16, "Harrison","Jay","Cohen",35,"E",45000.0,"28/01/1983","Sydney","Washington","Zen","20:00:00","22:00:00");
        db.addGuards(guard17);
        Guard guard18 =new Guard(17, "Freddie","O","Cohen",38,"C",35000.0,"15/01/1979","Bangkok","Florida","Maxim","20:00:00","22:00:00");
        db.addGuards(guard18);
        Guard guard19 =new Guard(18,"Stanley","De","Cortez",37,"D",50000.0,"24/04/1978","Washington","Sydney","Oliver","22:00:00","00:00:00");
        db.addGuards(guard19);
        Guard guard20 =new Guard(19,"Toby","Dom","Torreto",32,"E",45000.0,"30/06/1980","Brisbane","California","Kennedy","22:00:00","00:00:00");
        db.addGuards(guard20);
    }
    private void default_visitors()
    {
        DBHelper db = new DBHelper(this);
        Visitor visitor1  = new Visitor(0,  "Percy","J","Mathew",28,"Florida",3,"Brother",6);
        db.addVisitor(visitor1);
        Visitor visitor2  = new Visitor(1,  "Nelson","T","John",32,"California",2,"Uncle",12);
        db.addVisitor(visitor2);
        Visitor visitor3  = new Visitor(2,  "Cairo","Kevin","Ryan",30,"Miami",2,"Uncle",18);
        db.addVisitor(visitor3);
        Visitor visitor4  = new Visitor(3,  "Miller","Nike","Shaw",26,"Newyork",4,"Brother",5);
        db.addVisitor(visitor4);
        Visitor visitor5  = new Visitor(4,  "Darwin","Ester","Xavier",40,"Washington",2,"Father",10);
        db.addVisitor(visitor5);
        Visitor visitor6  = new Visitor(5,  "Farrel","J","Luis",28,"Bangkok",2,"Brother",15);
        db.addVisitor(visitor6);
        Visitor visitor7  = new Visitor(6,  "Stan","R","Ortiz",36,"Miami",1,"Uncle",19);
        db.addVisitor(visitor7);
        Visitor visitor8  = new Visitor(7,  "Niles","A","Morrison",29,"Italy",3,"Uncle",0);
        db.addVisitor(visitor8);
        Visitor visitor9  = new Visitor(8,  "Lawson","Moma","Arthur",33,"Florida",1,"Father",3);
        db.addVisitor(visitor9);
        Visitor visitor10 = new Visitor(9,  "Colton","Leo","Stella",31,"California",3,"Brother",9);
        db.addVisitor(visitor10);
        Visitor visitor11 = new Visitor(10, "Ajay","M","Kumar",24,"Bangkok",3,"Brother",11);
        db.addVisitor(visitor11);
        Visitor visitor12 = new Visitor(11, "Luna","D","Emerson",45,"Washington",2,"Mother",2);
        db.addVisitor(visitor12);
        Visitor visitor13 = new Visitor(12, "Nora","Lester","Williams",20,"Florida",4,"Sister",1);
        db.addVisitor(visitor13);
        Visitor visitor14 = new Visitor(13, "Virginia","Dolby","Isabel",30,"Miami",1,"Aunt",4);
        db.addVisitor(visitor14);
        Visitor visitor15 = new Visitor(14, "Delphie","Martin","Dolcie",37,"Italy",1,"Aunt",7);
        db.addVisitor(visitor15);
        Visitor visitor16 = new Visitor(15, "Sofiya","R","Runo",43,"Newyork",3,"Mother",13);
        db.addVisitor(visitor16);
        Visitor visitor17 = new Visitor(16, "Mellody","Fay","Layne",28,"Bangkok",2,"Sister",17);
        db.addVisitor(visitor17);
        Visitor visitor18 = new Visitor(17, "Angelique","Torreto","Simon",46,"Miami",1,"Aunt",8);
        db.addVisitor(visitor18);
        Visitor visitor19 = new Visitor(18, "Sofie","R","Watson",24,"California",2,"Sister",14);
        db.addVisitor(visitor19);
        Visitor visitor20 = new Visitor(19, "Khaleesi","Denares","Stormborn",30,"Florida",1,"Aunt",16);
        db.addVisitor(visitor20);
    }
    private void default_criminals()
    {
        DBHelper dbHelper = new DBHelper(this);
        Criminal criminal1  = new Criminal(0,"Tyson","M","Renolds",34,"16/09/1967","C","Florida","Zack","Lucy","Murder",15);
        dbHelper.addPrisoner(criminal1);
        Criminal criminal2  = new Criminal(1,"Zester","Cage","James",56,"09/02/1969","A","Bangkok","Arthur","Tina","Murder",15);
        dbHelper.addPrisoner(criminal2);
        Criminal criminal3  = new Criminal(2,"Rayn","G","Williams",60,"13/12/1958","B","Italy","Martin","Ellsa","Murder",15);
        dbHelper.addPrisoner(criminal3);
        Criminal criminal4  = new Criminal(3,"Carl","M","Ethan",28,"24/07/1989","B","Washington","George","Linda","Murder",15);
        dbHelper.addPrisoner(criminal4);
        Criminal criminal5  = new Criminal(4,"Tony","Reid","Mason",33,"15/11/1985","C","Melbourn","Alen","Maria","Kidnapping",7);
        dbHelper.addPrisoner(criminal5);
        Criminal criminal6  = new Criminal(5,"Sean","Kim","Harper",38,"22/09/1981","D","Gambia","Lucky","Kim","Double Murder",20);
        dbHelper.addPrisoner(criminal6);
        Criminal criminal7  = new Criminal(6,"Harman","J","Christopher",44,"20/03/1976","D","Newyork","Mia","Lucy","Murder",15);
        dbHelper.addPrisoner(criminal7);
        Criminal criminal8  = new Criminal(7,"Vincent","R","Khole",51,"26/08/1969","B","Bangkok","Tony","Tara","Theft",10);
        dbHelper.addPrisoner(criminal8);
        Criminal criminal9  = new Criminal(8,"Carlos","D","Danial",47,"06/05/1979","A","Florida","Karl","Kristen","Shoplifting",7);
        dbHelper.addPrisoner(criminal9);
        Criminal criminal10 = new Criminal(9,"Justin","T","Mandis",62,"15/01/1954","E","Florida","Nolan","Lesley","Attempt to Murder",4);
        dbHelper.addPrisoner(criminal10);
        Criminal criminal11 = new Criminal(10,"Martin","Jay","Nolan",48,"29/03/1973","E","Gambia","Carl","Rita","Murder",15);
        dbHelper.addPrisoner(criminal11);
        Criminal criminal12 = new Criminal(11,"George","P","Philip",59,"04/10/1967","A","Spain","Austin","Preeti","Theft",5);
        dbHelper.addPrisoner(criminal12);
        Criminal criminal13 = new Criminal(12,"Kristen","Sean","Michael",65,"16/10/1964","E","Miami","Ethan","Angel","Double Murder",20);
        dbHelper.addPrisoner(criminal13);
        Criminal criminal14 = new Criminal(13,"Andreu","K","Nora",27,"23/09/1989","C","Bangkok","Danial","Sonali","Murder",15);
        dbHelper.addPrisoner(criminal14);
        Criminal criminal15 = new Criminal(14,"Patrick","J","Cooper",33,"20/04/1984","D","Madrid","Williams","Sandra","Kidnapping",15);
        dbHelper.addPrisoner(criminal15);
        Criminal criminal16 = new Criminal(15,"Ulman","T","Madison",49,"14/03/1972","A","Rome","Blake","Priestin","Theft",10);
        dbHelper.addPrisoner(criminal16);
        Criminal criminal17 = new Criminal(16,"Austin","Karl","Hudson",42,"19/06/1968","B","Paris","Patrick","Bella","Shop Lifting",7);
        dbHelper.addPrisoner(criminal17);
        Criminal criminal18 = new Criminal(17,"Alexander","T","Blake",56,"12/07/1961","E","Bangkok","Sean","Briean","Murder",20);
        dbHelper.addPrisoner(criminal18);
        Criminal criminal19 = new Criminal(18,"Pablo","Gaveria","Escobar",26,"27/11/1990","D","Newyork","Jhon","Arya","Kidnapping",10);
        dbHelper.addPrisoner(criminal19);
        Criminal criminal20 = new Criminal(19,"Zack","Kamlesh","Hunter",38,"10/01/1983","B","Bangkok","Jacky","Cathrin","Theft",7);
        dbHelper.addPrisoner(criminal20);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        insert = (Button) findViewById(R.id.Insert);
        search = (Button) findViewById(R.id.Search);
        view  = (Button) findViewById(R.id.view);
        delete = (Button) findViewById(R.id.Delete);
        update= (Button) findViewById(R.id.update);
        Intent i = getIntent();
        if(i.getStringExtra("user").equals("normal"))
        {
            insert.setVisibility(View.INVISIBLE);
            delete.setVisibility(View.INVISIBLE);
            update.setVisibility(View.INVISIBLE);
            insert.setEnabled(false);
            delete.setEnabled(false);
            update.setEnabled(false);
        }
        SharedPreferences sp = getApplicationContext().getSharedPreferences("SAVED_UID",MODE_PRIVATE);
        if(!sp.contains("PRISONER_uid"))
        {
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("PRISONER_UID",20);
            editor.commit();
        }
        if(!sp.contains("GUARD_uid"))
        {
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("GUARD_UID",20);
            editor.commit();
        }
        if(!sp.contains("VISITOR_uid"))
        {
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("VISITOR_UID",20);
            editor.commit();
        }
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //default_guards();
                //default_criminals();
                //default_visitors();
                //default_dependents();
                startActivity(new Intent(Menu.this,Inserting.class));

            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Searching.class));
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Viewing.class));
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Deleting.class));
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Updating.class));
            }
        });
    }

}
