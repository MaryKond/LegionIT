package Parking;

public abstract class Vehicle {
    private String licencePlate;
    private String colour;
    private String type;


    public Vehicle(String plate,String carColour, String vehicleType ){
        this.licencePlate=plate;
        this.colour=carColour;
        this.type=vehicleType;
    }
    public String getLicencePlate() {
        return licencePlate;
    }
    public String getColour() {
        return colour;
    }
    public String getType() {
        return type;
    }

    public boolean canParkHere(){

        boolean canPark=true;
        return canPark;
    }

}
