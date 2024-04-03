/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moviesdemo;

/**
 *
 * @author 4-11-7-hallgato
 */
public class Movie {
    private String film;
    private String genre;
    private String leadStudio;
    private int auddienceScore;
    private double profitability;
    private int rottenTomatoes;
    private double WordWideGross;
    private int year;
    
    //getter, setter, toString, konstruktor(paraméteres)

    public String getFilm() {
        return film;
    }

    public String getGenre() {
        return genre;
    }

    public String getLeadStudio() {
        return leadStudio;
    }

    public int getAuddienceScore() {
        return auddienceScore;
    }

    public double getProfitability() {
        return profitability;
    }

    public int getRottenTomatoes() {
        return rottenTomatoes;
    }

    public double getWordWideGross() {
        return WordWideGross;
    }

    public int getYear() {
        return year;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLeadStudio(String leadístudio) {
        this.leadStudio = leadístudio;
    }

    public void setAuddienceScore(int auddienceScore) {
        this.auddienceScore = auddienceScore;
    }

    public void setProfitability(double profitability) {
        this.profitability = profitability;
    }

    public void setRottenTomatoes(int rottenTomatoes) {
        this.rottenTomatoes = rottenTomatoes;
    }

    public void setWordWideGross(double WordWideGross) {
        this.WordWideGross = WordWideGross;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" + "film=" + film + ", genre=" + genre + ", lead\u00edstudio=" + leadStudio + ", auddienceScore=" + auddienceScore + ", profitability=" + profitability + ", rottenTomatoes=" + rottenTomatoes + ", WordWideGross=" + WordWideGross + ", year=" + year + '}';
    }
    //általános
    public Movie(String film, String genre, String leadístudio, int auddienceScore, double profitability, int rottenTomatoes, double WordWideGross, int year) {
        this.film = film;
        this.genre = genre;
        this.leadStudio = leadístudio;
        this.auddienceScore = auddienceScore;
        this.profitability = profitability;
        this.rottenTomatoes = rottenTomatoes;
        this.WordWideGross = WordWideGross;
        this.year = year;
    }
    
    //speckó
    public Movie(String line){
        String parts[]=line.split(",");
        film=parts[0].trim();
        genre=parts[1].trim(); 
        leadStudio=parts[2].trim(); 
        auddienceScore=Integer.parseInt(parts[3].trim()); 
        profitability=Double.parseDouble(parts[4].trim()); 
        rottenTomatoes=Integer.parseInt(parts[5].trim()); 
        String temp=parts[6].trim().substring(1);
        WordWideGross=Double.parseDouble(temp); 
        WordWideGross=Integer.parseInt(parts[7].trim()); 
    }
    
    
}
