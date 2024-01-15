package com.example.moviethearter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayList<ModelClass> movies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.lisview);
        movies=new ArrayList<>();
        ModelClass film1= new ModelClass("THE WRONG HOUSE","SHAWN FRENSH","Brendan potter,shawn Frensh, Sue Stevens","2009",R.drawable.firstfilm);
        ModelClass film2= new ModelClass("THE JOB","SITCOM","MIKE MCNEIL","2001",R.drawable.secondfilm);
        ModelClass film3= new ModelClass("THE KING","YOUNG HENRY","TIMOTHEE CHALAMET,JOEL EDGERTON,ROBERT PATTINSON","2019",R.drawable.film3);
        ModelClass film4= new ModelClass("KING KONG","EDGAR WALLACE ","Andy Serkis, Naomi Watts, Jack Black, and Adrien Brody.","2005",R.drawable.film4);
        ModelClass film5= new ModelClass("BLOOD AND BONE","MICHAEL ANDREWS","Michael Jai White, Julian Sands, Eamonn Walker","2009",R.drawable.film5);
        ModelClass film6= new ModelClass("DETECTIVE","AARON ROSENBERG","Frank Sinatra","1966",R.drawable.film6);
        ModelClass film7= new ModelClass("AMAZON QUEEN","RICK CULLIS, MARLIN DARRAH, RICHARD LASSER","Carly Diamond Stone, Carson Grant","2021",R.drawable.film7);
        ModelClass film8= new ModelClass("SEDUCTION","VALANTINO BOMPIANI · LUISA MONTAGNANA","Romain Tomatos","1973",R.drawable.film8);
        ModelClass film9= new ModelClass("WIDING PLANER","ADAM SHANKMAN","Jennifer Lopez and Matthew McConaughey","2001",R.drawable.film9);
        movies.add(film1);
        movies.add(film2);
        movies.add(film3);
        movies.add(film4);
        movies.add(film5);
        movies.add(film6);
        movies.add(film7);
        movies.add(film8);
        movies.add(film9);

        CostumeAddapter costumeAddapter= new CostumeAddapter(this,movies);
        list.setAdapter(costumeAddapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ModelClass modelclass=costumeAddapter.getItem(position);
                Intent intent=new Intent(getApplicationContext(), Activityoffilm.class);
                intent.putExtra("name",modelclass.getTitle());
                intent.putExtra("image",modelclass.getResourseImage());
                intent.putExtra("year",modelclass.getYear());
                startActivity(intent);
                
            }
        });
    }






}