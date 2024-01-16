package com.example.planetsapp;

import android.media.Image;

public class Planet {

    //Attributes
    private String planetName;
    private String Mooncount;

    private  int planetimage;

    public Planet(String planetName,String mooncount,int planetimage){
        this.planetName = planetName;
        this.Mooncount = mooncount;
        this.planetimage = planetimage;
    }
    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return Mooncount;
    }

    public void setMoonCount(String moonCount) {
        this.Mooncount = moonCount;
    }

    public int getPlanetImage() {
        return planetimage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetimage = planetImage;
    }

}
