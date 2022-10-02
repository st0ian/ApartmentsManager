package com.baiStojen_TheApartments;

class Block extends Resident {

   static int totalAppartments;
   private final int appartmentsPerFloor =3;
   private int floors;

    Block(int floors) {
        this.floors = floors;
        if (floors>0 & floors<=12)
            this.totalAppartments = appartmentsPerFloor*floors;
        else
            System.out.println("The number of floors must be from 1 to 12");
    }

    public int getFloors() {
        return floors;
    }
    public int getTotalAppartments() {return totalAppartments;}
}


