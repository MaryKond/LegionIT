package Parking;

public class Car extends Vehicle {
    public Car(String plate,String carColour, String vehicleType ) {
        super(plate,carColour,vehicleType );
    }
    public boolean canParkHere() {
        String spotSize1="small";
        String spotSize2="large";
        String spotSize3="compact";

        if (spotSize3 == "compact" || spotSize2 == "large") {
            System.out.println("car can park here");
        } else {
            System.out.println("car can't park here");
        }

        return false;
    }
  }

