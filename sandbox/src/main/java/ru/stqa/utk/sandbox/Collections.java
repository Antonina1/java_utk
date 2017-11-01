package ru.stqa.utk.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tonya on 29.10.2017.
 */
public class Collections {
    public static void main (String[] args){
        String[] langs =  {"Java","C#","Python","PHP"};
        List<String> languages =  Arrays.asList("Java","C#","Python","PHP") ;

        for (int i =0; i < languages.size(); i++) //(int i=0; i< langs.length; i++)
        {
            System.out.println ("Я хочу выучить" + languages.get(i));
        }
    }
        }