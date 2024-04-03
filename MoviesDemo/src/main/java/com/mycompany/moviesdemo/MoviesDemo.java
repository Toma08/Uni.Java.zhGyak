/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moviesdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 4-11-7-hallgato
 */
public class MoviesDemo {
    
    static List<Movie> movies =new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello World!");
        read("movies.csv");
        int foxdb=fox(movies);
        System.out.println("Fox stúdió által kiadott filmek száma:"+foxdb);
        bestGross(movies);
    }
    
    public static void bestGross(List<Movie> movies){
        int max=0;
        for(int i=0; i<movies.size(); i++){
            if(movies.get(i).getWordWideGross()>movies.get(max).getWordWideGross()){
                max=i;
            }
        }
        System.out.println("A legjobb bevételt elérő film:"+movies.get(max).getFilm());
    }
    
    public static int fox(List<Movie> movies){
        int count=0;
        for(Movie m: movies){
            if(m.getLeadStudio().equals("20th Century Fox")|| m.getLeadStudio().equals("Fox")){
                System.out.println(m.getFilm());
                count++;
            }
        }
        return count;
    }
    
    public static void read(String fileName){
        File file = new File(fileName);
        try {
            Scanner input =new Scanner(file);
            //fejlécre nincs szükségem
            input.nextLine();
            while(input.hasNextLine()){
                String line=input.nextLine();
                Movie movie=new Movie(line);
                movies.add(movie);
                //System.out.println(movie.toString());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("A megadott fájl nem található: "+fileName);
        }
    }
}
