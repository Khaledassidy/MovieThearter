package com.example.moviethearter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CostumeAddapter extends ArrayAdapter<ModelClass> {
    Context context;
    ArrayList<ModelClass> Movies;

    public CostumeAddapter(Context context,ArrayList<ModelClass> Movies){
        super(context,R.layout.movieaddapter,Movies);
        this.context=context;
        this.Movies=Movies;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Viewholder holder;
        ModelClass movie=getItem(position);
        final View Result;
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.movieaddapter,parent,false);

            holder=new Viewholder();
            holder.imageFilm=convertView.findViewById(R.id.imageFilm);
            holder.Author=convertView.findViewById(R.id.Author);
            holder.Filmheroes=convertView.findViewById(R.id.Filmheroes);
            holder.Title=convertView.findViewById(R.id.Title);
            holder.Year=convertView.findViewById(R.id.year);
            convertView.setTag(holder);
        }
        else{
            holder= (Viewholder) convertView.getTag();
        }
        holder.Title.setText(movie.getTitle());

        holder.Author.setText(movie.getAuthor());
        holder.imageFilm.setBackgroundResource(movie.getResourseImage());
        holder.Filmheroes.setText(movie.getFilmHeroes());
        holder.Year.setText(movie.getYear());
        Result=convertView;
        return Result;
    }

    public static class Viewholder{
        ImageView imageFilm;
        TextView Title;
        TextView Author;
        TextView Filmheroes;
        TextView Year;
    }





}
