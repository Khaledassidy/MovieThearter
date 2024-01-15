package com.example.moviethearter;

public class ModelClass {

    private String Title;
    private String Author;
    private String FilmHeroes;
    private String Year;
    private int ResourseImage;

    public ModelClass(String title, String author, String filmHeroes, String year, int resourseImage) {
        Title = title;
        Author = author;
        FilmHeroes = filmHeroes;
        Year = year;
        ResourseImage = resourseImage;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getFilmHeroes() {
        return FilmHeroes;
    }

    public void setFilmHeroes(String filmHeroes) {
        FilmHeroes = filmHeroes;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public int getResourseImage() {
        return ResourseImage;
    }

    public void setResourseImage(int resourseImage) {
        ResourseImage = resourseImage;
    }
}
