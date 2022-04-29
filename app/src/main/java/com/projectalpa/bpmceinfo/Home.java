package com.projectalpa.bpmceinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    public CardView result,notice,placement,techerinfo,collegeinfo,csevar,civilvar,mechvar,eeevar;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        CardView timetable=findViewById(R.id.timetablecard);
         result=findViewById(R.id.resultcard);
        notice=findViewById(R.id.noticecard);
       placement=findViewById(R.id.placementinfocard);
       techerinfo=findViewById(R.id.teacherinfocard);
        collegeinfo=findViewById(R.id.collegeinfocard);
        csevar=findViewById(R.id.CSE);
        civilvar=findViewById(R.id.Civil);
        mechvar=findViewById(R.id.Mech);
        eeevar=findViewById(R.id.EEE);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle("HOME");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_menu_24);
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        timetable.setOnClickListener(view -> {
            Intent intent = new Intent(Home.this,Time_Table.class);
            startActivity(intent);
        });

        result.setOnClickListener(view -> {
            intent = new Intent(Home.this,Result.class);
            startActivity(intent);
        });

        collegeinfo.setOnClickListener(view -> {
            intent = new Intent(Home.this,College_info.class);
            startActivity(intent);
        });

        notice.setOnClickListener(view -> {
            intent = new Intent(Home.this,Notice.class);
            startActivity(intent);
        });

        placement.setOnClickListener(view -> {
            intent = new Intent(Home.this,placement_info.class);
            startActivity(intent);
        });

        techerinfo.setOnClickListener(view -> {
            intent = new Intent(Home.this,Techer_info.class);
            startActivity(intent);
        });

        csevar.setOnClickListener(view -> {
            intent = new Intent(Home.this,CSE_syllbus.class);
            startActivity(intent);
        });

        mechvar.setOnClickListener(view -> {
            intent = new Intent(Home.this,Mech_sylbus.class);
            startActivity(intent);
        });

        civilvar.setOnClickListener(view -> {
            intent = new Intent(Home.this,Civil_syllabus.class);
            startActivity(intent);
        });

        eeevar.setOnClickListener(view -> {
            intent = new Intent(Home.this,EEE.class);
            startActivity(intent);
        });


    }
}