package com.cybo.elementos;

import android.media.Image;
import java.util.ArrayList;

/**
 * Created by Ana on 2016-05-27.
 */
public abstract class Carta {

    private Image image;
    public ArrayList<String> connections  = new ArrayList<>();
    private int heat;
    private int offense;
    private int conscience;


    //TODO component to keep particles and rendering management for each card
    protected void activate(){

    }


    public Image getImage() {
        return image;
    }

    public Image setImage(Image g){
       this.image = g;
    }

    public int getHeat(){
        return heat;
    }

    public int setheat(int value){
         this.heat = value;
    }

}
