package Parking;

public class Motorcycle extends Vehicle {
    public Motorcycle(String plate,String carColour, String vehicleType ) {
        super(plate,carColour,vehicleType );
    }
    public void canParkAnywhere(){
        System.out.println("Motorcycle is allowed to park anywhere");
    }
}
