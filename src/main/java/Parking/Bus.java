package Parking;


    public class Bus extends Vehicle {
        public Bus(String plate, String carColour, String vehicleType) {
            super(plate, carColour, vehicleType);
        }

        public void canParkAnywhere() {
            System.out.println("Bus can park in 5 large spots in a row");
        }

    }


