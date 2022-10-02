package com.baiStojen_TheApartments;

class Resident extends Apartment {

final int maxResidentsPerApartment = 4;
private String name;
private int iD;
private static int totalResidents;
private String [] residents = new String[Block.totalAppartments*maxResidentsPerApartment]; //zashto ne moga da vikna Block.getTotalApartments ??

    public Resident(){

    }
    public Resident (int iD,String name) {
    this.iD = iD;
    this.name=name;

    addResident();
    }

    public static void addResident (){
       totalResidents++;
    }
    public static void removeResident (){totalResidents--;}
    public static int getTotalResidents(){
        return totalResidents;
    }
    public int getiD() {
        return iD;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setiD(int iD) {

    }
}
