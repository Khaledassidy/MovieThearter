package com.example.moviethearter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activityoffilm extends AppCompatActivity {
    String namefilm;
    int filmimage;
    String yeardisplay;

    ImageView imagefilm;
    Button play;
    TextView title;

    TextView year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityoffilm);
        imagefilm=findViewById(R.id.imagefilm);
        play=findViewById(R.id.playmovie);
        title=findViewById(R.id.namefilm);
        year=findViewById(R.id.yearfilm);
        Intent intent=getIntent();
        namefilm=intent.getStringExtra("name");
        filmimage=intent.getIntExtra("image",0);
        yeardisplay=intent.getStringExtra("year");
        imagefilm.setBackgroundResource(filmimage);
        title.setText(namefilm+"");
        year.setText(yeardisplay+"");







    }
}