package com.company;

import java.util.Arrays;

public class Farm {
    private  String addres;
    private Cow [] cows;
    private Horse []horses;
    private  Sheep[]sheep;
    private  String OwnerName;

    public Farm(String addres, Cow[] cows, Horse[] hourses, Sheep[] sheep, String ownerName) {
        this.addres = addres;
        this.cows = cows;
        this.horses = hourses;
        this.sheep = sheep;
        OwnerName = ownerName;
    }

    public String getAddres() {
        return addres;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "addres='" + addres + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", hourses=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheep) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}

