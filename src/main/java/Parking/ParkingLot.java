package Parking;

public class ParkingLot {
    String spotSize;
    int spotId;

    public boolean spotTaken() {
        boolean spotTaken = true;
        System.out.println("Spot is taken");
        return spotTaken;
    }
    public boolean spotAvailable(){
        boolean spotAvailable=true;
        System.out.println("Spot is available");
        return spotAvailable;
    }

    }





